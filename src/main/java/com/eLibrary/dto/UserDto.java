package com.eLibrary.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Getter;
import lombok.Setter;

import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.*;

@JsonAutoDetect(fieldVisibility = ANY)
@Getter
@Setter
public class UserDto {

    Long id;
    String name;
    String password;

    public UserDto(Long id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }
}