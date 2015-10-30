package org.risotto.rest.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/")
public class CRMResource {

    @GET
    @Path("all")
    @Produces("application/json")
    public Response get() {
        return Response.ok("ok").build();
    }


}
