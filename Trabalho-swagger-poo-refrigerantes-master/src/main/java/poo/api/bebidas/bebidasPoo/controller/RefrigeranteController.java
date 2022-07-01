package poo.api.bebidas.bebidasPoo.controller;

import java.util.List;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import poo.api.bebidas.bebidasPoo.forms.AtualizarRefrigeranteForm;
import poo.api.bebidas.bebidasPoo.model.Refrigerante;
import poo.api.bebidas.bebidasPoo.repository.RefrigeranteRepository;

@RequestMapping("/refrigerantes")
@Api(value = "refrigerantes")
@RestController
public class RefrigeranteController {

    @Autowired
    RefrigeranteRepository refrigeranteRepository;

    @ApiOperation(value = "Retorna lista de refrigerantes")
    @GetMapping
    public List<Refrigerante> listarRefrigerantes(){
        return refrigeranteRepository.findAll();
    }

    @ApiOperation(value = "Cadastra refrigerante")
    @PostMapping
    public Refrigerante adicionaRefrigerante(@RequestBody Refrigerante refrigerante){
        return refrigeranteRepository.save(refrigerante);
    }

    @ApiOperation(value = "Deleta refrigerante")
    @DeleteMapping("/{id}")
    public List<Refrigerante> removerRefrigerante(@PathVariable Long id){
        refrigeranteRepository.deleteById(id);
        return refrigeranteRepository.findAll();
    }

    @ApiOperation(value = "Atualiza refrigerante")
    @PutMapping("/{id}")
    public ResponseEntity<Refrigerante> atualizarRefrigerante(@PathVariable Long id, @RequestBody AtualizarRefrigeranteForm refrigeranteForm){
        Refrigerante refrigerante = refrigeranteForm.atualizar(id, refrigeranteRepository);
        return ResponseEntity.ok(refrigerante);
    }

}
