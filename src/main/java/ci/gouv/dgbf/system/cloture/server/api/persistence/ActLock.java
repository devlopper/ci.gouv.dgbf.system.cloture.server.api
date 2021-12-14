package ci.gouv.dgbf.system.cloture.server.api.persistence;

import org.cyk.utility.service.entity.IdentifiableSystemScalarString;

public interface ActLock extends IdentifiableSystemScalarString {
	
	String getActReference();
	ActLock setActReference(String actReference);
	
	ActType getActType();
	ActLock setActType(ActType actType);
	
	String getReason();
	ActLock setReason(String reason);
}