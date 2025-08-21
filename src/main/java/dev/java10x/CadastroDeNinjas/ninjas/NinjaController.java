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
    public NinjaDTO criarNinja(@RequestBody NinjaDTO ninjaDTO){
        return ninjaService.criarNinja(ninjaDTO);
    }
    //mostrar todos os ninjas(read)
    @GetMapping("/listar_todos")
    public List<NinjaDTO> listarNinjas(){
        return ninjaService.listarNinjas();
    }
    //mostrar ninja por id (read)
    @GetMapping("/listar/{id}")
    public NinjaDTO mostrarTodosNinjaPorId(@PathVariable Long id){
    return ninjaService.listarNinjasPorId(id);
    }

    //modificar um ninja (update)
    @PutMapping("/alterartodosporId/{id}")
    public NinjaDTO alterar(@PathVariable Long id, @RequestBody NinjaDTO novoNinja){
        return ninjaService.UpdateNinja(id, novoNinja);
    }

    //deletar  (delete)
    @DeleteMapping("/deletarporid/{id}")
    public void deletar(@PathVariable Long id){
        ninjaService.detetarNinjaPorId(id);
    }
}
