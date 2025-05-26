package dev.java10x.CadastroDeNinjas.ninjaModel;

import jakarta.persistence.*;

@Entity
@Table(name="/tb_cadastro")
public class NinjaModel {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private int age;

    public NinjaModel(){
    }

    public NinjaModel(String name, String email, int age){
        this.name = name;
        this.email = email;
        this.age = age;
    }

}
