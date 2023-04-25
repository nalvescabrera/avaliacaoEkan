package br.com.beneficiario.beneficiario.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Documento {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long idDocumento;
    private String tipoDocumento;
    private String descricao;
    private LocalDate dataInclusao = LocalDate.now();
    private LocalDate dataAtualizacao = LocalDate.now();
}
