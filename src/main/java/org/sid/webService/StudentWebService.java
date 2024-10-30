package org.sid.webService;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import org.sid.models.Students;

import java.util.List;

@WebService(serviceName = "StudentWebService")
public class StudentWebService {
    @WebMethod(operationName = "IncrementAge")
    public double ageIncrement(@WebParam(name = "age") int age){
        return age+1;
    }

    @WebMethod(operationName = "getName")
    public String getName(@WebParam(name = "code" ) int code){
        return "name temp";
    }

    @WebMethod(operationName = "getStudent")
    public Students getStudent(){
        return new Students(" Ahmad", 0, 18, 16);
    }

    @WebMethod(operationName = "ListStudents")
    public List<Students> ListStudents(){
        return List.of(
                new Students(" Mohamed", 1, 18, 16),
                new Students(" Ali", 2, 18, 16),
                new Students(" Samir", 3, 18, 16),
                new Students(" Noura", 4, 18, 16),
                new Students(" Siham", 5, 18, 16)
        );
    }
}
