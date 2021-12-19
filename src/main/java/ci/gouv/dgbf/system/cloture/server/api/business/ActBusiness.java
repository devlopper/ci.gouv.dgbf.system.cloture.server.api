package ci.gouv.dgbf.system.cloture.server.api.business;

import java.util.Collection;

import javax.transaction.Transactional;

import org.cyk.utility.business.SpecificBusiness;

import ci.gouv.dgbf.system.cloture.server.api.persistence.Act;

public interface ActBusiness extends SpecificBusiness<Act> {

	@Transactional
	void lock(Collection<String> identifiers,String trigger);
	
	@Transactional
	void lock(String trigger,String...identifiers);
	
	@Transactional
	Integer unlock(Collection<String> identifiers,String trigger,Boolean processedIgnorable);
	
	@Transactional
	Integer unlock(String trigger,Boolean processedIgnorable,String...identifiers);
}