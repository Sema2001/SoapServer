package org.sid.server;

import jakarta.xml.ws.Endpoint;
import org.sid.webService.StudentWebService;

public class SoapServer {
    public static void main(String[] args) {

        String url = "http://localhost:9090/";
        Endpoint.publish(url, new StudentWebService());
        System.out.println("deployed " + url);
    }
}
