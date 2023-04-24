package br.com.beneficiario.beneficiario.repositorio;

import br.com.beneficiario.beneficiario.modelo.Beneficiario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BeneficiarioRepositorio extends JpaRepository<Beneficiario,Long> {
}
