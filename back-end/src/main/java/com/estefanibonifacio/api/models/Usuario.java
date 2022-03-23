package com.estefanibonifacio.api.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity // Pra dizer quer é uma estrutura de dados
public class Usuario {
    @Id // primary key, chave primária da tabela
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto incremento
    private Long id;
    private String nome;
    private String email;
    private String senha;
    private String urlAvatar;

    public Usuario() {
    }
    public Usuario(String nome, String email, String senha, String urlAvatar) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.urlAvatar = urlAvatar;
    }
    public Usuario(Usuario usuario) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.urlAvatar = urlAvatar;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
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
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getUrlAvatar() {
        return urlAvatar;
    }
    public void setUrlAvatar(String urlAvatar) {
        this.urlAvatar = urlAvatar;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Usuario other = (Usuario) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }
    
    
}
