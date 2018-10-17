class Farm  {     
   private Animal[] aBunchOfAnimals = new Animal[3];    
   public Farm()     {       
      aBunchOfAnimals[0] = new Cow("Cow","moo");           
      aBunchOfAnimals[1] = new Chick("Chick","cluck");       
      aBunchOfAnimals[2] = new Pig("Pig","oink");    }         
   public void animalSounds()    {       
     for (int nI=0; nI < aBunchOfAnimals.length; nI++)       {
       if (nI == 1)   {
       	 if (aBunchOfAnimals[1].getSound() == "Cheep!") {

     		System.out.print("The chick is feeling childish. ");
     	} else {
     		System.out.print("The chick is feeling grown up! ");
     	}
     	System.out.println(aBunchOfAnimals[1].getType() + " goes " + aBunchOfAnimals[1].getSound());
       }else if (nI != 1){         
       		System.out.println( aBunchOfAnimals[nI].getType() + " goes " + aBunchOfAnimals[nI].getSound() + "!");       
      	   }  
      	    System.out.println( "The cow is known as " + ((NamedCow)aBunchOfAnimals[0]).getName() );  
       }
 	 }
} 