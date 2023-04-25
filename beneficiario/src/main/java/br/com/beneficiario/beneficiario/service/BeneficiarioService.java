package br.com.beneficiario.beneficiario.service;

import br.com.beneficiario.beneficiario.modelo.Beneficiario;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class BeneficiarioService {

    private List<Beneficiario> beneficiarios;


    public void createBeneficiarioList() {
        if(beneficiarios == null) {
            beneficiarios = new ArrayList<>();
        }
    }

    public boolean isJSONValid(String jsonInString) {
        try {
            return new ObjectMapper().readTree(jsonInString) != null;
        } catch (IOException e) {
            return false;
        }
    }

}
