package br.com.beneficiario.beneficiario.repositorio;

import br.com.beneficiario.beneficiario.modelo.Documento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentoRepositorio extends JpaRepository<Documento,Long> {
}
