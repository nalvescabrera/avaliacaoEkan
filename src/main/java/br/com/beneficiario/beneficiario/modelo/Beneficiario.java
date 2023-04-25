package br.com.beneficiario.beneficiario.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Beneficiario{

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String nome;
    private String telefone;
    private String dataNascimento;
    private LocalDate dataInclusao = LocalDate.now();
    private LocalDate dataAtualizacao = LocalDate.now();
    @OneToMany(cascade=CascadeType.PERSIST)
    private List<Documento> documento;

}
