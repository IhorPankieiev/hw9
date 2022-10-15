import java.util.Scanner;

public class CustomerArray {
    static void array(int num){
        int[] array = new int[num];

        for (int i = 0; i < array.length; i++ ){
            array[i] = (int)((Math.random() * 30) - 10);
        }

        for (int i = 0; i < array.length; i++){
        System.out.print(" " + array[i]);
        }
        System.out.println();
// мінімальне та максимальне значення
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] < min){
                min = array[i];
            }
            if (array[i] > max){
                max = array[i];
            }
        }
        System.out.println("Max value:" + max);
        System.out.println("Min value:" + min);
//сумма всіх елементів
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        System.out.println("Sum of all elements is:" + sum);
//середнє арефметичне
        int average = 0;
        for (int i = 0; i < array.length; i++){
            average += array[i];
        }
        average /= array.length;
        System.out.println("Arithmetical average is:" + average);
//всі непарні значення
        System.out.print("Odd numbers in this array are:");
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2 != 0) {
                System.out.print(array[i] + " ");
            }
        }

    }
    public static void main(String[] args) {
        Scanner entNum = new Scanner(System.in);
        int num = entNum.nextInt();
        array(num);

    }//main
}//class
