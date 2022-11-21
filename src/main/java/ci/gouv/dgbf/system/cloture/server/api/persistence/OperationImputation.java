package ci.gouv.dgbf.system.cloture.server.api.persistence;

public interface OperationImputation extends OperationData {
	
	Imputation getImputation();
	OperationImputation setImputation(Imputation imputation);
}