package numeric;

// A Java program to demonstrate random number generation
// using java.util.Random;
import java.util.Random;
   
public class RandomExample{
   
    public static void main(String args[])
    {
        // create instance of Random class
        Random rand = new Random();
   
        // Generate random integers in range 0 to 999
        int rand_int1 = rand.nextInt(1000);
        int rand_int2 = rand.nextInt(1000);
   
        // Print random integers
        System.out.println("Random Integers: "+rand_int1);
        System.out.println("Random Integers: "+rand_int2);
   
        // Generate Random doubles
        double rand_dub1 = rand.nextDouble(0,200);
        double rand_dub2 = rand.nextDouble(50);
   
        // Print random doubles
        System.out.println("Random Doubles: "+rand_dub1);
        System.out.println("Random Doubles: "+rand_dub2);
        
        
        boolean randomBoolean = rand.nextBoolean();
        
        System.out.println("Random boolean: "+randomBoolean);
        
    }
}