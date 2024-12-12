public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder builder = new MealBuilder();
        MealDirector director = new MealDirector();
        director.constructMeal(builder);
        Meal meal = builder.build();
        System.out.println(meal);
    }
}