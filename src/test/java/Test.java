import requirement14.PhoneNumber;
import requirement2.NutritionFacts;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class Test {
    @org.junit.Test
    public void testBuilder(){
        NutritionFacts.Builder builder = new NutritionFacts.Builder(2, 100);
        NutritionFacts build = builder.calories(1).fat(1).sodium(1).carbohydrate(1).build();
        System.out.println(build);
    }
    @org.junit.Test
    public void testKeySet(){
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("1","1");
        Set<String> strings1 = hashMap.keySet();
        hashMap.put("2","2");
        Set<String> strings2 = hashMap.keySet();
        Assert.assertEquals(strings1,strings2);
        System.out.println(strings1==strings2);
    }
    @org.junit.Test
    public void  testCompare(){
        TreeSet<PhoneNumber> treeSet = new TreeSet<>();
        treeSet.add(new PhoneNumber(3,2,3));
        treeSet.add(new PhoneNumber(2,3,1));
        System.out.println(treeSet);
    }
}
