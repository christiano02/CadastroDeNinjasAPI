package dev.java10x.CadastroDeNinjas.missoes;

import java.util.List;

public class MissoesServices {

    private final MissoesRepository missoesRepository;

    public MissoesServices(MissoesRepository missoesRepository) {
        this.missoesRepository = missoesRepository;
    }

    public List<MissoesModel> listarMissoes(){
        return missoesRepository.findAll();
    }

}
