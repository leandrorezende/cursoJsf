package br.com.devdojo.maratonajsf.bean.clientbehavior;

import javax.faces.component.behavior.ClientBehaviorBase;
import javax.faces.component.behavior.ClientBehaviorContext;
import javax.faces.component.behavior.FacesBehavior;

@FacesBehavior(value="confirm")
public class ConfirmDeleteBehavior extends ClientBehaviorBase {
	public String getScript(ClientBehaviorContext behaviorContext) {
		return "return confirm('Vc tem certeza?');";
	}
}
