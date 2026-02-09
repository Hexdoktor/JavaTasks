import java.util.Random;

public class GenerateAges {
    public static void main(String[] args){
        int [] ages = {19,20,21,22,23,24,25,26,27,28};
        double [] probabilities = {0.1,0.1,0.1,0.1,0.1,0.1,0.1,0.1,0.1,0.1};
        double [] cumulative = new double[probabilities.length];
        int [] count = new int[ages.length];

        Random rng = new Random();


        double cumulativeProbability = 0;
        for(int i = 0; i < probabilities.length; i++){
            cumulativeProbability += probabilities[i];
            cumulative[i] = cumulativeProbability;
        }


        for(int k = 0; k < 1000; k++){
            double u = rng.nextDouble();

            int index = 0;
            while(index < cumulative.length && cumulative[index] < u){
                index++;
            }
            count[index]++;
        }

        for(int i = 0; i < ages.length; i++){
            System.out.println("Age "+ ages[i]+": "+count[i]);
        }
    }
}
