class Farm  {     
   private Animal[] aBunchOfAnimals = new Animal[3];    
   public Farm()     {       
      aBunchOfAnimals[0] = new Cow("Cow","moo");           
      aBunchOfAnimals[1] = new Chick("Chick","cluck");       
      aBunchOfAnimals[2] = new Pig("Pig","oink");    }         
   public void animalSounds()    {       
     for (int nI=0; nI < 2; nI++)       {
       if (nI == 1)   {
       	 if (aBunchOfAnimals[1].getRandomSound() <1)
     	{
     		System.out.print("The chick is feeling childish. ");
     	} else {
     		System.out.print("The chick is feeling grown up! ");
     	}
     	System.out.println(aBunchOfAnimals[1].getType() + " goes " + aBunchOfAnimals[1].getSound());
    } else {         
       		System.out.println( aBunchOfAnimals[nI].getType() + " goes " + aBunchOfAnimals[nI].getSound() + "!");       
      	   }    
       } 
 	 }
} 