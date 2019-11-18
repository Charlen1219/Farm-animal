// Banana.java
public class Banana implements Edible {
   private boolean isRipe;
   public Banana(boolean isRipe) {
       this.isRipe = isRipe;
   }
   public void howToEat() {
       System.out.println("Peel It");
   }
}