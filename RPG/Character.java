public class Character {
    private String name;
    private int strength;
    private int dexterity;
    private int intelligence;
    private int currentlife;
    private int maxlife;
    Dice dice = new Dice();
    
    public Character(String n, int s, int d,int i){
    this.name=n;
    this.strength=s;
    this.dexterity=d;
    this.intelligence=i;
    this.maxlife = (dice.roll()* this.strength);
    this.currentlife = maxlife;
    }
   
    public String getName(){
        return name;
    }
    public int getStrength(){
        return strength;
    }
    public int getDexterity(){
        return dexterity;
    }
    public int getIntelligence(){
        return intelligence;
    }
    public int getCurrentlife(){
        return currentlife;
    }
    public int getMaxlife(){
        return maxlife;
    }
    public void setName(String n){
        this.name=n;
    }
    public void setStrength(int s){
        this.strength=s;
    }
    public void setDexterity(int d){
        this.dexterity=d;
    }
    public void setIntelligence(int i){
        this.intelligence=i;
    }
    public void setCurrentlife(int currentlife){
        this.currentlife=maxlife;
    }
    public void setMaxlife(int maxlife){
        this.maxlife=maxlife;
    }
     public int attack(){
        return dice.roll() * strength;
    }
    public void wound(int damage){
        currentlife=currentlife-damage;
    }
    public void heal(int heal){
        heal=currentlife+heal;
    }
}
