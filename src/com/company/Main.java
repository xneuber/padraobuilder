package com.company;

import com.company.entity.Dimensoes;
import com.company.entity.Pedido;
import com.company.entity.PedidoBuilder;
import com.company.entity.Vendedor;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) throws NoSuchFieldException {

        PedidoBuilder pedidoBuilder = new PedidoBuilder();

        pedidoBuilder.id(1L);
        pedidoBuilder.nome("Notebook");
        pedidoBuilder.descricao("Notebook 14").informacoesTecnicas("Processador AMD bla bla blá").marca("Dell");
        pedidoBuilder.modelo("inspiron").ean("123asdf321");

        System.out.println(pedidoBuilder.toString());

        pedidoBuilder
                .codigoDeBarras("789465321321")
                .estoque(10)
                .preco(2000.00);

        System.out.println(pedidoBuilder.toString());

        pedidoBuilder.dataCadastro(LocalDateTime.now())
                .ultimaAtualizacao(LocalDateTime.now())
                .urlFoto("https://www.google.com/");

        Vendedor vendedor = new Vendedor(1L, 1, "Vendedor 1");

        pedidoBuilder.vendedor(vendedor);

        Dimensoes dimensoes = new Dimensoes(1D, 5.5D, 100D, 150D, 12D);

        pedidoBuilder.dimensoes(dimensoes);

        System.out.println(pedidoBuilder.toString());

        Pedido pedido = pedidoBuilder.build();

        System.out.println(pedido.toString());

    }
}
