package animal;

public class AnimalBP {
    String specie;
    String color;
    int numLegs;
    boolean eggs;
    private String type;
    
    public AnimalBP(String specie, String color, int numLegs, boolean eggs){
    this.specie = specie;
    this.color = color;
    this.numLegs = numLegs;
    this.eggs = eggs;
    }
    
    public void printmethod(){
        System.out.println("Animal's specie is " + specie);
        System.out.println("Animal's color is " + color);
        System.out.println("Animal has " + numLegs + " legs.");
        System.out.println("Animal lays Egg? " + eggs);
    }
    
    public void settype(String type){
        this.type = type;
    }
    
    public void getType(){
        System.out.println("Animal is a/an " + type);
    }
}
