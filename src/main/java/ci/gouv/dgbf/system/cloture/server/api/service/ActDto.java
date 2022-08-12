package ci.gouv.dgbf.system.cloture.server.api.service;

import org.cyk.utility.service.entity.IdentifiableSystemScalarStringIdentifiableBusinessStringNamable;

public interface ActDto extends IdentifiableSystemScalarStringIdentifiableBusinessStringNamable {

	String JSON_IDENTIFIER = "identifiant";
	String JSON_CODE = "code";
	String JSON_NAME = "libelle";
	String JSON_TYPE = "type";
	
	String JSON_TYPE_AS_STRING = "type_chaine";
	String JSON_OPERATION_TYPE = "operation";
	String JSON_TRIGGER = "operation_declencheur";
	String JSON_OPERATION_DATE_STRING = "operation_date";
	String JSON_LOCKED = "verouille";
	String JSON_NUMBER_OF_LOCKS = "nombre_verrou";
	String JSON_LOCKED_REASONS = "motifs_verrouillage";
	String JSON_NUMBER_OF_LOCKS_ENABLED = "nombre_verrou_actif";
	String JSON_STATUS_STRING = "status";
	String JSON_LATEST_OPERATION_STRING = "derniere_operation";
	String JSON_PROCESSED_IGNORABLE = "ignore_deja_traite";
	
	String JSONS_CODE_NAME_TYPE_STRING_NUMBER_OF_LOCKS_ENABLED_STATUS_STRING_LATEST_OPERATION = "code_libelle_type_nombre_verrou_actif_status_derniere_operation";
}