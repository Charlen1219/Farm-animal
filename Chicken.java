// Chicken.java
public class Chicken extends FarmAnimal implements Edible{
   private boolean isHavingBirdFlu;
   public Chicken(char gender, int age, double weight, boolean isHavingBirdFlu) {
       super(gender, age, weight);
       this.isHavingBirdFlu = isHavingBirdFlu;
   }
   public void makeNoise() {
       System.out.println("CLUK CLUK");
   }
   public void howToEat() {
       System.out.println("Fry it");
      
   }
}
