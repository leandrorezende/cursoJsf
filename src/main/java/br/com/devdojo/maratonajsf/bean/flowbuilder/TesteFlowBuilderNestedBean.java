package br.com.devdojo.maratonajsf.bean.flowbuilder;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.flow.FlowScoped;
import javax.inject.Named;

@Named
@FlowScoped(value="newpendencies")
public class TesteFlowBuilderNestedBean implements Serializable{
	private String userName;
	private String userSurname;
	
	public String validarUser() {
		System.out.println("Fazend consulta");
//		if(true) {
//			FacesContext context = FacesContext.getCurrentInstance();
//			context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario nao passou nas pedencias", "Algum detalhe util"));
//			return null;
//		}
			return "proceedeToNewRegistration3";
			
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getUserSurname() {
		return userSurname;
	}
	
	public void setUserSurname(String userSurname) {
		this.userSurname = userSurname;
	}
}
