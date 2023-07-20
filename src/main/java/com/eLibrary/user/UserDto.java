package com.eLibrary.user;

import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@JsonAutoDetect(fieldVisibility = ANY)
@Getter
@Setter
@AllArgsConstructor
class UserDto {

    Long id;
    String name;
    String password;
}