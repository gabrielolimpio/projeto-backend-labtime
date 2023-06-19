package com.backendlabtime.projeto.dtos;

import org.antlr.v4.runtime.misc.NotNull;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UsuarioDto {

    @NotBlank
    private String nomeCompleto;

    @NotBlank
    private String nomeSocial;

    private String dataDeNascimento;

    @NotBlank
    private int codigo;

    @Size(max = 1)
    private String sexo;

    @NotBlank
    private String email;

    private String estado;

    private String municipio;

    @NotBlank
    private int numeroDeAcessosAoCurso;

    private String situacaoNoCurso;

    @NotBlank
    private String dataDeVinculo;

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
}
