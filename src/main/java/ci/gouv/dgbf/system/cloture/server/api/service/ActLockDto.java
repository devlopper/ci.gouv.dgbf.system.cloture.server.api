package ci.gouv.dgbf.system.cloture.server.api.service;

import org.cyk.utility.service.entity.IdentifiableSystemScalarString;

public interface ActLockDto extends IdentifiableSystemScalarString {

	String JSON_IDENTIFIER = "identifiant";
	String JSON_REASON = "motif";
	String JSON_ENABLED = "actif";
	String JSON_ENABLED_STRING = "actif_chaine";
	String JSON_BEGIN_DATE = "date_debut";
	String JSON_END_DATE = "date_fin";
	String JSON_LATEST_OPERATION = "derniere_operation";
	
	String JSONS_REASON_ENABLED_ENABLED_AS_STRING_BEGIN_DATE_STRING_END_DATE_STRING_LATEST_OPERATION = "motif_actif_actif_chaine_date_debut_date_fin_derniere_operation";
}