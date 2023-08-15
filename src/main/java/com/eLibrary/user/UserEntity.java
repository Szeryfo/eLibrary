package com.eLibrary.user;

import static jakarta.persistence.GenerationType.IDENTITY;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "user")
@Setter
@Getter
class UserEntity {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    Long id;

    String name;
    String password;
}