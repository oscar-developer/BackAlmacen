package com.oscar.springboot.almacen.springboot_api.models.dto;

import com.oscar.springboot.almacen.springboot_api.models.User;

public class UserDto {
    private String title;    
    private User user;
    
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
}
