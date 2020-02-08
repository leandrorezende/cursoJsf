package br.com.devdojo.maratonajsf.bean.estudante;

import static java.util.Arrays.asList;

import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.el.LambdaExpression;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.com.devdojo.maratonajsf.bean.estudante.model.Estudante;

@Named
@ViewScoped
public class EstudanteRegistrarBean implements Serializable {
	private Estudante estudante = new Estudante();
	private String[] nomesArray = {"DeveDojo", "é", "foda"};
	private List<String> nomesList = asList("Willain", "Williani", "Brenon");
	private Set<String> nomesSet = new HashSet<>(asList("Goku", "Luffy", "Naruto"));
	private Map<String, String> nomesMap = new HashMap<>();
	private boolean mostrarNotas = false;
	private boolean mostrarLink = false;
	
	{
		nomesMap.put("Goku", "O mais foda");
		nomesMap.put("One Peace", "O mais longo");
		nomesMap.put("Naruto", "O mais lenga lenga");
		for (Map.Entry<String, String> entry : nomesMap.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}
	
	public void executar() {
//		System.out.println("Fazendo uma busca no BD");
//		System.out.println("Processando os dados");
//		System.out.println("Exibindo os dados");
	}

	public void executar(String param) {
//		System.out.println("Fazendo uma busca no BD com o parametro " + param);
//		System.out.println("Processando os dados");
//		System.out.println("Exibindo os dados");
	}
	
	public String executarRetorno(String param) {
		return "Quem é lindão? " + param;
	}
	
	public String irParaIndex2() {
		return "index2?faces=redirect=true";
	}
 
	public void exibirLink() {
		this.mostrarLink = true;
	}
	
	public void esconderLink() {
		this.mostrarLink = false;
	}
	
	public void calcularCubo(LambdaExpression le, long value) {
		long result = (long) le.invoke(FacesContext.getCurrentInstance().getELContext(), value);
		System.out.println(result);
	}
	
	public void exibirNotas() {
		this.mostrarNotas = true;
	}
	
	public void esconderNotas() {
		this.mostrarNotas = false;
	}
	
	public boolean isMostrarLink() {
		return mostrarLink;
	}

	public void setMostrarLink(boolean mostrarLink) {
		this.mostrarLink = mostrarLink;
	}
	
	public boolean isMostrarNotas() {
		return mostrarNotas;
	}

	public void setMostrarNotas(boolean mostrarNotas) {
		this.mostrarNotas = mostrarNotas;
	}

	public Estudante getEstudante() {
		return estudante;
	}

	public void setEstudante(Estudante estudante) {
		this.estudante = estudante;
	}

	public String[] getNomesArray() {
		return nomesArray;
	}

	public void setNomesArray(String[] nomesArray) {
		this.nomesArray = nomesArray;
	}

	public List<String> getNomesList() {
		return nomesList;
	}

	public void setNomesList(List<String> nomesList) {
		this.nomesList = nomesList;
	}

	public Set<String> getNomesSet() {
		return nomesSet;
	}

	public void setNomesSet(Set<String> nomesSet) {
		this.nomesSet = nomesSet;
	}

	public Map<String, String> getNomesMap() {
		return nomesMap;
	}

	public void setNomesMap(Map<String, String> nomesMap) {
		this.nomesMap = nomesMap;
	}
}

