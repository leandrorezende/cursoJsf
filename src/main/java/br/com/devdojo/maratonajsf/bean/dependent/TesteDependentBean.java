package br.com.devdojo.maratonajsf.bean.dependent;

import static java.util.Arrays.asList;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import javax.annotation.PostConstruct;
import javax.enterprise.context.Dependent;
import javax.inject.Named;

@Named
@Dependent
public class TesteDependentBean implements Serializable {
	private List<String> personagens;
	private List<String> personagemSelecionado = new ArrayList<>();
	private List<String> categoriasList = new ArrayList<>();
	
	@PostConstruct
	public void init() {
		System.out.println("Entrou no PostConstruct do DependentScoped");
		personagens = asList("Naruto", "Hinata", "Youndaime");
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

	public List<String> getCategoriasList() {
		return categoriasList;
	}

	public void setCategoriasList(List<String> categoriasList) {
		this.categoriasList = categoriasList;
	}
}
