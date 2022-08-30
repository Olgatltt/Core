package task1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int[][] array = new int[5][5];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(100);

                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Min: " + getMinValue(array) + "\n" + "Max: " + getMaxValue(array) +
                "\n" + "AVG: " + average(array));
    }

    public static double average(int[][] numbers) {
        int indexCounter = 0;
        double sum = 0;
        double average = 0;
        for (int j = 0; j < numbers.length; j++) {
            for (int i = 0; i < numbers[j].length; i++) {
                sum += numbers[j][i];
                indexCounter++;
            }
        }
        average = sum / indexCounter;
        return average;
    }

    public static int getMaxValue(int[][] numbers) {
        int maxValue = numbers[0][0];
        for (int j = 0; j < numbers.length; j++) {
            for (int i = 0; i < numbers[j].length; i++) {
                if (numbers[j][i] > maxValue) {
                    maxValue = numbers[j][i];
                }
            }
        }
        return maxValue;
    }

    public static int getMinValue(int[][] numbers) {
        int minValue = numbers[0][0];
        for (int j = 0; j < numbers.length; j++) {
            for (int i = 0; i < numbers[j].length; i++) {
                if (numbers[j][i] < minValue) {
                    minValue = numbers[j][i];
                }
            }
        }
        return minValue;
    }
}
