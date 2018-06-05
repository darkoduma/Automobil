package person;

public class Teacher extends Person {

    private String mainSubject;
    private int experiance;

    public String getMainSubject() {
        return mainSubject;

    }
    
    public void setMainSubject(String mainSubject) {
        this.mainSubject = mainSubject;
    }
    
    public int getExperiance(){
        return experiance;
        
    }
    
    public Teacher(String name, String surname, String jmbg){
        super(name, surname, jmbg);
    }
    
    public Teacher (String name, String surname, String jmbg, String mainSubject, int experiance){
        super(name, surname, jmbg);
        this.mainSubject = mainSubject;
        this.experiance = experiance;
        
    }   
    
    @Override
    public void showData(){
       
       System.out.println("Main subject: " + getMainSubject());
       System.out.println("Experiance: " + getExperiance());
       super.showData();
   }

   
    

}
