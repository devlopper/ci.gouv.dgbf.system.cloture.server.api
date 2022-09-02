package ci.gouv.dgbf.system.cloture.server.api.persistence;

public interface Parameters {

	String CODE = "cod";
	String PROCESSED = "traite";
	
	String OPERATIONS_STATUS_IDENTIFIERS = "s_o_ids";
	
	String OPERATION_IDENTIFIER = "o_id";
	String OPERATION_TYPE_IDENTIFIER = "t_o_id";
	String OPERATION_HAS_STATUS_CODE_AT_LEAST = "o_has_s_c_at_least";
	String OPERATION_EXECUTED = "o_ex";
	String ORDER_NUMBER_IS_LOWEST = "on_is_lowest";
	
	String ACT_IDENTIFIER = "a_id";
	String ACT_TYPE_IDENTIFIER = "t_a_id";
	
	String ACTS_IDENTIFIERS = "a_ids";
	String ACTS_REFERENCES = "a_refs";
	String ACT_TYPE = "a_typ";
	String ACTS_TYPES = "a_typs";
	String ACTS_CODES = "a_codes";
	String ACT_OPERATION_TYPE = "toa_id";
	String SEARCH = "r";
	
	String ACT_ADDED_TO_SPECIFIED_OPERATION = "a_a_o_s";
	
	String OPERATION_STATUS_IDENTIFIER = "s_o_id";
}