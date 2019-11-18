// FarmAnimal.java
public abstract class FarmAnimal {
   private char gender;
   private int age;
   private double weight;
   public FarmAnimal(char gender, int age, double weight) {
       this.gender = gender;
       this.age = age;
       this.weight = weight;
   }
   public char getGender() {
       return gender;
   }
   public void setGender(char gender) {
       this.gender = gender;
   }
   public int getAge() {
       return age;
   }
   public void setAge(int age) {
       this.age = age;
   }
   public double getWeight() {
       return weight;
   }
   public void setWeight(double weight) {
       this.weight = weight;
   }
   public abstract void makeNoise();
}