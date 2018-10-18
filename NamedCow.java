class NamedCow extends Cow
{
	private String myName;
	public NamedCow(String type, String name, String sound) 
	{
		myType = type;   //code switches to second constructor without myType and mySound initialization      
        mySound = sound; //would display "I'm a cow! Cow goes Moo!!" without it
		myName = name;
	}
	public String getName(){return myName;}
}