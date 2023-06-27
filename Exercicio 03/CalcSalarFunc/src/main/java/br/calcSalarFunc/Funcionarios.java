package br.calcSalarFunc;

import java.math.BigDecimal;

public class Funcionarios {
	private String nome;
	private String email;
	private BigDecimal salarioBase;
	private String cargo;

	public Funcionarios(String nome, String email, BigDecimal salarioBase, String cargo) {
		this.nome = nome;
		this.email = email;
		this.salarioBase = salarioBase;
		this.cargo = cargo;
	}
	

	public String getNome() {return nome;}

	public void setNome(String nome) {this.nome = nome;}

	public String getEmail() {return email;}

	public void setEmail(String email) {this.email = email;}

	public BigDecimal getSalarioBase() {return salarioBase;}

	public void setSalarioBase(BigDecimal salarioBase) {this.salarioBase = salarioBase;}

	public String getCargo() {return cargo;}

	public void setCargo(String cargo) {this.cargo = cargo;}
}