package org.risotto.rest;

import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.eclipse.jetty.webapp.WebAppContext;

public class JettyLauncherRestApi {

    public static void main(String[] args) throws Exception {
        int port = 8090;
        String contextPath = "/crm-rest-api";
        String stage = "u";
        //System.setProperty("log4jConfigLocation", "classpath:log4j-crm-rest-api.xml");

        //System.out.println("Preparing to start embedded Jetty for " + contextPath + " on port " + port + ", stage is " + stage + "...");

        //System.setProperty("stage.status", stage);

        Server server = new Server(port);

        WebAppContext context = new WebAppContext();
        context.setResourceBase("src/main/webapp");
        context.setContextPath(contextPath);
        context.setParentLoaderPriority(true);

        server.setHandler(context);

        server.start();
        server.join();
    }

}
