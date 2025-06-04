package com.StockFlow.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 255)
    private String foto;

    @Column(name = "codigo_de_barras", nullable = false, length = 100)
    private String codigoDeBarras;

    @Column(nullable = false, length = 100)
    private String nome;

    @Lob
    private String descricao;

    @Column(name = "custo_compra", nullable = false, precision = 10, scale = 2)
    private BigDecimal custoCompra;

    @Column(name = "preco_unitario", nullable = false, precision = 10, scale = 2)
    private BigDecimal precoUnitario;

    @Column(name = "preco_unitario_venda", nullable = false, precision = 10, scale = 2)
    private BigDecimal precoUnitarioVenda;

    @Column(name = "estoque_atual")
    private Integer estoqueAtual = 0;

    @ManyToOne
    @JoinColumn(name = "categoria_id", referencedColumnName = "id")
    private Categoria categoria;
    
    @ManyToOne
    @JoinColumn(name = "fornecedor_id", referencedColumnName = "id")
    private Fornecedor fornecedor;

    // Getter e Setter
    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public void setCodigoDeBarras(String codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
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

    public BigDecimal getCustoCompra() {
        return custoCompra;
    }

    public void setCustoCompra(BigDecimal custoCompra) {
        this.custoCompra = custoCompra;
    }

    public BigDecimal getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(BigDecimal precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public BigDecimal getPrecoUnitarioVenda() {
        return precoUnitarioVenda;
    }

    public void setPrecoUnitarioVenda(BigDecimal precoUnitarioVenda) {
        this.precoUnitarioVenda = precoUnitarioVenda;
    }

    public Integer getEstoqueAtual() {
        return estoqueAtual;
    }

    public void setEstoqueAtual(Integer estoqueAtual) {
        this.estoqueAtual = estoqueAtual;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
