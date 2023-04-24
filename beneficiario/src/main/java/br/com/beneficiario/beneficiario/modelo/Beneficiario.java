package br.com.beneficiario.beneficiario.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Beneficiario {

    @Id
    private Long id;
    private String nome;
    private String telefone;
    private String dataNascimento;
    private Date dataInclusao;
    private Date dataAtualizacao;


}
