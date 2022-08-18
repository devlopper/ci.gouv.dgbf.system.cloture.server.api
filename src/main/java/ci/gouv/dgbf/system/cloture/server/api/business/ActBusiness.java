package ci.gouv.dgbf.system.cloture.server.api.business;

import java.util.Collection;

import javax.transaction.Transactional;

import org.cyk.utility.business.Result;
import org.cyk.utility.business.SpecificBusiness;

import ci.gouv.dgbf.system.cloture.server.api.persistence.Act;

public interface ActBusiness extends SpecificBusiness<Act> {

	String ADD_TO_OPERATION_AUDIT_IDENTIFIER = "AJOUT_ACTE_A_OPERATION";
	Result addToOperation(Collection<String> identifiers,String operationIdentifier,Boolean existingIgnorable,String auditWho);
	Result addToOperation(String operationIdentifier,Boolean existingIgnorable,String auditWho,String...identifiers);
	
	String ADD_COMPREHENSIVELY_TO_OPERATION_AUDIT_IDENTIFIER = "AJOUT_EXHAUSTIF_ACTE_A_OPERATION";
	Result addComprehensivelyToOperation(Collection<String> identifiers,String operationIdentifier,String auditWho);
	Result addComprehensivelyToOperation(String operationIdentifier,String auditWho,String...identifiers);
	
	@Transactional
	void lock(Collection<String> identifiers,String trigger);
	
	@Transactional
	void lock(String trigger,String...identifiers);
	
	@Transactional
	Integer unlock(Collection<String> identifiers,String trigger,Boolean processedIgnorable);
	
	@Transactional
	Integer unlock(String trigger,Boolean processedIgnorable,String...identifiers);
}