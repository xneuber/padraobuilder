package com.company.entity;

import com.company.util.DataUtil;

import java.time.LocalDateTime;

public class Pedido {

    private Long id;
    private String nome;
    private String descricao;
    private String informacoesTecnicas;
    private String marca;
    private String modelo;
    private String ean;
    private String codigoDeBarras;
    private Integer estoque;
    private Double preco;
    private LocalDateTime dataCadastro;
    private LocalDateTime ultimaAtualizacao;
    private String urlFoto;
    private Vendedor vendedor;
    private Dimensoes dimensoes;



    public Pedido(Long id, String nome, String descricao, String informacoesTecnicas, String marca, String modelo,
                  String ean, String codigoDeBarras, Integer estoque, Double preco, LocalDateTime dataCadastro,
                  LocalDateTime ultimaAtualizacao, String urlFoto, Vendedor vendedor, Dimensoes dimensoes) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.informacoesTecnicas = informacoesTecnicas;
        this.marca = marca;
        this.modelo = modelo;
        this.ean = ean;
        this.codigoDeBarras = codigoDeBarras;
        this.estoque = estoque;
        this.preco = preco;
        this.dataCadastro = dataCadastro;
        this.ultimaAtualizacao = ultimaAtualizacao;
        this.urlFoto = urlFoto;
        this.vendedor = vendedor;
        this.dimensoes = dimensoes;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getInformacoesTecnicas() {
        return informacoesTecnicas;
    }

    public void setInformacoesTecnicas(String informacoesTecnicas) {
        this.informacoesTecnicas = informacoesTecnicas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getEan() {
        return ean;
    }

    public void setEan(String ean) {
        this.ean = ean;
    }

    public String getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public void setCodigoDeBarras(String codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }

    public Integer getEstoque() {
        return estoque;
    }

    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public LocalDateTime getUltimaAtualizacao() {
        return ultimaAtualizacao;
    }

    public void setUltimaAtualizacao(LocalDateTime ultimaAtualizacao) {
        this.ultimaAtualizacao = ultimaAtualizacao;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Dimensoes getDimensoes() {
        return dimensoes;
    }

    public void setDimensoes(Dimensoes dimensoes) {
        this.dimensoes = dimensoes;
    }

    @Override
    public String toString() {
        return "Pedido{"
                + "\n\tid = " + id
                + "\n\tnome = " + nome
                + "\n\tdescricao = " + descricao
                + "\n\tinformacoesTecnicas = " + informacoesTecnicas
                + "\n\tmarca = " + marca
                + "\n\tmodelo = " + modelo
                + "\n\tean = " + ean
                + "\n\tcodigoDeBarras = " + codigoDeBarras
                + "\n\testoque = " + estoque
                + "\n\tpreco = " + preco
                + "\n\tdataCadastro = " + DataUtil.formatarData(dataCadastro)
                + "\n\tultimaAtualizacao = " + DataUtil.formatarData(ultimaAtualizacao)
                + "\n\turlFoto = " + urlFoto
                + "\n\tvendedor = " + vendedor
                + "\n\tdimensoes = " + dimensoes
                + "\n}";
    }


}
