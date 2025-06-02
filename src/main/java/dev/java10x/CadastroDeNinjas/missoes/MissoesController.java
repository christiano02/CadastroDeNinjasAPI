package dev.java10x.CadastroDeNinjas.missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/missoes")
public class MissoesController {

    //Get: mandar requisição para listar missoes
    @GetMapping("/listar_missoes")
    public String listarMissoes(){
        return "missoes listadas";
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
