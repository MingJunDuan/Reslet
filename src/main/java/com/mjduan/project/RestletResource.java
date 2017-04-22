package com.mjduan.project;

import org.restlet.resource.Delete;
import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

/**
 * Reference:http://javarevisited.blogspot.sg/2016/10/restlet-helloworld-example-in-java-and-Eclipse.html
 *
 * Created by duan on 2017/4/21.
 */
public class RestletResource extends ServerResource {

    @Get
    public String hello(){
        System.out.println("hello method");
        return "Hello in Reslet, this is GET method";
    }

    @Delete
    public void bye(){
        System.out.println("Bye bye, delete method called");
    }

}
