package dev.java10x.CadastroDeNinjas.ninjas;

import dev.java10x.CadastroDeNinjas.missoes.MissoesModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="/tb_cadastro")
public class NinjaModel {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    private int age;

    //ManyToOne um ninja tem uma unica missão
    @ManyToOne
    @JoinColumn(name="missoes_id") //foreing key ou chave estrangeira
    private MissoesModel missoesModel;

    public NinjaModel(){
    }

    public NinjaModel(String name, String email, int age){
        this.name = name;
        this.email = email;
        this.age = age;
    }

}
