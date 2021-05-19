import java.util.*;
public class RamblersState{
    public static void main(String[] args) {
        Random generator = new Random();
        System.out.println("1000 iterations");
        int runs = 0;
        int iter = 1000;
        double count = 7.0 / 2.0;
        int random;
        System.out.println("Run\tAvarage\tGreatest Number of Steps");
        for (iter = 1000; iter > 1; iter -= 1) {
            double tries = 1;
            double avg = count / tries;
            random = generator.nextInt(2);
            if (random == 0) {
                count -= 1;
            }
            if (random == 1) {
                count += 1;
            }
            if (count <= 0 || count >= 7) {
                System.out.println("#" + runs + ":\t" + avg + "\t" + count);
                count = 0;
                runs += 1;
            }
            tries += 1;
        }
    }
}