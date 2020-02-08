package br.com.devdojo.maratonajsf.bean.application;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.devdojo.maratonajsf.bean.dependent.TesteDependentBean;
import br.com.devdojo.maratonajsf.bean.session.TesteSessionBean;

import static java.util.Arrays.asList;

@Named
@ApplicationScoped
public class TesteApplicationBean implements Serializable {
	private List<String> categoriasList;
	private final TesteDependentBean dependentBean;
	private final TesteSessionBean sessionBean;
	
	
	public TesteApplicationBean(){
		this.sessionBean = null;
		this.dependentBean = null;
	}
	
	@Inject
	public TesteApplicationBean(TesteDependentBean dependentBean, TesteSessionBean sessionBean) {
		this.sessionBean = sessionBean;
		this.dependentBean = dependentBean;
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Entrou no PostConstruct do ApplicationScoped");
		categoriasList = asList("RPG","SCI-FI","Terror");
		dependentBean.getCategoriasList().addAll(asList("Comédia","Romance","Terror"));
		sessionBean.selecionarPersonagem();
	}
	
	public void mudarLista() {
		categoriasList = asList("RPG","SCI-FI","Terror","Porn");
	}

	public List<String> getCategoriasList() {
		return categoriasList;
	}

	public void setCategoriasList(List<String> categoriasList) {
		this.categoriasList = categoriasList;
	}

	public TesteDependentBean getDependentBean() {
		return dependentBean;
	}

	public TesteSessionBean getSessionBean() {
		return sessionBean;
	}
}
