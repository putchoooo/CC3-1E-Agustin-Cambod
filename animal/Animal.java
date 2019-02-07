package animal;

public class Animal {
    public static void main(String[] args) {
        
    AnimalBP Dog = new AnimalBP("Mammal", "Brown", 4, false);
        System.out.println("D O G");
        Dog.settype("Azkal");
        Dog.getType();
        Dog.printmethod();
        System.out.println("");
        
    AnimalBP Cat = new AnimalBP("Mammal", "Purple", 4, false);
        System.out.println("C A T");
        Cat.settype ("Pusa");
        Cat.getType();
        Cat.printmethod();
        System.out.println("");
    
    AnimalBP Bird = new AnimalBP("Bird", "Green", 2, true);
        System.out.println("P A R R O T");
        Bird.settype ("Parot");
        Bird.getType();
        Bird.printmethod();
        System.out.println("");
    
    AnimalBP Turtle = new AnimalBP("Reptile", "Green", 4, true);
        System.out.println("T U R T L E");
        Turtle.settype ("SeaTurtle");
        Turtle.getType();
        Turtle.printmethod();
        System.out.println("");
    
    
    }
}