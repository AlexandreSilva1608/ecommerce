package com.ecomerce.pedido.domain.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Pedido {

    @Id
    private Long id;
    private String dataCriacao;
    private String dataUltimaAtualizacao;
    private String dataConclusao;
    private Long total;
    private int versao;

}
