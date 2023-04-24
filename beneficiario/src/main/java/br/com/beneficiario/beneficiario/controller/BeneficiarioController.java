package br.com.beneficiario.beneficiario.controller;


import br.com.beneficiario.beneficiario.modelo.Beneficiario;
import br.com.beneficiario.beneficiario.repositorio.BeneficiarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/beneficiarios")
public class BeneficiarioController {

    @Autowired
    private BeneficiarioRepositorio beneficiarioRepositorio;

    @GetMapping
    public List<Beneficiario> listar(){
        return beneficiarioRepositorio.findAll();
    }

    @PostMapping
    public void cadastrar(@RequestBody Beneficiario b1){
        beneficiarioRepositorio.save(b1);
    }

//    @PutMapping
//    public void alterar(RequestBody Beneficiario beneficiario){
//        beneficiarioRepositorio.save(beneficiario);
//    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        beneficiarioRepositorio.deleteById(id);
    }

    @GetMapping("/{id}")
    public Optional<Beneficiario> ler(@PathVariable Long id){
         return beneficiarioRepositorio.findById(id);
    }

    public Date FormatData(){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date dataHoraAtual = new Date();
        try {
            dataHoraAtual = formatter.parse("24/07/2020 03:14:06");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return dataHoraAtual;
    }

}
