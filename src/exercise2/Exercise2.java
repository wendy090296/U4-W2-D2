package exercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Exercise2 {
    public static void main(String[] args){
        // generation of a random numbers' list between 0 and 100

        // method with an int as param.
        public static List<Integer>  generateRandomList(int n) {
            Random random= new Random();
            List<Integer> randomList= new ArrayList<>();
            for (int i=0, i < n; i++){
                randomList.add(random.nextInt(0,101));
            }

        }
    }

}
