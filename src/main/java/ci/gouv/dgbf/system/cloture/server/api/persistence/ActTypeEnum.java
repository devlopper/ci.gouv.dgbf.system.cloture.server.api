package ci.gouv.dgbf.system.cloture.server.api.persistence;

import lombok.Getter;

@Getter
public enum ActTypeEnum {
	
	ENGAGEMENT("Engagement")
	,LIQUIDATION("Liquidation")
	,REGIE_PAIEMENT("Régie de paiment")
	,MANDAT("Mandat")
	
	;
	
	private String label;
	
	private ActTypeEnum(String label) {
		this.label = label;
	}
}