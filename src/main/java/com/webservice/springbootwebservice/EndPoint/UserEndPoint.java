package com.webservice.springbootwebservice.EndPoint;

import com.webservice.spring_boot_webservice.GetUserRequest;
import com.webservice.spring_boot_webservice.GetUserResponse;
import com.webservice.springbootwebservice.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class UserEndPoint {

    @Autowired
    private UserService userService;

    @PayloadRoot(namespace = "http://webservice.com/spring-boot-webservice",
    localPart = "getUserRequest")
    @ResponsePayload
    public GetUserResponse getUserRequest(@RequestPayload GetUserRequest request){
        GetUserResponse response = new GetUserResponse();
        response.setUser(userService.getUser(request.getName()));
        return response;
    }
}
