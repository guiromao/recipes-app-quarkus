package co.trucom.resources;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import co.trucom.models.Recipe;
import co.trucom.services.RecipesService;

@Path("/recipes")
public class RecipesResource {

	@Inject
	RecipesService recipesService;

	@GET
	@Produces(value = MediaType.APPLICATION_JSON)
	public List<Recipe> allRecipes() {
		return recipesService.getRecipes();
	}

	@POST
	@Consumes(value = MediaType.APPLICATION_JSON)
	public void addRecipe(Recipe recipe) {
		recipesService.addRecipe(recipe);
	}

}
