package com.eLibrary.model;

import lombok.Value;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Value
public class User {

    @Id
    Long id;

    String name;
    String password;
}