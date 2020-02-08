package br.com.devdojo.maratonajsf.bean.comunicacao;

import java.io.Serializable;

import javax.faces.context.FacesContext;
import javax.faces.context.Flash;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.com.devdojo.maratonajsf.bean.estudante.model.Estudante;

@Named
@ViewScoped
public class ComunicacaoTeste7Bean implements Serializable{
	private Estudante estudante;
	
	public void init() {
		Flash flash = FacesContext.getCurrentInstance().getExternalContext().getFlash();
		estudante = (Estudante) flash.get("estudante");
	}

	public Estudante getEstudante() {
		return estudante;
	}

	public void setEstudante(Estudante estudante) {
		this.estudante = estudante;
	}	
}
