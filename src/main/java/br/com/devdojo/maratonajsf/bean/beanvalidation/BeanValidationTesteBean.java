package br.com.devdojo.maratonajsf.bean.beanvalidation;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Named
@ViewScoped
public class BeanValidationTesteBean implements Serializable {
	@Size(max=10, message="O nome tem que ter entre 3 e 10 caracteres")
	@NotNull(message="O nome � obrigat�rio")
	private String nome;
	
	@Pattern(regexp="^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$", message="Digite um email valido")
	private String email;
	
	@DecimalMax(value="30.50", message="O valor decimal n�o pode ser maior que 30.50")
	@DecimalMin(value="5.00", message="O valor decimal n�o pode ser menor que 5.00")
	private double decimal;

	@Digits(integer=3, fraction=2, message="O valor n�o pode ser maior que 999 e casa decimal maior que 2 d�gitos")
	private double numero;

	public void salvar() {
		System.out.println(nome.isEmpty());
		System.out.println(nome);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getDecimal() {
		return decimal;
	}

	public void setDecimal(double decimal) {
		this.decimal = decimal;
	}

	public double getNumero() {
		return numero;
	}

	public void setNumero(double numero) {
		this.numero = numero;
	}
}
