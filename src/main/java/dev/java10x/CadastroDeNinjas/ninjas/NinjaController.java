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

    @GetMapping("/listar")
    public String exemplo(){
        return "Olá";
    }
    //criar ninja (Create)
    @PostMapping("/criar")
    public String criar(){
        return "ninja criado";
    }
    //mostrar todos os ninjas(read)
    @GetMapping("/listar_todos")
    public List<NinjaModel> listarNinjas(){
        return ninjaService.listarNinjas();
    }
    //mostrar ninja por id (read)
    @GetMapping("/todosporid")
    public String mostrarTodosPorId(){
    return "mostrar";
    }
    //modificar um ninja (update)
    @PutMapping("/alterartodosporId")
    public String alterar(){
        return "alterar todos por id";
    }

    //deletar  (delete)
    @DeleteMapping("/deletarporid")
    public String deletar(){
        return "deletado";
    }
}
