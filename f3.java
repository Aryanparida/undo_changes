//generate to 100 random numbers
import java.util.Random;   
class f3 {
    public static void main(String[] args) {
        Random rand = new Random();
        for (int i = 0; i < 100; i++) {
            int randomNum = rand.nextInt(100); // generates a random number between 0 and 99
            System.out.println(randomNum);
        }
    }
}