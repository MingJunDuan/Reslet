package com.mjduan.project;

import org.restlet.resource.ClientResource;

import java.io.IOException;

/**
 * Reference:http://javarevisited.blogspot.sg/2016/10/restlet-helloworld-example-in-java-and-Eclipse.html
 *
 * Created by duan on 2017/4/21.
 */
public class RestletClient {

    public static void main(String[] args) throws IOException {
        ClientResource clientResource = new ClientResource("http://localhost:8080");
        clientResource.get().write(System.out);
    }

}
