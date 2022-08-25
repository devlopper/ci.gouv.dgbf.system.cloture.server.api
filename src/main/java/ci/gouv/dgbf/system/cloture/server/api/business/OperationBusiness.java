package ci.gouv.dgbf.system.cloture.server.api.business;

import java.util.Collection;

import org.cyk.utility.business.Result;
import org.cyk.utility.business.SpecificBusiness;
import org.cyk.utility.persistence.query.Filter;

import ci.gouv.dgbf.system.cloture.server.api.persistence.Operation;

public interface OperationBusiness extends SpecificBusiness<Operation> {

	/* Creation */
	
	String CREATE_AUDIT_IDENTIFIER = "CREATION_OPERATION";
	String CREATE_LABEL = "Création opération";
	Result create(String typeIdentifier,String code,String name,String reason,String auditWho);
	
	/* Add */
	
	String ADD_ACT_AUDIT_IDENTIFIER = "AJOUT_ACTE_A_OPERATION";
	String ADD_ACT_LABEL = "Ajout actes à opération";
	Result addAct(String identifier,Collection<String> actsIdentifiers,Boolean existingIgnorable,String auditWho);
	Result addAct(String identifier,Boolean existingIgnorable,String auditWho,String...actsIdentifiers);
	
	String ADD_ACT_BY_FILTER_AUDIT_IDENTIFIER = "AJOUT_ACTE_PAR_FILTRE_A_OPERATION";
	String ADD_ACT_BY_FILTER_LABEL = "Ajout actes par filtre à opération";
	Result addActByFilter(String identifier,Filter filter,Boolean existingIgnorable,String auditWho);
	
	String ADD_COMPREHENSIVELY_AUDIT_IDENTIFIER = "AJOUT_EXHAUSTIF_ACTE_A_OPERATION";
	String ADD_COMPREHENSIVELY_LABEL = "Ajout exhaustif actes à opération";
	Result addActComprehensively(String identifier,Collection<String> actsIdentifiers,String auditWho);
	Result addActComprehensively(String identifier,String auditWho,String...actsIdentifiers);
	
	/* Remove */
	
	String REMOVE_ACT_AUDIT_IDENTIFIER = "RETRAIT_ACTE_A_OPERATION";
	String REMOVE_ACT_LABEL = "Retrait actes à opération";
	Result removeAct(String identifier,Collection<String> actsIdentifiers,Boolean existingIgnorable,String auditWho);
	Result removeAct(String identifier,Boolean existingIgnorable,String auditWho,String...actsIdentifiers);
	
	String REMOVE_ACT_BY_FILTER_AUDIT_IDENTIFIER = "RETRAIT_ACTE_PAR_FILTRE_A_OPERATION";
	String REMOVE_ACT_BY_FILTER_LABEL = "Retrait actes par filtre à opération";
	Result removeActByFilter(String identifier,Filter filter,Boolean existingIgnorable,String auditWho);
}