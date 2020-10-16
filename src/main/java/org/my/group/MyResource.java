package org.my.group;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.my.group.service.Service;

@Path("/hello")
public class MyResource {

    private final Service<String> stringService;

    public MyResource(Service<String> stringService) {
        this.stringService = stringService;
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return stringService.accept("hello");
    }
}