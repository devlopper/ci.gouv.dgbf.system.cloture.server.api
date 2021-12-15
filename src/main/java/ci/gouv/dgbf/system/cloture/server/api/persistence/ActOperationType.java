package ci.gouv.dgbf.system.cloture.server.api.persistence;

import lombok.Getter;

@Getter
public enum ActOperationType {

	VERROUILLAGE("Verouillage")
	,DEVERROUILLAGE("Déverouillage")
	
	;
	
	private String label;
	
	private ActOperationType(String label) {
		this.label = label;
	}
}