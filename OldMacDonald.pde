
void setup()
{
	Animal betsy = new Cow();
	Animal donald = new Chick();
	Animal pearl = new Pig();

	System.out.println(betsy.getType());
	System.out.println(donald.getType());
	System.out.println(pearl.getType());

	System.out.println(betsy.getSound());
	System.out.println(donald.getSound());
	System.out.println(pearl.getSound());
}

