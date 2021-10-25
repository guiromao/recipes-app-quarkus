package co.trucom.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "recipes")
public class Recipe {

	@Id
	private Long id;

	private String name;
	private String preparation;
	private Integer kcal;

	public Recipe() {
	}

	public Recipe(String name, String preparation, Integer kcal) {
		this.name = name;
		this.preparation = preparation;
		this.kcal = kcal;
	}

	public Recipe(Long id, String name, String preparation, Integer kcal) {
		this.id = id;
		this.name = name;
		this.preparation = preparation;
		this.kcal = kcal;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPreparation() {
		return preparation;
	}

	public Integer getKcal() {
		return kcal;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPreparation(String prep) {
		preparation = prep;
	}

	public void setKcal(Integer kcal) {
		this.kcal = kcal;
	}

}
