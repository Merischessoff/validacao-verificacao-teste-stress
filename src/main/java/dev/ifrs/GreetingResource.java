package dev.ifrs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.faulttolerance.Asynchronous;
import org.eclipse.microprofile.faulttolerance.Bulkhead;

import io.smallrye.mutiny.Uni;

@Path("/hello")
public class GreetingResource {

    @GET
    @Path("/{vu}")
    @Produces(MediaType.TEXT_PLAIN)
    @Asynchronous
    @Bulkhead(value = 5, waitingTaskQueue = 100)
    public Uni<Void> hello(@PathParam("vu") String vu) {
        System.out.println(vu);
        return null;
    }
}