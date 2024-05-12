package com.example.bankdemo.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class Customer {
    private String email;
    private String pwd;
    private String role;

}
