package dev.java10x.CadastroDeNinjas.ninjas;

import dev.java10x.CadastroDeNinjas.missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="/tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class NinjaModel {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(unique = true)
    private String email;

    @Column(name="imgUrl")
    private String imgUrl;

    @Column(name = "age")
    private int age;

    //ManyToOne um ninja tem uma unica missão
    @ManyToOne
    @JoinColumn(name="missoes_id") //foreing key ou chave estrangeira
    private MissoesModel missoes;


}
