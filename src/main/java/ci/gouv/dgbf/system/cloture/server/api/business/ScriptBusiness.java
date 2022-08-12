package ci.gouv.dgbf.system.cloture.server.api.business;

import javax.transaction.Transactional;

import org.cyk.utility.business.SpecificBusiness;

import ci.gouv.dgbf.system.cloture.server.api.persistence.Script;

public interface ScriptBusiness extends SpecificBusiness<Script> {

	@Transactional
	void execute(String identifier,String trigger,Boolean blocking);
	
	@Transactional
	void execute(String identifier,String trigger);
}