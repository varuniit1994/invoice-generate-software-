package entity;

public class Meal {
	
	private Integer perMealCost;
	private Integer mealGST;
	public Meal(Integer perMealCost, Integer mealGST) {
		super();
		
	}
	public Meal() {
		super();
		this.perMealCost = 100;
		this.mealGST = 12;
	}
	
	public Integer getPerMealCost() {
		return perMealCost;
	}
	
	public void setPerMealCost(Integer perMealCost) {
		this.perMealCost = perMealCost;
	}
	public Integer getMealGST() {
		return mealGST;
	}
	public void setMealGST(Integer mealGST) {
		this.mealGST = mealGST;
	}
	@Override
	public String toString() {
		return "Meal [perMealCost=" + perMealCost + ", mealGST=" + mealGST + "]";
	}
	

}
