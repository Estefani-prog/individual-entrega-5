package entregafinal.forrester.models;

import java.util.Map;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

import entregafinal.forrester.util.DateUtil;

@Entity
public class Suporte {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idContato;
    private String nome;
    private String email;
    private String mensagem;
    

    public Suporte() {
    }

    public Suporte(String nome, String email, String mensagem) {
        this.nome = nome;
        this.email = email;
        this.mensagem = mensagem;
    }

    public Long getIdContato() {
        return idContato;
    }

    public void setIdContato(Long idContato) {
        this.idContato = idContato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Map<String, ?> getId() {
        return null;
    }

    

    

}
