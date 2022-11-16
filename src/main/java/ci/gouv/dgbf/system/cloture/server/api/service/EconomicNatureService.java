package ci.gouv.dgbf.system.cloture.server.api.service;

import javax.ws.rs.Path;

import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@Path(EconomicNatureService.PATH)
@Tag(name = "Natures économiques")
public interface EconomicNatureService extends org.cyk.utility.service.SpecificService<EconomicNatureDto> {
	String PATH = "natures-economiques";
	
}