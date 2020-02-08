package br.com.devdojo.maratonajsf.bean.comunicacao;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.omnifaces.cdi.Param;

@Named
@ViewScoped
public class ComunicacaoTeste3Bean implements Serializable{
	private String nome;
	private String sobrenome;
	private Date data;
	
	public void init() throws ParseException {
		// se a requisição for do tipo ajax
//		if(!FacesContext.getCurrentInstance().isPostback()) {
			System.out.println("Criou comunicacao 3");
			System.out.println(nome);
			System.out.println(sobrenome);
			System.out.println(data);
//		}
	}
	
	public String save() {
		return "resultado?faces-redirect=true&amp;includeViewParams=true";
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
}
