import java.util.Random;
import java.util.Scanner;
public class GetArrayed {
    //part 2e
    public static double getAverage(int values[]) {
        double sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        double average = sum / values.length;
        return average;
    }
    //part 3--extra credit
    public static int min(int values[]) {
        int min = values[0];
        for (int i = 0; i < values.length; i++) {
            if (values[i] <= min){
                min = values[i];
            }
        }
        return min;
    }
    public static int max(int values[]) {
        int max = values[0];
        for (int i = 0; i < values.length; i++) {
            if (values[i] >= max){
                max = values[i];
            }
        }
        return max;
    }
    public static int occuranceScan(int values[], int target) {
        int count = 0;
        for (int i = 0; i < values.length; i++){
            if (values[i] == target) {
                count++;
            }
        }
        return count;
    }
    public static int sum(int values[]) {
        int sum = 0;
        for (int i = 0; i < values.length; i++){
            sum += values[i];
        }
        return sum;
    }
    public static boolean contains(int values[], int target) {
        boolean found = false;
        for (int i = 0; i < values.length; i++){
            if (values[i] == target) {
                found = true;
                break;
            }
            else {
                found = false;
            }
        }
        return found;
    }
    public static void main(String[] args) {
        //Part 1
        Random rnd = new Random();
        int[] dataPoints = new int[100];
        for (int i = 0; i < dataPoints.length; i++){
           int val = rnd.nextInt(100) + 1;
           dataPoints[i] = val;
        } //populate dataPoints with random ints(1-100)
        for (int i = 0; i < dataPoints.length; i++){
            System.out.printf(dataPoints[i] + " | ");
        } //print all values in dataPoints
        double dataSum = 0;
        double dataAvg = 0;
        for (int i = 0; i < dataPoints.length; i++){
           dataSum += dataPoints[i];
        }
        dataAvg = dataSum / dataPoints.length; //calculate and print total sum and average of dataPoints[]
        System.out.printf("\nThe sum of dataPoints is: " + dataSum + " And the average is: " + dataAvg);

        //Part 2
        Scanner in = new Scanner(System.in);
        //2ab
        int userInt = SafeInput.getRangedInt(in, "Input a value to count within the range", 1, 100);
        int count = 0;
        for (int i = 0; i < dataPoints.length; i++){
            if (dataPoints[i] == userInt) {
                count++;
            }
        } //Count # of times userInt is found in dataPoints, print resulting #
        System.out.printf("Your integer(%d) was found in dataPoints %d times.", userInt, count);

        //2c
        int userInt2 = SafeInput.getRangedInt(in, "Input a value to search for within the range", 1, 100);
        count = 0;
        for (int i = 0; i < dataPoints.length; i++){
            if (dataPoints[i] == userInt2) {
                System.out.printf("Your integer(%d) was first found in dataPoints at array index position %d", userInt2, i);
                break;
            }
            count++;
        }
        if (count == dataPoints.length) {
            System.out.printf("Your integer(%d) was not found in dataPoints", userInt2);
        } //Using another user input, find first position of user input # in dataPoints if any

        //2d
        int min = dataPoints[0];
        int max = dataPoints[0];
        for (int i = 0; i < dataPoints.length; i++){
            if (dataPoints[i] >= max){
                max = dataPoints[i];
            }
            if (dataPoints[i] <= min){
                min = dataPoints[i];
            }
        }
        System.out.printf("\nMinimum: %d \nMaximum: %d", min, max);
        //2e output
        System.out.println("\nAverage of dataPoints is: " + getAverage(dataPoints));

        //part 3 outputs/method tests
        System.out.println("Min of array: " + min(dataPoints));
        System.out.println("Max of array: " + max(dataPoints));
        int countTarget = SafeInput.getRangedInt(in, "Input target value to count",1,100);
        System.out.print("Target occurs " + occuranceScan(dataPoints,countTarget) + " times in array.");
        System.out.println("Sum of array: " + sum(dataPoints));
        int containTarget = SafeInput.getRangedInt(in, "Input target value to see if it is in the dataset", 1, 100);
        if(contains(dataPoints, containTarget)) {
            System.out.print(containTarget + " is in the dataset!");
        }
        else {
            System.out.print(containTarget + " is not in the dataset :(");
        }
    }
}