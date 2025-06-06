package com.oscar.springboot.almacen.springboot_api.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.oscar.springboot.almacen.springboot_api.models.User;
import com.oscar.springboot.almacen.springboot_api.models.dto.UserDto;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/usuarios")
    public UserDto details() {

        UserDto userDto = new UserDto();        
        User user = new User("Oscar", "Clemente");

        userDto.setUser(user);
        userDto.setTitle("Hola Mundo Spring boot");

        return userDto;
    }

    @GetMapping("/usuarios-map")
    public Map<String, Object> detailsMap() {

        User user = new User("Oscar", "Clemente");

        Map<String, Object> body = new java.util.HashMap<>();

        body.put("title", "Hola Mundo");
        body.put("user", user);        

        return body;
    }
    

}
