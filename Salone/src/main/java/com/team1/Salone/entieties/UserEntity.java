package com.team1.Salone.entieties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {

    private Long id;
    private String nome;
    private String cognome;
    private String email;
    private String psw;



}
