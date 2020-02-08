package br.com.devdojo.maratonajsf.bean.comunicacao;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;
import java.util.Map;

import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.servlet.http.Cookie;

import org.omnifaces.util.Faces;

import br.com.devdojo.maratonajsf.bean.estudante.model.Estudante;
import br.com.devdojo.maratonajsf.util.AppliacationMapUtil;


@Named
@RequestScoped
public class ComunicacaoTeste12Bean implements Serializable{
	private Estudante estudante;
	private Estudante estudante2 = new Estudante();
	
	public void init() {
		estudante = (Estudante) AppliacationMapUtil.getValueFromApplicationMap("estudante");
	}

	public String voltar() {
		System.out.println(estudante2.getNome());
		System.out.println(estudante2.getSobrenome());
		return "comunicacao11?faces-redirect=true";
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
