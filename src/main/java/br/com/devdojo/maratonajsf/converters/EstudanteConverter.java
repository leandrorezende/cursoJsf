package br.com.devdojo.maratonajsf.converters;

import java.util.List;
import java.util.Map;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.com.devdojo.maratonajsf.bean.estudante.model.Estudante;

@FacesConverter(value = "estudanteConverter")
public class EstudanteConverter implements Converter{
	List<Estudante> estudanteList = Estudante.estudanteList();
	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		if (value == null || !value.matches("\\d")) 
			return null;
		return this.getAttibutesFrom(component).get(value);
//		Estudante estudante = new Estudante();
//		estudante.setId(Integer.parseInt(value));
//		int index = estudanteList.indexOf(estudante);
//		return estudanteList.get(index);
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if (value != null) {
			Estudante estudante = (Estudante) value;
			if (estudante.getId() != null) {
				this.addAttributes(component, estudante);
				return estudante.getId().toString();
			}
		}
		return null;
	}
	
	private Map<String, Object> getAttibutesFrom(UIComponent component){
		return component.getAttributes();
	}
	
	private void addAttributes(UIComponent component, Estudante estudante) {
		this.getAttibutesFrom(component).put(estudante.getId().toString(), estudante);
	}
}
