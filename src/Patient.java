public class Patient {
    private String name; 
    private String condition;
    
    public Patient(String nm, int c){
        name = nm;
        if (c==0) condition= "Critical";
        else if (c==1) condition = "Serious";
        else if (c==2) condition = "Fair";
    }
    public String getName(){
        return name;
    }
    public String getCondition(){
        return condition;
    }
    public String toString(){
        return "NAME: " + name + "\t" + condition;
    }
}
