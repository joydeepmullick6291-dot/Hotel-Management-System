package com.hotelmanagement.dto;

import jakarta.validation.constraints.NotBlank;
public class UserLoginDTO {
 @NotBlank(message="Username is required") private String username;
 @NotBlank(message="Password is required") private String password;
 public UserLoginDTO(){} public UserLoginDTO(String username,String password){this.username=username;this.password=password;}
 public String getUsername(){return username;} public void setUsername(String v){username=v;}
 public String getPassword(){return password;} public void setPassword(String v){password=v;}
}