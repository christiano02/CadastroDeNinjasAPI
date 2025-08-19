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
    //Get: mandar requisição para listar missoes por id
    @GetMapping("listarMissoesPorId/{id}")
    public MissoesModel listarMissaoPorId(@PathVariable Long id){
        return missoesServices.listarMissoesPorId(id);
    }
    //Post: mandar requisições para o usuario criar missoes
    @PostMapping("/criar")
    public MissoesModel criarMissao(@RequestBody MissoesModel model){
        return missoesServices.criarMissao(model);
    }

    //Put: mandar requissições para atualizar missoes
    @PutMapping("/alterar/{id}")
    public MissoesModel alterarMissao(@PathVariable Long id, @RequestBody MissoesModel model){
        return missoesServices.alterarMissao(id, model);
    }

    //Delete: mandar requisições para deletar missões
    @DeleteMapping("/deletar")
    public String deletarMissao(){
        return "Missao deletada";
    }

}
