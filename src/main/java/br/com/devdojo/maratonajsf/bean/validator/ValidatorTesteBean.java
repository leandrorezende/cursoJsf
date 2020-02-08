package br.com.devdojo.maratonajsf.bean.validator;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.com.devdojo.maratonajsf.bean.estudante.model.Estudante;
import br.com.devdojo.maratonajsf.bean.login.LoginBean;

@Named
@ViewScoped
public class ValidatorTesteBean implements Serializable{
	private Estudante estudante = new Estudante();
	
	public void save() {
		System.out.println("Salvando");
		System.out.println(estudante.getEmail());
	}

	public Estudante getEstudante() {
		return estudante;
	}

	public void setEstudante(Estudante estudante) {
		this.estudante = estudante;
	}
}
