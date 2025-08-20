package dev.java10x.CadastroDeNinjas.ninjas;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    private final NinjaMapper ninjaMapper;
    private final NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository, NinjaMapper ninjaMapper) {
        this.ninjaRepository = ninjaRepository;
        this.ninjaMapper = ninjaMapper;
    }

    //Listar todos os ninjas
    public List<NinjaModel> listarNinjas(){
        return ninjaRepository.findAll();
    }

    //listar todos os ninjas por ID
    public NinjaModel listarNinjasPorId(Long id){
        Optional<NinjaModel> ninjaModel = ninjaRepository.findById(id);
        return ninjaModel.orElse(null);
    }

    //endpoint para criar Ninjas
    public NinjaDTO criarNinja(NinjaDTO ninjaDTO){
        NinjaModel ninjaModel = ninjaMapper.map(ninjaDTO);
        ninjaModel = ninjaRepository.save(ninjaModel);
        return ninjaMapper.map(ninjaModel);
    }


    //Delete ninja
    public void detetarNinjaPorId(Long id){
        ninjaRepository.deleteById(id);
    }
    public NinjaModel UpdateNinja(Long id, NinjaModel novoNinja){

       NinjaModel ninja = ninjaRepository.findById(id).orElse(null);

       ninja.setName(novoNinja.getName());

       NinjaModel updateNinja = ninjaRepository.save(ninja);
       return updateNinja;
    }
}

