import java.util.Random;

public class Assignment3_eliu1285601
{
	public static void main ( String [] args )
	{
		System.out.println();
		
		int random; //Creates an integer to hold the random integer
		
		SoundInterface animals [] = new SoundInterface [4]; //Array of the different animals
		
		animals[0] = new Chihuahua(); //Giving each animal a part in the array
		animals[1] = new FrenchPoodle();
		animals[2] = new Robin();
		animals[3] = new Bluebird();

		Random number = new Random(); //Makes a random number generator
		
		for(int i = (number.nextInt(10)+1); i>0; i--) //Runs the loop 1 to 10 times
		{
			random = number.nextInt(4); //Makes a random number for which animal to make a sound
			animals[random].makeSound(); //Makes that animal make a sound
			System.out.println();
		}
	}
}