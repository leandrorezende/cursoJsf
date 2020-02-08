package br.com.devdojo.maratonajsf.bean.comunicacao;

import java.io.Serializable;

import javax.faces.event.ActionEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.com.devdojo.maratonajsf.bean.estudante.model.Estudante;

@Named
@ViewScoped
public class ComunicacaoTeste5Bean implements Serializable{
	private String nome;
	private String sobrenome;
	private Estudante estudante = new Estudante();
	private Estudante estudante2;
	
	public void execute() {
		System.out.println("Dentro do execute " +  nome);
		System.out.println("Dentro do execute " +  sobrenome);
		System.out.println("Dentro do execute " +  estudante2.getNota1());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		System.out.println("veio do f:setPropertyActionListener " + nome);
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		System.out.println("veio do f:setPropertyActionListener " + sobrenome);
		this.sobrenome = sobrenome;
	}

	public Estudante getEstudante() {
		return estudante;
	}

	public void setEstudante(Estudante estudante) {
		this.estudante = estudante;
	}

	public Estudante getEstudante2() {
		return estudante2;
	}

	public void setEstudante2(Estudante estudante2) {
		this.estudante2 = estudante2;
	}
}
