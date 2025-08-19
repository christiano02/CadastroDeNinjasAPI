package dev.java10x.CadastroDeNinjas.ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    //criar ninja (Create)
    @PostMapping("/criar")
    public NinjaModel criarNinja(@RequestBody NinjaModel ninjaModel){
        return ninjaService.criarNinja(ninjaModel);
    }
    //mostrar todos os ninjas(read)
    @GetMapping("/listar_todos")
    public List<NinjaModel> listarNinjas(){
        return ninjaService.listarNinjas();
    }
    //mostrar ninja por id (read)
    @GetMapping("/listar/{id}")
    public NinjaModel mostrarTodosNinjaPorId(@PathVariable Long id){
    return ninjaService.listarNinjasPorId(id);
    }

    //modificar um ninja (update)
    @PutMapping("/alterartodosporId")
    public String alterar(){
        return "alterar todos por id";
    }

    //deletar  (delete)
    @DeleteMapping("/deletarporid/{id}")
    public void deletar(@PathVariable Long id){
        ninjaService.detetarNinjaPorId(id);
    }
}
