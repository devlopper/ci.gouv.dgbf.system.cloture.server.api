package ci.gouv.dgbf.system.cloture.server.api.persistence;

import org.cyk.utility.persistence.entity.IdentifiableSystemScalarStringIdentifiableBusinessStringNamable;

public interface OperationStatus extends IdentifiableSystemScalarStringIdentifiableBusinessStringNamable {

	Byte getOrderNumber();
	OperationStatus setOrderNumber(Byte orderNumber);
	
	String NAME = "Statut d'opération";
	String NAME_PLURAL = "Statuts d'opération";
	
	
}