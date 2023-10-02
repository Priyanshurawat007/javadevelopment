package CodeWithHarry;

class Animal {
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}
// pig class extends the properties of Animal Class
class Pig extends Animal {
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
}
// Dog class extends the properties of Animal Class
class Dog extends Animal {
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
}
// It's the main class 
public class polymorhism2 {
  public static void main(String[] args) {
    Animal myAnimal = new Animal();
    Animal myPig = new Pig();
    Animal myDog = new Dog();
        
    myAnimal.animalSound();
    myPig.animalSound();
    myDog.animalSound();
  }
}
