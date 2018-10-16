class Chick implements Animal 
{     
     private String myType;     
     private String mySound;
     private int randomSound;      
     public Chick(String type, String sound)     {         
         myType = type;         
         mySound = sound;     
     }     
     public Chick()     {         
         myType = "I'm a chick!";
         mySound = "Cluck!";         
         randomSound = (int)(Math.random()*2)+1;     
     }      
     public String getSound()
     {
     	if (randomSound <1)
     	{
     		mySound = "Cheep!";
     	} else {
     		mySound = "Cluck!";
     	}
     	return mySound;
     }     
     public String getType(){return myType;}
     public int getRandomSound(){return randomSound;} 
}
