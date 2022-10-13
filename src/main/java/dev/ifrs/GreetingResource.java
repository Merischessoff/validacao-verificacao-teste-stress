package dev.ifrs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.faulttolerance.Bulkhead;

@Path("/hello")
public class GreetingResource {

    @GET
    @Path("/{vu}")
    @Produces(MediaType.TEXT_PLAIN)
    //@Bulkhead(2)
    public void hello(@PathParam("vu") String vu) {
        System.out.println(vu);
    }
}