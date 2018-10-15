class Cow implements Animal {     
     private String myType;     
     private String mySound;      
     public Cow()     {         
         myType = "I'm a cow!";         
         mySound = "Moo!";     
     }      
     public String getSound(){return mySound;}     
     public String getType(){return myType;} 
}