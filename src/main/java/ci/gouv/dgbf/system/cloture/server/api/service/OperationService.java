package ci.gouv.dgbf.system.cloture.server.api.service;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.cyk.utility.service.FilterFormat;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.parameters.Parameter;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponses;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@Path(OperationService.PATH)
@Tag(name = "Opérations",description = "Gestion des opérations")
public interface OperationService extends org.cyk.utility.service.SpecificService<OperationDto> {
	String PATH = "operations";
	
	/* Creation */
	
	@POST
	@Path("/")
	@Produces({MediaType.TEXT_PLAIN})
	@Operation(description = "Créer une opération")
	@APIResponses(value = {
			@APIResponse(description = "Une opération créée",responseCode = "200", content = @Content(mediaType = MediaType.TEXT_PLAIN))
			,@APIResponse(description = "Erreur lors de la création d'une opération",responseCode = "500", content = @Content(mediaType = MediaType.APPLICATION_JSON))
	})
	Response create(
		@Parameter(name = OperationDto.JSON_TYPE_IDENTIFIER,description = "Type")
		@QueryParam(OperationDto.JSON_TYPE_IDENTIFIER) String typeIdentifier
		
		,@Parameter(name = OperationDto.JSON_CODE,description = "Code")
		@QueryParam(OperationDto.JSON_CODE) String code
		
		,@Parameter(name = OperationDto.JSON_NAME,description = "Libellé")
		@QueryParam(OperationDto.JSON_NAME) String name
		
		,@Parameter(name = OperationDto.JSON_REASON,description = "Motif")
		@QueryParam(OperationDto.JSON_REASON) String reason
		
		,@Parameter(name = OperationDto.JSON___AUDIT_WHO__,description = "Audit acteur")
		@QueryParam(OperationDto.JSON___AUDIT_WHO__) String auditWho
	);
	
	/* Add Act */
	
	@POST
	@Path("actes")
	@Produces({MediaType.TEXT_PLAIN})
	@Operation(description = "Ajouter des actes")
	@APIResponses(value = {
			@APIResponse(description = "Des actes ajoutés",responseCode = "200", content = @Content(mediaType = MediaType.TEXT_PLAIN))
			,@APIResponse(description = "Erreur lors de l'ajout des actes",responseCode = "500", content = @Content(mediaType = MediaType.APPLICATION_JSON))
	})
	Response addAct(
		@Parameter(name = OperationDto.JSON_IDENTIFIER,description = "Identifiant")
		@QueryParam(OperationDto.JSON_IDENTIFIER) String identifier
		
		,@Parameter(name = OperationDto.JSON_ACTS_IDENTIFIERS,description = "Identifiants actes")
		@QueryParam(OperationDto.JSON_ACTS_IDENTIFIERS) List<String> actsIdentifiers
		
		,@Parameter(name = OperationDto.JSON_EXISTING_IGNORABLE,description = "Existant ignorable")
		@QueryParam(OperationDto.JSON_EXISTING_IGNORABLE) Boolean existingIgnorable
		
		,@Parameter(name = OperationDto.JSON___AUDIT_WHO__,description = "Audit acteur")
		@QueryParam(OperationDto.JSON___AUDIT_WHO__) String auditWho);
	
	@POST
	@Path("actes-exhaustifs")
	@Produces({MediaType.TEXT_PLAIN})
	@Operation(description = "Ajouter des actes exhaustivement")
	@APIResponses(value = {
			@APIResponse(description = "Des actes ajoutés exhaustivement",responseCode = "200", content = @Content(mediaType = MediaType.TEXT_PLAIN))
			,@APIResponse(description = "Erreur lors de l'ajout exhaustif des actes",responseCode = "500", content = @Content(mediaType = MediaType.APPLICATION_JSON))
	})
	Response addActComprehensively(
		@Parameter(name = OperationDto.JSON_IDENTIFIER,description = "Identifiant")
		@QueryParam(OperationDto.JSON_IDENTIFIER) String identifier
			
		,@Parameter(name = OperationDto.JSON_ACTS_IDENTIFIERS,description = "Identifiants actes")
		@QueryParam(OperationDto.JSON_ACTS_IDENTIFIERS) List<String> actsIdentifiers
			
		,@Parameter(name = OperationDto.JSON___AUDIT_WHO__,description = "Audit acteur")
		@QueryParam(OperationDto.JSON___AUDIT_WHO__) String auditWho);
	
	@POST
	@Path("actes-filtres")
	@Produces({MediaType.TEXT_PLAIN})
	@Operation(description = "Ajouter des actes filtrés")
	@APIResponses(value = {
			@APIResponse(description = "Des actes filtrés ajoutés",responseCode = "200", content = @Content(mediaType = MediaType.TEXT_PLAIN))
			,@APIResponse(description = "Erreur lors de l'ajout des actes filtrés",responseCode = "500", content = @Content(mediaType = MediaType.APPLICATION_JSON))
	})
	Response addActByFilter(
		@Parameter(name = OperationDto.JSON_IDENTIFIER,description = "Identifiant")
		@QueryParam(OperationDto.JSON_IDENTIFIER) String identifier
			
		,@Parameter(name = PARAMETER_NAME_FILTER_AS_STRING,description = PARAMETER_NAME_FILTER_AS_STRING_DESCRIPTION_FRENCH)
		@QueryParam(PARAMETER_NAME_FILTER_AS_STRING) String filterAsString
		
		,@Parameter(name = PARAMETER_NAME_FILTER_FORMAT,description = PARAMETER_NAME_FILTER_FORMAT_DESCRIPTION_FRENCH)
		@QueryParam(PARAMETER_NAME_FILTER_FORMAT) FilterFormat filterFormat
		
		,@Parameter(name = OperationDto.JSON_EXISTING_IGNORABLE,description = "Existant ignorable")
		@QueryParam(OperationDto.JSON_EXISTING_IGNORABLE) Boolean existingIgnorable
			
		,@Parameter(name = OperationDto.JSON___AUDIT_WHO__,description = "Audit acteur")
		@QueryParam(OperationDto.JSON___AUDIT_WHO__) String auditWho);
	
	/* Remove Act */
	
	@DELETE
	@Path("actes")
	@Produces({MediaType.TEXT_PLAIN})
	@Operation(description = "Retirer des actes")
	@APIResponses(value = {
			@APIResponse(description = "Des actes retirés",responseCode = "200", content = @Content(mediaType = MediaType.TEXT_PLAIN))
			,@APIResponse(description = "Erreur lors du retrait des actes",responseCode = "500", content = @Content(mediaType = MediaType.APPLICATION_JSON))
	})
	Response removeAct(
		@Parameter(name = OperationDto.JSON_IDENTIFIER,description = "Identifiant")
		@QueryParam(OperationDto.JSON_IDENTIFIER) String identifier
		
		,@Parameter(name = OperationDto.JSON_ACTS_IDENTIFIERS,description = "Identifiants actes")
		@QueryParam(OperationDto.JSON_ACTS_IDENTIFIERS) List<String> actsIdentifiers
		
		,@Parameter(name = OperationDto.JSON_EXISTING_IGNORABLE,description = "Existant ignorable")
		@QueryParam(OperationDto.JSON_EXISTING_IGNORABLE) Boolean existingIgnorable
		
		,@Parameter(name = OperationDto.JSON___AUDIT_WHO__,description = "Audit acteur")
		@QueryParam(OperationDto.JSON___AUDIT_WHO__) String auditWho);
	
	@DELETE
	@Path("actes-exhaustifs")
	@Produces({MediaType.TEXT_PLAIN})
	@Operation(description = "Retirer des actes exhaustivement")
	@APIResponses(value = {
			@APIResponse(description = "Des actes retirés exhaustivement",responseCode = "200", content = @Content(mediaType = MediaType.TEXT_PLAIN))
			,@APIResponse(description = "Erreur lors du retrait exhaustif des actes",responseCode = "500", content = @Content(mediaType = MediaType.APPLICATION_JSON))
	})
	Response removeActComprehensively(
		@Parameter(name = OperationDto.JSON_IDENTIFIER,description = "Identifiant")
		@QueryParam(OperationDto.JSON_IDENTIFIER) String identifier
			
		,@Parameter(name = OperationDto.JSON_ACTS_IDENTIFIERS,description = "Identifiants actes")
		@QueryParam(OperationDto.JSON_ACTS_IDENTIFIERS) List<String> actsIdentifiers
			
		,@Parameter(name = OperationDto.JSON___AUDIT_WHO__,description = "Audit acteur")
		@QueryParam(OperationDto.JSON___AUDIT_WHO__) String auditWho);
	
	@DELETE
	@Path("actes-filtres")
	@Produces({MediaType.TEXT_PLAIN})
	@Operation(description = "Retirer des actes filtrés")
	@APIResponses(value = {
			@APIResponse(description = "Des actes filtrés retirés",responseCode = "200", content = @Content(mediaType = MediaType.TEXT_PLAIN))
			,@APIResponse(description = "Erreur lors du retrait des actes filtrés",responseCode = "500", content = @Content(mediaType = MediaType.APPLICATION_JSON))
	})
	Response removeActByFilter(
		@Parameter(name = OperationDto.JSON_IDENTIFIER,description = "Identifiant")
		@QueryParam(OperationDto.JSON_IDENTIFIER) String identifier
			
		,@Parameter(name = PARAMETER_NAME_FILTER_AS_STRING,description = PARAMETER_NAME_FILTER_AS_STRING_DESCRIPTION_FRENCH)
		@QueryParam(PARAMETER_NAME_FILTER_AS_STRING) String filterAsString
		
		,@Parameter(name = PARAMETER_NAME_FILTER_FORMAT,description = PARAMETER_NAME_FILTER_FORMAT_DESCRIPTION_FRENCH)
		@QueryParam(PARAMETER_NAME_FILTER_FORMAT) FilterFormat filterFormat
		
		,@Parameter(name = OperationDto.JSON_EXISTING_IGNORABLE,description = "Existant ignorable")
		@QueryParam(OperationDto.JSON_EXISTING_IGNORABLE) Boolean existingIgnorable
			
		,@Parameter(name = OperationDto.JSON___AUDIT_WHO__,description = "Audit acteur")
		@QueryParam(OperationDto.JSON___AUDIT_WHO__) String auditWho);
	
	/* Add Imputation */
	
	@POST
	@Path("imputations")
	@Produces({MediaType.TEXT_PLAIN})
	@Operation(description = "Ajouter des imputations")
	@APIResponses(value = {
			@APIResponse(description = "Des imputations ajoutées",responseCode = "200", content = @Content(mediaType = MediaType.TEXT_PLAIN))
			,@APIResponse(description = "Erreur lors de l'ajout des imputations",responseCode = "500", content = @Content(mediaType = MediaType.APPLICATION_JSON))
	})
	Response addImputation(
		@Parameter(name = OperationDto.JSON_IDENTIFIER,description = "Identifiant")
		@QueryParam(OperationDto.JSON_IDENTIFIER) String identifier
		
		,@Parameter(name = OperationDto.JSON_ACTS_IDENTIFIERS,description = "Identifiants imputations")
		@QueryParam(OperationDto.JSON_ACTS_IDENTIFIERS) List<String> actsIdentifiers
		
		,@Parameter(name = OperationDto.JSON_EXISTING_IGNORABLE,description = "Existant ignorable")
		@QueryParam(OperationDto.JSON_EXISTING_IGNORABLE) Boolean existingIgnorable
		
		,@Parameter(name = OperationDto.JSON___AUDIT_WHO__,description = "Audit acteur")
		@QueryParam(OperationDto.JSON___AUDIT_WHO__) String auditWho);
	
	@POST
	@Path("imputations-exhaustifs")
	@Produces({MediaType.TEXT_PLAIN})
	@Operation(description = "Ajouter des imputations exhaustivement")
	@APIResponses(value = {
			@APIResponse(description = "Des imputations ajoutées exhaustivement",responseCode = "200", content = @Content(mediaType = MediaType.TEXT_PLAIN))
			,@APIResponse(description = "Erreur lors de l'ajout exhaustif des imputations",responseCode = "500", content = @Content(mediaType = MediaType.APPLICATION_JSON))
	})
	Response addImputationComprehensively(
		@Parameter(name = OperationDto.JSON_IDENTIFIER,description = "Identifiant")
		@QueryParam(OperationDto.JSON_IDENTIFIER) String identifier
			
		,@Parameter(name = OperationDto.JSON_ACTS_IDENTIFIERS,description = "Identifiants imputations")
		@QueryParam(OperationDto.JSON_ACTS_IDENTIFIERS) List<String> actsIdentifiers
			
		,@Parameter(name = OperationDto.JSON___AUDIT_WHO__,description = "Audit acteur")
		@QueryParam(OperationDto.JSON___AUDIT_WHO__) String auditWho);
	
	@POST
	@Path("imputations-filtres")
	@Produces({MediaType.TEXT_PLAIN})
	@Operation(description = "Ajouter des imputations filtrées")
	@APIResponses(value = {
			@APIResponse(description = "Des imputations filtrées ajoutées",responseCode = "200", content = @Content(mediaType = MediaType.TEXT_PLAIN))
			,@APIResponse(description = "Erreur lors de l'ajout des imputations filtrées",responseCode = "500", content = @Content(mediaType = MediaType.APPLICATION_JSON))
	})
	Response addImputationByFilter(
		@Parameter(name = OperationDto.JSON_IDENTIFIER,description = "Identifiant")
		@QueryParam(OperationDto.JSON_IDENTIFIER) String identifier
			
		,@Parameter(name = PARAMETER_NAME_FILTER_AS_STRING,description = PARAMETER_NAME_FILTER_AS_STRING_DESCRIPTION_FRENCH)
		@QueryParam(PARAMETER_NAME_FILTER_AS_STRING) String filterAsString
		
		,@Parameter(name = PARAMETER_NAME_FILTER_FORMAT,description = PARAMETER_NAME_FILTER_FORMAT_DESCRIPTION_FRENCH)
		@QueryParam(PARAMETER_NAME_FILTER_FORMAT) FilterFormat filterFormat
		
		,@Parameter(name = OperationDto.JSON_EXISTING_IGNORABLE,description = "Existant ignorable")
		@QueryParam(OperationDto.JSON_EXISTING_IGNORABLE) Boolean existingIgnorable
			
		,@Parameter(name = OperationDto.JSON___AUDIT_WHO__,description = "Audit acteur")
		@QueryParam(OperationDto.JSON___AUDIT_WHO__) String auditWho);
	
	/* Remove Imputation */
	
	@DELETE
	@Path("imputations")
	@Produces({MediaType.TEXT_PLAIN})
	@Operation(description = "Retirer des imputations")
	@APIResponses(value = {
			@APIResponse(description = "Des imputations retirées",responseCode = "200", content = @Content(mediaType = MediaType.TEXT_PLAIN))
			,@APIResponse(description = "Erreur lors du retrait des imputations",responseCode = "500", content = @Content(mediaType = MediaType.APPLICATION_JSON))
	})
	Response removeImputation(
		@Parameter(name = OperationDto.JSON_IDENTIFIER,description = "Identifiant")
		@QueryParam(OperationDto.JSON_IDENTIFIER) String identifier
		
		,@Parameter(name = OperationDto.JSON_ACTS_IDENTIFIERS,description = "Identifiants imputations")
		@QueryParam(OperationDto.JSON_ACTS_IDENTIFIERS) List<String> imputationsIdentifiers
		
		,@Parameter(name = OperationDto.JSON_EXISTING_IGNORABLE,description = "Existant ignorable")
		@QueryParam(OperationDto.JSON_EXISTING_IGNORABLE) Boolean existingIgnorable
		
		,@Parameter(name = OperationDto.JSON___AUDIT_WHO__,description = "Audit acteur")
		@QueryParam(OperationDto.JSON___AUDIT_WHO__) String auditWho);
	
	@DELETE
	@Path("imputations-exhaustifs")
	@Produces({MediaType.TEXT_PLAIN})
	@Operation(description = "Retirer des imputations exhaustivement")
	@APIResponses(value = {
			@APIResponse(description = "Des imputations retirées exhaustivement",responseCode = "200", content = @Content(mediaType = MediaType.TEXT_PLAIN))
			,@APIResponse(description = "Erreur lors du retrait exhaustif des imputations",responseCode = "500", content = @Content(mediaType = MediaType.APPLICATION_JSON))
	})
	Response removeImputationComprehensively(
		@Parameter(name = OperationDto.JSON_IDENTIFIER,description = "Identifiant")
		@QueryParam(OperationDto.JSON_IDENTIFIER) String identifier
			
		,@Parameter(name = OperationDto.JSON_ACTS_IDENTIFIERS,description = "Identifiants imputations")
		@QueryParam(OperationDto.JSON_ACTS_IDENTIFIERS) List<String> imputationsIdentifiers
			
		,@Parameter(name = OperationDto.JSON___AUDIT_WHO__,description = "Audit acteur")
		@QueryParam(OperationDto.JSON___AUDIT_WHO__) String auditWho);
	
	@DELETE
	@Path("imputations-filtres")
	@Produces({MediaType.TEXT_PLAIN})
	@Operation(description = "Retirer des imputations filtrées")
	@APIResponses(value = {
			@APIResponse(description = "Des imputations filtrées retirées",responseCode = "200", content = @Content(mediaType = MediaType.TEXT_PLAIN))
			,@APIResponse(description = "Erreur lors du retrait des imputations filtrées",responseCode = "500", content = @Content(mediaType = MediaType.APPLICATION_JSON))
	})
	Response removeImputationByFilter(
		@Parameter(name = OperationDto.JSON_IDENTIFIER,description = "Identifiant")
		@QueryParam(OperationDto.JSON_IDENTIFIER) String identifier
			
		,@Parameter(name = PARAMETER_NAME_FILTER_AS_STRING,description = PARAMETER_NAME_FILTER_AS_STRING_DESCRIPTION_FRENCH)
		@QueryParam(PARAMETER_NAME_FILTER_AS_STRING) String filterAsString
		
		,@Parameter(name = PARAMETER_NAME_FILTER_FORMAT,description = PARAMETER_NAME_FILTER_FORMAT_DESCRIPTION_FRENCH)
		@QueryParam(PARAMETER_NAME_FILTER_FORMAT) FilterFormat filterFormat
		
		,@Parameter(name = OperationDto.JSON_EXISTING_IGNORABLE,description = "Existant ignorable")
		@QueryParam(OperationDto.JSON_EXISTING_IGNORABLE) Boolean existingIgnorable
			
		,@Parameter(name = OperationDto.JSON___AUDIT_WHO__,description = "Audit acteur")
		@QueryParam(OperationDto.JSON___AUDIT_WHO__) String auditWho);
	
	/* Execution */
	
	@POST
	@Path("execution")
	@Produces({MediaType.APPLICATION_JSON})
	@Operation(description = "Démarrer l'exécution")
	@APIResponses(value = {
			@APIResponse(description = "L'exécution démarrée",responseCode = "200", content = @Content(mediaType = MediaType.APPLICATION_JSON))
			,@APIResponse(description = "Erreur lors du démarrage de l'exécution",responseCode = "500", content = @Content(mediaType = MediaType.APPLICATION_JSON))
	})
	Response startExecution(
		@Parameter(name = OperationDto.JSON_IDENTIFIER,description = "Identifiant")
		@QueryParam(OperationDto.JSON_IDENTIFIER) String identifier
		
		,@Parameter(name = OperationDto.JSON___AUDIT_WHO__,description = "Audit acteur")
		@QueryParam(OperationDto.JSON___AUDIT_WHO__) String auditWho
	);
	
	String PARAMETER_NAME_BLOCKING = "bloquant";
}