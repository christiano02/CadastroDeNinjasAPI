package dev.java10x.CadastroDeNinjas.missoes;

import dev.java10x.CadastroDeNinjas.ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "\tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private Character rank;

    //OneToMany uma missao para varios ninjas
    @Column
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjaModel;

    public MissoesModel() {
    }

    public MissoesModel(Long id, String name, List<NinjaModel> ninjaModel, Character rank) {
        this.id = id;
        this.name = name;
        this.ninjaModel = ninjaModel;
        this.rank = rank;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<NinjaModel> getNinjaModel() {
        return ninjaModel;
    }

    public void setNinjaModel(List<NinjaModel> ninjaModel) {
        this.ninjaModel = ninjaModel;
    }

    public Character getRank() {
        return rank;
    }

    public void setRank(Character rank) {
        this.rank = rank;
    }
}
