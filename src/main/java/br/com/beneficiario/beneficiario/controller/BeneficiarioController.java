package br.com.beneficiario.beneficiario.controller;

import br.com.beneficiario.beneficiario.modelo.Beneficiario;
import br.com.beneficiario.beneficiario.modelo.Documento;
import br.com.beneficiario.beneficiario.service.BeneficiarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/beneficiarios")
public class BeneficiarioController {


    @Autowired
    private BeneficiarioService service;

    @GetMapping
    //Listar todos os bendeficarios cadastrados
    public List<Beneficiario> listar(){
        return service.findAll();
    }

    @PostMapping
    //Cadastrar um beneficiario junto com os seus documentos
    public void cadastrar(@RequestBody Beneficiario b1){
        service.save(b1);
    }

    @DeleteMapping("/{id}")
    //Remover um beneficiario
    public void deletar(@PathVariable Long id){
        service.delete(id);
    }

    @GetMapping("/{id}")
    //Listar todos os documentos de um beneficiário a partir de seu id;
    public List<Documento> ler(@PathVariable Long id){
        return service.findOne(id).getDocumento();
    }

    @PutMapping("/{id}")
    //Atualizar os dados cadastrais de um beneficiário;
    public void alterar(@RequestBody Beneficiario b1){
        service.save(b1);
    }

}
