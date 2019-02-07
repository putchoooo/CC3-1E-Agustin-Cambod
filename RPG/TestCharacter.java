public class TestCharacter {
    public static void main (String args[]){
        
        Character Darwin = new Character("Darwin",6,6,6);
        Character Cris = new Character("Cris",10,7,7);
     
        for(int i = 0; i < 3; i++){
            System.out.println(Darwin.getName() + " has " + Darwin.getCurrentlife() + " life points.");
            System.out.println(Cris.getName() + " has " + Cris.getCurrentlife() + " life points.");
            
            if(Cris.getCurrentlife() <= 0){
                System.out.println("Cris lost and been defeated\n");
                break;
            }
            if(Darwin.getCurrentlife() <= 0){
                System.out.println("Darwin lost and been defeated\n");
                break;
            }
            
            System.out.println("\n------R O U N D " + (i+1) + "------");
            if (i%2 == 0){
                int a = Darwin.attack();
                Cris.wound(a);
                System.out.println("Darwin attacked Cris with " + a + " hit points\n");
            }
            else{
                int a = Cris.attack();
                Darwin.wound(a);
                System.out.println("Cris attacked Darwin with " + a + " hit points\n");
            }
        
        }
        //no one hit 0
        System.out.println("THE BATTLE HAS ENDED");
        System.out.println(Darwin.getName() + " has " + Darwin.getCurrentlife() + " life points.");
        System.out.println(Cris.getName() + " has " + Cris.getCurrentlife() + " life points.");
        if(Cris.getCurrentlife() > Darwin.getCurrentlife()){
            System.out.println("Cris won the battle!!");
        }
        else if(Darwin.getCurrentlife() > Cris.getCurrentlife()){
            System.out.println("Darwin won the battle!!");
        }
        else{
            System.out.println("It's  a draw!");
        }
    }
} 
