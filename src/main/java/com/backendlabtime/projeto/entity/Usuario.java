package com.backendlabtime.projeto.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "TB_USUARIO")
public class Usuario {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nomeCompleto;

    private String nomeSocial;

    private String dataDeNascimento;

    private int codigo;

    private String sexo;

    private String email;

    private String estado;

    private String municipio;

    private int numeroDeAcessosAoCurso;

    private String situacaoNoCurso;

    private String dataDeVinculo;

    public Usuario(Long id, String nomeCompleto, String nomeSocial, String dataDeNascimento, int codigo, String sexo, String email, String estado, String municipio, int numeroDeAcessosAoCurso, String situacaoNoCurso, String dataDeVinculo) {
        this.id = id;
        this.nomeCompleto = nomeCompleto;
        this.nomeSocial = nomeSocial;
        this.dataDeNascimento = dataDeNascimento;
        this.codigo = codigo;
        this.sexo = sexo;
        this.email = email;
        this.estado = estado;
        this.municipio = municipio;
        this.numeroDeAcessosAoCurso = numeroDeAcessosAoCurso;
        this.situacaoNoCurso = situacaoNoCurso;
        this.dataDeVinculo = dataDeVinculo;
    }

    public Usuario() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getNomeSocial() {
        return nomeSocial;
    }

    public void setNomeSocial(String nomeSocial) {
        this.nomeSocial = nomeSocial;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public int getNumeroDeAcessosAoCurso() {
        return numeroDeAcessosAoCurso;
    }

    public void setNumeroDeAcessosAoCurso(int numeroDeAcessosAoCurso) {
        this.numeroDeAcessosAoCurso = numeroDeAcessosAoCurso;
    }

    public String getSituacaoNoCurso() {
        return situacaoNoCurso;
    }

    public void setSituacaoNoCurso(String situacaoNoCurso) {
        this.situacaoNoCurso = situacaoNoCurso;
    }

    public String getDataDeVinculo() {
        return dataDeVinculo;
    }

    public void setDataDeVinculo(String dataDeVinculo) {
        this.dataDeVinculo = dataDeVinculo;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nomeCompleto='" + nomeCompleto + '\'' +
                ", nomeSocial='" + nomeSocial + '\'' +
                ", dataDeNascimento='" + dataDeNascimento + '\'' +
                ", codigo=" + codigo +
                ", sexo='" + sexo + '\'' +
                ", email='" + email + '\'' +
                ", estado='" + estado + '\'' +
                ", municipio='" + municipio + '\'' +
                ", numeroDeAcessosAoCurso=" + numeroDeAcessosAoCurso +
                ", situacaoNoCurso='" + situacaoNoCurso + '\'' +
                ", dataDeVinculo='" + dataDeVinculo + '\'' +
                '}';
    }

}