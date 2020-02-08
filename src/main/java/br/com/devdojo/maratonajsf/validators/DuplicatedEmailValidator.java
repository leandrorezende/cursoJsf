package br.com.devdojo.maratonajsf.validators;

import static java.util.Arrays.asList;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import javax.inject.Inject;

import br.com.devdojo.maratonajsf.bean.login.LoginBean;

@FacesValidator
public class DuplicatedEmailValidator implements Validator{
	private List<String> emailsDB = asList("wiilian.suane@devdojo", "contato@devdojo.com.br");
	
	@Inject
	private LoginBean loginBean;
	
	@Override
	public void validate(FacesContext context, UIComponent component, Object o) throws ValidatorException {
		String email = (String) o;
		System.out.println(loginBean.getLanguage());
		if(emailsDB.contains(email)) {
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR,"O email já existe cadastrado","");
			throw new ValidatorException(message);
		}
	}
}
