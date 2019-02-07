package studentaccount;

public class StudentInfo {
    String university;
    String college;
    String term;
    String SY;
    private String idNumber;
    private String familyName;
    private String firstName;
    private String academicProgram;
    private String track;
    
    public StudentInfo(String college, String term, String SY){
        this.college = college;
        this.term = term;
        this.SY = SY;
        this.university = "University of the Cordilleras";
    }
    public void setidNumber(String idNumber){
        this.idNumber = idNumber;
    }
    public String getidNumber(){
        return this.idNumber;
    }
    public void setfamilyName(String familyName){
        this.familyName = familyName;
    }
    public String getfamilyName(){
        return this.familyName;
    }
    public void setfirstName(String firstName){
        this.firstName = firstName;
    }
    public String getfirstName(){
        return this.firstName;
    }
    public void setacademicProgram(String academicProgram){
        this.academicProgram = academicProgram;
    }
    public String getacademicProgram(){
        return this.academicProgram;
    }
    public void settrack(String track){
        this.track = track;
    }
    public String track(){
        return this.track;
    }
    
    public void printall(){
        System.out.println(this.university + "\n" + this.college + "\n" + this.term + ", S.Y. " + this.SY + "\n\nStudent Info:\n ID NUM:" +this.idNumber + "\n Name: " + this.familyName + ", " + this.firstName + "\n Academic Program: " + this.academicProgram + " - " + this.track);
    }
    
    
}
