package br.com.beneficiario.beneficiario.controller;


import br.com.beneficiario.beneficiario.modelo.Beneficiario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


@RestController
@RequestMapping("/beneficiarios")
public class BeneficiarioController {

    @GetMapping
    public Beneficiario getInfo(){

        Beneficiario b1 = new Beneficiario();
        b1.setNome("Natalia");
        b1.setTelefone("998096267");
        b1.setDataNascimento("03/02/1994");
        b1.setDataInclusao(FormatData());
        b1.setDataAtualizacao(FormatData());
        return b1;
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
