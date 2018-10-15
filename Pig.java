class Pig implements Animal 
{     
     private String myType;     
     private String mySound;      
     public Pig()     {         
         myType = "I'm a pig!";         
         mySound = "Oink!";     
     }      
     public String getSound(){return mySound;}     
     public String getType(){return myType;} 
}
