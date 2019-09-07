package edu.csumb.sp19.cst438.mbari.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "divers")

public class Diver{
    private String firstName;
    private String lastName;
  @Id  private String email;
    private String birthDate;
    private String mobile;
    private String alternativeMobile;
    private String other;

    public Diver(String firstName, String lastName, String email, 
    String birthDate, String mobile, String altrnativeMobile, String other){
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setEmail(email);
        this.setBirthDate(birthDate);
        this.setMobile(mobile);
        this.setAlternativeMobile(alternativeMobile);
        this.setOther(other);
    }

    public Diver(){
        
    }

    public String getFirstName() {
        return firstName;
    }

   
    public String getOther() {
        return other;
    }

    
    public void setOther(String other) {
        this.other = other;
    }

    
    public String getAlternativeMobile() {
        return alternativeMobile;
    }

    
    public void setAlternativeMobile(String alternativeMobile) {
        this.alternativeMobile = alternativeMobile;
    }

    
    public String getMobile() {
        return mobile;
    }

    
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    
    public String getBirthDate() {
        return birthDate;
    }

    
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    
    public String getEmail() {
        return email;
    }

    
    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}