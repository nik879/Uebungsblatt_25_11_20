package Beispiel_4;

public class ArraysDemo {
    public static void main(String[] args) {
        int [] array = {3,5,6,7,8,9};
        double [] arrayd = {3,5,6,7,8,9};
        int [] reverse;
        System.out.println("containsnumber:" + containsNumber(array, 2));
        System.out.println("calculateSum(array) = " + calculateSum(array));
        reverse = reverse(array);
        for (int i = 0; i < reverse.length; i++) {
            System.out.println("reverse ["+i+"]" + reverse[i]);
        }
        System.out.println("calcStats(array)-min = " + calcStats(arrayd)[0]);
        System.out.println("calcStats(array)-max = " + calcStats(arrayd)[1]);
        System.out.println("calcStats(array)-avg = " + calcStats(arrayd)[2]);
    }

    public static boolean containsNumber(int[] numbers, int n) {
        for (int i = 0; i<numbers.length; i++) {
            if (numbers[i] == n) {
                return true;
            }
        }
        return false;
    }

    public static int calculateSum(int[] numbers) {
        int sum=0;
        for (int i = 0; i < numbers.length; i++) {
            sum+=numbers[i];
        }
        return sum;
    }

    public static int[] reverse(int[] original) {
        int[] reverse=new int[6];
        int k=0;
        for (int i = original.length-1; i >= 0; i--) {
            reverse [k]=original[i];
            k++;
        }
        return reverse;
    }

    public static double[] calcStats(double[] input) {

        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        double sum = 0.0;
        double[] result = new double[3]; //3 elemente fuer min, max und avg

        for(int d = 0;d < input.length; d++) {
            if(input[d] < min) {
                min = input[d];
            }
            if(input[d] > max) {
                max = input[d];
            }
            sum += input[d];
        }

        result[0] = min;
        result[1] = max;
        result[2] = sum  / input.length;

        return result;
    }
}
