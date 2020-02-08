package br.com.devdojo.maratonajsf.bean.login;

import java.io.Serializable;
import java.util.List;
import java.util.Locale;

import static java.util.Arrays.*;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import br.com.devdojo.maratonajsf.bean.estudante.model.Estudante;

@Named
@SessionScoped
public class LoginBean implements Serializable{
	private String nome;
	private String senha;
	private Estudante estudante;
	private List<Locale> localeList = asList(new Locale("en"), new Locale("pt"));
	private String language;
	private int qtdMensagens;
	
	public String logar() {
		//faz uma busca no banco
		if(nome.equals("w") && senha.equals("1")) {
			estudante = new Estudante();
			qtdMensagens++;
			return "/restricted/iniciosistema.xhtml?faces-redirect=true";
		}
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuário e/ou senha inválidos", ""));
		return null;
	}
	
	public String logout() {
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
		estudante = null;
		return "/login?faces-redirect=true";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Estudante getEstudante() {
		return estudante;
	}

	public void setEstudante(Estudante estudante) {
		this.estudante = estudante;
	}

	public List<Locale> getLocaleList() {
		return localeList;
	}

	public void setLocaleList(List<Locale> localeList) {
		this.localeList = localeList;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public int getQtdMensagens() {
		return qtdMensagens;
	}

	public void setQtdMensagens(int qtdMensagens) {
		this.qtdMensagens = qtdMensagens;
	}
}
