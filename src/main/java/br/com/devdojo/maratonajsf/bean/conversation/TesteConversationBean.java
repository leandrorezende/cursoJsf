package br.com.devdojo.maratonajsf.bean.conversation;

import static java.util.Arrays.asList;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import javax.annotation.PostConstruct;
import javax.enterprise.context.Conversation;
import javax.enterprise.context.ConversationScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

@Named 
@ConversationScoped
public class TesteConversationBean implements Serializable{
	private List<String> personagens;
	private List<String> personagemSelecionado = new ArrayList<>();
	
	@Inject
	private Conversation conversation;
	//criar uma instacia do conversation no bean para criar a caracteristica de mini sessao
	
	public void init() {
		System.out.println("Entrou no PostConstruct do ConversationScoped");
		personagens = asList("Luffy", "Zoro", "Sanji");
		if(conversation.isTransient()) {
			//long running
			conversation.begin();
			System.out.println("Iniciando conversation scoped, ID=" + conversation.getId());
		}
	}
	
	public String endConversation() {
		if (!conversation.isTransient()) {
			conversation.end();
		}
		return "conversation?faces-redirect=true";
	}
	
	public void selecionarPersonagem() {
		int index = ThreadLocalRandom.current().nextInt(3);
		String personagem = personagens.get(index);
		personagemSelecionado.add(personagem);
	}

	public List<String> getPersonagens() {
		return personagens;
	}
	
	public Conversation getConversation() {
		return conversation;
	}
	
	public void setConversation(Conversation conversation) {
		this.conversation = conversation;
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
}
