// generate some random numbers
import java.util.Random;
class f2 {
    public static void main(String[] args) {
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            int randomNum = rand.nextInt(100); // generates a random number between 0 and 99
            System.out.println(randomNum);
        }
    }
}