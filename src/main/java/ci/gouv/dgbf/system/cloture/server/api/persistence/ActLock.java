package ci.gouv.dgbf.system.cloture.server.api.persistence;

import org.cyk.utility.service.entity.IdentifiableSystemScalarString;

public interface ActLock extends IdentifiableSystemScalarString {
	
	String getActIdentifier();
	ActLock setActIdentifier(String actIdentifier);
	
	String getActReference();
	ActLock setActReference(String actReference);
	
	ActTypeEnum getActType();
	ActLock setActType(ActTypeEnum actType);
	
	String getReason();
	ActLock setReason(String reason);
}