package com.mybankshopos.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idProduct;
	
	@Column(name = "Numero", nullable = false)
	private int numero;
	
	@Column(name = "Type", nullable = false)
	private String tipo;
	
	@Column(name = "Saldo", nullable = false)
	private int saldo;
	
	@Column(name = "Saldo Disponible", nullable = false)
	private int saldoDisponible;
	
	@Column(name = "Excento GMF", nullable = false)
	private String excentoGMF;
	
	@ManyToOne
	@JsonBackReference
	private Customer customer;

	public Product() {
	}

	public Product(Integer idProduct, int numero, String tipo, int saldo, int saldoDisponible, String excentoGMF,
			Customer customer) {
		super();
		this.idProduct = idProduct;
		this.numero = numero;
		this.tipo = tipo;
		this.saldo = saldo;
		this.saldoDisponible = saldoDisponible;
		this.excentoGMF = excentoGMF;
		this.customer = customer;
	}

	

	public Integer getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(Integer idProduct) {
		this.idProduct = idProduct;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public int getSaldoDisponible() {
		return saldoDisponible;
	}

	public void setSaldoDisponible(int saldoDisponible) {
		this.saldoDisponible = saldoDisponible;
	}

	public String getExcentoGMF() {
		return excentoGMF;
	}

	public void setExcentoGMF(String excentoGMF) {
		this.excentoGMF = excentoGMF;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	

}
