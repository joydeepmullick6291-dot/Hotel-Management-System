package com.hotelmanagement.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class UserRegistrationDTO {
    @NotBlank(message="Username is required") @Size(min=3,max=50) private String username;
    @NotBlank(message="Email is required") @Email private String email;
    @NotBlank(message="Password is required") @Size(min=6,message="Password must be at least 6 characters") private String password;
    @NotBlank private String firstName;
    @NotBlank private String lastName;
    private String phoneNumber;
    public UserRegistrationDTO(){}
    public UserRegistrationDTO(String username,String email,String password,String firstName,String lastName,String phoneNumber){this.username=username;this.email=email;this.password=password;this.firstName=firstName;this.lastName=lastName;this.phoneNumber=phoneNumber;}
    public String getUsername(){return username;} public void setUsername(String v){username=v;}
    public String getEmail(){return email;} public void setEmail(String v){email=v;}
    public String getPassword(){return password;} public void setPassword(String v){password=v;}
    public String getFirstName(){return firstName;} public void setFirstName(String v){firstName=v;}
    public String getLastName(){return lastName;} public void setLastName(String v){lastName=v;}
    public String getPhoneNumber(){return phoneNumber;} public void setPhoneNumber(String v){phoneNumber=v;}
}