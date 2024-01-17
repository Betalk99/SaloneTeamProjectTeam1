package com.team1.Salone.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {

    private Long id;
    private String name;
    private String surname;
    private String email;
    private String psw;



}
