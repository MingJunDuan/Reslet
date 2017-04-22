package com.mjduan.project;

import org.restlet.Server;
import org.restlet.data.Protocol;

/**
 * Reference:http://javarevisited.blogspot.sg/2016/10/restlet-helloworld-example-in-java-and-Eclipse.html
 *
 * Created by duan on 2017/4/21.
 */
public class ResletServer {

    //  http://localhost:8080
    public static void main(String[] args) throws Exception {
        Server server = new Server(Protocol.HTTP, 8080, RestletResource.class);
        server.start();
    }

}
