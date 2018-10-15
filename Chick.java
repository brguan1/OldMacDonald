class Chick implements Animal 
{     
     private String myType;     
     private String mySound;      
     public Chick()     {         
         myType = "I'm a chick!";         
         mySound = "Cluck!";     
     }      
     public String getSound(){return mySound;}     
     public String getType(){return myType;} 
}
