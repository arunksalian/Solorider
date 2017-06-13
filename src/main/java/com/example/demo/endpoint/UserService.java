package com.example.demo.endpoint;

import org.springframework.stereotype.Component;

import javax.ws.rs.Path;

/**
 * Created by c1xadmin on 13-06-2017.
 */
@Component
@Path("/user")
public class UserService {
    public String getUser () {
        return "hii";
    }
}
