package ci.gouv.dgbf.system.cloture.server.api.persistence;

public interface OperationAct extends OperationData {
	
	Act getAct();
	OperationAct setAct(Act act);
}