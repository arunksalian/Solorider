package com.example.demo.config;

import com.example.demo.endpoint.UserService;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

/**
 * Created by c1xadmin on 13-06-2017.
 */
@Component
public class AppConfiguration extends ResourceConfig {
    public AppConfiguration () {
        register(UserService.class);
    }
}
