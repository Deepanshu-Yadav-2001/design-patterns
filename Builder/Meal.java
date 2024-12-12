public class Meal {
    private String mainCourse;
    private String sideDish;
    private String drink;
    private String dessert;

    public Meal(MealBuilder mealBuilder) {
        this.mainCourse = mealBuilder.getMainCourse();
        this.sideDish = mealBuilder.getSideDish();
        this.drink = mealBuilder.getDrink();
        this.dessert = mealBuilder.getDessert();
    }

    @Override
    public String toString() {
        return "Meal [Main Course=" + mainCourse + ", Side Dish=" + sideDish + ", Drink=" + drink + ", Dessert=" + dessert + "]";
    }
}
