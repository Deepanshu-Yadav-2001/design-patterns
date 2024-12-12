public class MealBuilder {
    private String mainCourse;
    private String sideDish;
    private String drink;
    private String dessert;

    public String getMainCourse() {
        return mainCourse;
    }

    public String getSideDish() {
        return sideDish;
    }

    public String getDrink() {
        return drink;
    }

    public String getDessert() {
        return dessert;
    }

    public MealBuilder mainCourse(String mainCourse) {
        this.mainCourse = mainCourse;
        return this;
    }

    public MealBuilder sideDish(String sideDish) {
        this.sideDish = sideDish;
        return this;
    }

    public MealBuilder drink(String drink) {
        this.drink = drink;
        return this;
    }

    public MealBuilder dessert(String dessert) {
        this.dessert = dessert;
        return this;
    }

    public Meal build() {
        return new Meal(this);
    }
}
