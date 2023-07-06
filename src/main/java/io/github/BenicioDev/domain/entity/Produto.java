package io.github.BenicioDev.domain.entity;

import java.math.BigDecimal;

public class Produto {
    private Integer id;
    private String descricao;
    private BigDecimal preco_unitar;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPreco_unitar() {
        return preco_unitar;
    }

    public void setPreco_unitar(BigDecimal preco_unitar) {
        this.preco_unitar = preco_unitar;
    }
}
