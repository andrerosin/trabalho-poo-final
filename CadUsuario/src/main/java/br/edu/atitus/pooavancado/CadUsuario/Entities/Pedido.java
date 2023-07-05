package br.edu.atitus.pooavancado.CadUsuario.Entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "pedido")
public class Pedido extends GenericEntity {

private static final long serialVersionUID = 1L;

@Column
private LocalDateTime data;

@ManyToOne
@JoinColumn(name = "produto_id")
private Produto produto;

@Column
private Double quantidade;

public LocalDateTime getData() {
	return data;
}

public void setData(LocalDateTime data) {
	this.data = data;
}

public Produto getProduto() {
	return produto;
}

public void setProduto(Produto produto) {
	this.produto = produto;
}

public Double getQuantidade() {
	return quantidade;
}

public void setQuantidade(Double quantidade) {
	this.quantidade = quantidade;
}
	

}
