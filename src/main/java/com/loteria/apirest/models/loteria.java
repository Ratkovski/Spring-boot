package com.loteria.apirest.models;
import com.loteria.apirest.numerosort;
import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;


@Entity //entidade do banco de dados
@Table(name = "TB_LOTERIA")// personaliza o nome da tabela para o banco de dados
public class loteria implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)  // @ o id irá ser autoincrement
    private long id;
    @Size(min = 7, max = 100)// determina o tamanho do e-mail
    private String email;
    private String numeros = new numerosort().GerarNumero();


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumeros() {
        return numeros;
    }

    public void setNumeros(String numeros) {
        this.numeros = numeros;
    }
}
















