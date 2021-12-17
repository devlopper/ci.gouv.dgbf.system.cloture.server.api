package ci.gouv.dgbf.system.cloture.server.api.persistence;

import lombok.Getter;

@Getter
public enum ActType {
	
	ENGAGEMENT("Engagement")
	,LIQUIDATION("Liquidation")
	,REGIE_PAIEMENT("Régie de paiment")
	,MANDAT("Mandat")
	
	;
	
	private String label;
	
	private ActType(String label) {
		this.label = label;
	}
}