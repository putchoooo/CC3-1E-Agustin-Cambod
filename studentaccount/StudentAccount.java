package studentaccount;

public class StudentAccount {

    public static void main(String[] args) {
    StudentInfo Cris = new StudentInfo("College of Information Techonology and Computer Sciences", "2nd Term", "2018 - 2019");
    Cris.setidNumber("18-4274-140");
    Cris.setfamilyName("Cambod");
    Cris.setfirstName("Christopher");
    Cris.setacademicProgram("BSIT");
    Cris.settrack("Web Track");
    Cris.printall();
        System.out.println("\n");
    StudentInfo Darwin = new StudentInfo("College of Information Techonology and Computer Sciences", "2nd Term", "2018 - 2019");
    Darwin.setidNumber("18-3909-638");
    Darwin.setfamilyName("Agustin");
    Darwin.setfirstName("Darwin Dale Jr");
    Darwin.setacademicProgram("BSIT");
    Darwin.settrack("ERP Track");
    Darwin.printall();
    
    
        System.out.println((Darwin.getidNumber()) + "\n" + Darwin.getfamilyName() + "," + Darwin.getfirstName());
        System.out.println(Darwin.college + "\n"+Darwin.term);
    System.out.println((Cris.university) + "\n" + (Cris.getidNumber())+ "\n" + Cris.getfamilyName());
    
    StudentInfo Bruno = new StudentInfo("Dropout", "2nd Term", "2018 - 2019");
    Bruno.university = "None";
        System.out.println(Bruno.university);
        
    StudentInfo Cray = new StudentInfo("Stripper", "No Term", "2018 - 2019");
    Cray.setfamilyName ("Serenity");
    Cray.setfirstName ("Cray");
    Cray.setacademicProgram("Pole Dancing");
     Cray.settrack("Pleasure Track");
    Cray.setidNumber("18-3909-638");
    Cray.university = "Strip Club";
    Cray.printall();
        System.out.println("");
    }  
}
