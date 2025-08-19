package dev.java10x.CadastroDeNinjas.missoes;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/missoes")
public class MissoesController {

    private final MissoesServices missoesServices;

    public MissoesController(MissoesServices missoesServices) {
        this.missoesServices = missoesServices;
    }

    //Get: mandar requisição para listar missoes
    @GetMapping("/listarMissoes")
    public List<MissoesModel> listarMissoes(){
        return missoesServices.listarMissoes();
    }

    //Post: mandar requisições para o usuario criar missoes
    @PostMapping("/criar")
    public String criarMissao(){
        return "missão criada";
    }

    //Put: mandar requissições para atualizar missoes
    @PutMapping("/alterar")
    public String alterarMissao(){
        return "missao alterada";
    }

    //Delete: mandar requisições para deletar missões
    @DeleteMapping("/deletar")
    public String deletarMissao(){
        return "Missao deletada";
    }

}
