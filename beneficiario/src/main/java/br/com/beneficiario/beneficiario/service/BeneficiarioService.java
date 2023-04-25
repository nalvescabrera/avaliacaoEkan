package br.com.beneficiario.beneficiario.service;

import br.com.beneficiario.beneficiario.modelo.Beneficiario;
import br.com.beneficiario.beneficiario.repositorio.BeneficiarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BeneficiarioService {

    @Autowired
    private BeneficiarioRepositorio repository;


    public List<Beneficiario> findAll()
    {
        return repository.findAll();
    }

    public Beneficiario save(Beneficiario type)
    {
        return repository.save(type);
    }

    public void delete(Long id)
    {
        repository.deleteById(id);
    }

    public Beneficiario findOne(Long id)
    {
        return repository.findById(id).get();
    }

    private Beneficiario update(Beneficiario type)
    {
        return repository.save(type);
    }


}
