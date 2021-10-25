package co.trucom.services;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import co.trucom.models.Recipe;

@ApplicationScoped
@Transactional
public class RecipesService {
	
	@Inject
	EntityManager entityManager;
	
	public List<Recipe> getRecipes() {
		return entityManager.createQuery("SELECT r from Recipes r", Recipe.class).getResultList();
	}

	public void addRecipe(Recipe recipe) {
		entityManager.persist(recipe);
	}

}
