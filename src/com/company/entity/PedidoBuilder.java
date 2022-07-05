package com.company.entity;

import java.time.LocalDateTime;
import java.util.Objects;

public class PedidoBuilder {
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

    public PedidoBuilder id(Long id) {
        this.id = id;
        return this;
    }

    public PedidoBuilder nome(String nome) {
        this.nome = nome;
        return this;
    }

    public PedidoBuilder descricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public PedidoBuilder informacoesTecnicas(String informacoesTecnicas) {
        this.informacoesTecnicas = informacoesTecnicas;
        return this;
    }

    public PedidoBuilder marca(String marca) {
        this.marca = marca;
        return this;
    }

    public PedidoBuilder modelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public PedidoBuilder ean(String ean) {
        this.ean = ean;
        return this;
    }

    public PedidoBuilder codigoDeBarras(String codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
        return this;
    }

    public PedidoBuilder estoque(Integer estoque) {
        this.estoque = estoque;
        return this;
    }

    public PedidoBuilder preco(Double preco) {
        this.preco = preco;
        return this;
    }

    public PedidoBuilder dataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
        return this;
    }

    public PedidoBuilder ultimaAtualizacao(LocalDateTime ultimaAtualizacao) {
        this.ultimaAtualizacao = ultimaAtualizacao;
        return this;
    }

    public PedidoBuilder urlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
        return this;
    }

    public PedidoBuilder vendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
        return this;
    }

    public PedidoBuilder dimensoes(Dimensoes dimensoes) {
        this.dimensoes = dimensoes;
        return this;
    }

    public Pedido build() {
        return new Pedido(id, nome, descricao, informacoesTecnicas, marca, modelo, ean, codigoDeBarras, estoque, preco, dataCadastro, ultimaAtualizacao, urlFoto, vendedor, dimensoes);
    }

    @Override
    public String toString() {
        return "PedidoBuilder ["
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
                + "\n\tdataCadastro = " + dataCadastro
                + "\n\tultimaAtualizacao = " + ultimaAtualizacao
                + "\n\turlFoto = " + urlFoto
                + "\n\tvendedor = " + vendedor
                + "\n\tdimensoes = " + dimensoes
                + "\n]\n\n";
    }


}
