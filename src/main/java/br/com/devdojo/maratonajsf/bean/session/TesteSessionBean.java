package br.com.devdojo.maratonajsf.bean.session;

import static java.util.Arrays.asList;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import br.com.devdojo.maratonajsf.bean.estudante.model.Estudante;

@Named
@SessionScoped
public class TesteSessionBean implements Serializable{
	private List<String> personagens;
	private List<String> personagemSelecionado = new ArrayList<>();
	private Estudante estudante;
	
	@PostConstruct
	public void init() {
		System.out.println("Entrou no PostConstruct do SessionScoped");
		personagens = asList("Goku", "Vegeta", "Gohan");
		logar();
	}
	
	public void logar() {
		//fez a consulta no banco, verificou se esta ok
		estudante = new Estudante();
	}
	
	public String logout() {
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
		return "session?faces-redirect=true";
	}
	
	public void selecionarPersonagem() {
		int index = ThreadLocalRandom.current().nextInt(3);
		String personagem = personagens.get(index);
		personagemSelecionado.add(personagem);
	}

	public List<String> getPersonagens() {
		return personagens;
	}

	public void setPersonagens(List<String> personagens) {
		this.personagens = personagens;
	}

	public List<String> getPersonagemSelecionado() {
		return personagemSelecionado;
	}

	public void setPersonagemSelecionado(List<String> personagemSelecionado) {
		this.personagemSelecionado = personagemSelecionado;
	}

	public Estudante getEstudante() {
		return estudante;
	}

	public void setEstudante(Estudante estudante) {
		this.estudante = estudante;
	}
}
