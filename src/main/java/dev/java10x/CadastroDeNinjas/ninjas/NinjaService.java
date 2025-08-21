package dev.java10x.CadastroDeNinjas.ninjas;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class NinjaService {

    private final NinjaMapper ninjaMapper;
    private final NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository, NinjaMapper ninjaMapper) {
        this.ninjaRepository = ninjaRepository;
        this.ninjaMapper = ninjaMapper;
    }

    //Listar todos os ninjas
    public List<NinjaDTO> listarNinjas(){
        List<NinjaModel> ninjaModelList = ninjaRepository.findAll();
        return ninjaModelList.stream()
                .map(ninjaMapper::map)
                .collect(Collectors.toList());
    }

    //listar todos os ninjas por ID
    public NinjaDTO listarNinjasPorId(Long id) {
        Optional<NinjaModel> ninjaModel = ninjaRepository.findById(id);
        return ninjaModel.map(ninjaMapper::map).orElse(null);
    }
        //endpoint para criar Ninjas
        public NinjaDTO criarNinja (NinjaDTO ninjaDTO){
            NinjaModel ninjaModel = ninjaMapper.map(ninjaDTO);
            ninjaModel = ninjaRepository.save(ninjaModel);
            return ninjaMapper.map(ninjaModel);
        }


        //Delete ninja
        public void detetarNinjaPorId (Long id){
            ninjaRepository.deleteById(id);
        }

        //EDITARAR NINJA
        public NinjaDTO UpdateNinja (Long id, NinjaDTO novoNinja) {
            Optional<NinjaModel> ninja = ninjaRepository.findById(id);
            if (ninja.isPresent()) {
                NinjaModel ninjaModel = ninjaMapper.map(novoNinja);
                ninjaModel.setId(id);
                NinjaModel ninjaSave = ninjaRepository.save(ninjaModel);
                return ninjaMapper.map(ninjaSave);
            }
            return null;
        }
}


