import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Part 1
        Random rnd = new Random();
        int[] dataPoints = new int[100];
        for (int i = 0; i < dataPoints.length; i++){
           int val = rnd.nextInt(100) + 1;
           dataPoints[i] = val;
        }
        for (int i = 0; i < dataPoints.length; i++){
            System.out.printf(dataPoints[i] + " | ");
        }
        int dataSum = 0;
        double dataAvg = 0;
        for (int i = 0; i < dataPoints.length; i++){
           dataSum += dataPoints[i];
        }
        dataAvg = dataSum / dataPoints.length;
        System.out.printf("\nThe sum of dataPoints is: " + dataSum + " And the average is: " + dataAvg);

        //Part 2
        Scanner in = new Scanner(System.in);
        //2ab
        int userInt = SafeInput.getRangedInt(in, "Input a value within the range", 1, 100);
        int count = 0;
        for (int i = 0; i < dataPoints.length; i++){
            if (dataPoints[i] == userInt) {
                count++;
            }
        }
        System.out.printf("\n Your integer(" + userInt + ") was found in dataPoints " + count + " times." );
        //2c
        int userInt2 = SafeInput.getRangedInt(in, "Input a value within the range", 1, 100);
        count = 0;
        for (int i = 0; i < dataPoints.length; i++){
            if (dataPoints[i] == userInt) {
                System.out.printf("Your integer(" + userInt + ") was first found in dataPoints at array index position " + i);
                break;
            }
            count++;
        }
        if (count == dataPoints.length) {
            System.out.printf("Your integer(" + userInt + ") was not found in dataPoints");
        }

        //2d
        
    }
}