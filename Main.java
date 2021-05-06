public class Main
{
	public static void main(String[] args)
	{
	    Dog d1 = new Dog();
		d1.move();
		
		Bird b1 = new Bird();
		b1.move();
		
		Animal[] animals = {d1, b1};
		findObjectCount(animals);
	}
	
	public static void findObjectCount(Animal[] animals){
	    int birdsCount = 0;
	    int dogsCount = 0;
	    
	    for (int i = 0 ; i<animals.length ; i++)
	    {
	        if (animals[i].getClass() == Class<Bird>)
	        {
	            birdsCount++;
	        }else if (animals[i].getClass() == Class<Dog>){
	            dogsCount++;
	        }
	    }
	    
	    System.out.println("Birds: " + birdsCount);
	    System.out.println("Dogs: " + dogsCount);
	}
}
