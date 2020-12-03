import Requirement2.NutritionFacts;

public class Test {
    @org.junit.Test
    public void testBuilder(){
        NutritionFacts.Builder builder = new NutritionFacts.Builder(2, 100);
        NutritionFacts build = builder.calories(1).fat(1).sodium(1).carbohydrate(1).build();
        System.out.println(build);
    }
}
