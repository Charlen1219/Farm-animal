// Test.java
import java.util.ArrayList;
public class Test {
   public static void main(String[] args) {
       ArrayList<FarmAnimal> arl = new ArrayList<FarmAnimal>();
       arl.add(new Chicken('M', 2, 2.5, false));
       arl.add(new Chicken('M', 4, 2.5, false));
       arl.add(new Chicken('F', 3, 3.5, false));
       arl.add(new Cow('F', 3, 250, true));
       arl.add(new Cow('F', 3, 270, true));
       for (int i = 0; i < arl.size(); i++) {
           arl.get(i).makeNoise();
           if(arl.get(i) instanceof Cow)
           ((Cow)arl.get(i)).howToEat();
           else if(arl.get(i) instanceof Chicken)
           ((Chicken)arl.get(i)).howToEat();
          
       }
   }
}