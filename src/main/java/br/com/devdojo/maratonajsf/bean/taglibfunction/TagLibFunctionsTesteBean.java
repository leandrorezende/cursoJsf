package br.com.devdojo.maratonajsf.bean.taglibfunction;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import static java.util.Arrays.asList;

@Named
@ViewScoped
public class TagLibFunctionsTesteBean implements Serializable{
	private List<String> names = asList("shimazu toyohisa","oda nobunaga", "nasu no yoichi" );
	
	public List<String> getNames() {
		return names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}
}
