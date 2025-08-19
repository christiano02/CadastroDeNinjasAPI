package dev.java10x.CadastroDeNinjas.missoes;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MissoesServices {

    private final MissoesRepository missoesRepository;

    public MissoesServices(MissoesRepository missoesRepository) {
        this.missoesRepository = missoesRepository;
    }

    public List<MissoesModel> listarMissoes(){
        return missoesRepository.findAll();
    }
    public MissoesModel listarMissoesPorId(Long id){
        Optional<MissoesModel> missoesModel = missoesRepository.findById(id);
        return missoesModel.orElse(null);
    }
    public MissoesModel criarMissao(MissoesModel model){
        return missoesRepository.save(model);
    }
    public MissoesModel alterarMissao(Long id, MissoesModel model){
        MissoesModel missoesModel = missoesRepository.findById(id).orElse(null);
        missoesModel.setName(model.getName());
        missoesModel.setRank(model.getRank());
        return missoesRepository.save(missoesModel);
    }
}
