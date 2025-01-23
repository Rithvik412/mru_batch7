package Assignments;

import java.util.Arrays;

public class ReverseElements {
    public static void main(String[] args) {
        int[] array = {101, 201, 301, 401, 501};

        System.out.println("Original Array: " + Arrays.toString(array));
        
        int i = 0; 
        while (i < array.length) {
            array[i] = reverseDigits(array[i]);
            i++; 
        }

        System.out.println("Reversed Elements: " + Arrays.toString(array));
    }

    
    private static int reverseDigits(int num) {
        int reversed = 0;
        while (num != 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return reversed;
    }
}
