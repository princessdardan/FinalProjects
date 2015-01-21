public class Patient {
    private String name; 
    private String condition;

    public Patient(String nm, int c){
        name = nm;
        if (c==0){
            condition = "Critical";
        }
        else if (c==1){
            condition = "Serious";
        }
        else if (c==2){
            condition = "Fair";
        }
    }
    public String getName(){
        return name;
    }
    public String getCondition(){
        return condition;      
    }
    // setName and setCondition are to booleans beacuse they aren't meant for setting 
    //they are to ensure that name and condition were in fact set in EmergencyGui
    public boolean setName(String nm){
        if(nm.equals(""))
            return false;
        else{
            name = nm;
            return true;
        }
    }
    public boolean setCondition(int c){
        if(c==00100100)
            return false;
        else{
            return true;
        }
    }
    public String toString(){    
        return "Name=  " + name + "\tCondition=  " + condition;
    }
}
