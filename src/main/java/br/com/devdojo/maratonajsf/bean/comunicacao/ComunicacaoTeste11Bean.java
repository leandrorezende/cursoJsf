package br.com.devdojo.maratonajsf.bean.comunicacao;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;
import java.util.Map;

import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.servlet.http.Cookie;

import org.omnifaces.util.Faces;

import br.com.devdojo.maratonajsf.bean.estudante.model.Estudante;
import br.com.devdojo.maratonajsf.util.AppliacationMapUtil;


@Named
@ViewScoped
public class ComunicacaoTeste11Bean implements Serializable{
	private List<Estudante> estudanteList = Estudante.estudanteList();
	
	public String editar(Estudante estudante) {
		//coloca estudante a ser editado na sessao
		AppliacationMapUtil.setValueInApplicationMap("estudante", estudante);
		return "comunicacao12?faces-redirect=true";
	}
	
	public List<Estudante> getEstudanteList() {
		return estudanteList;
	}

	public void setEstudanteList(List<Estudante> estudanteList) {
		this.estudanteList = estudanteList;
	}
}
