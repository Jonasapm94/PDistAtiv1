package br.edu.ifpb.progdist.hellospring.model;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Usuario {
    private int codigo;
    private String nome;
    private int idade;

    
}
