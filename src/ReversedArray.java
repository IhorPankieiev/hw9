public class ReversedArray {
    static void myReverse(int [] array){
        for (int i = array.length - 1; i >= 0; i--){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }//myReverse
    static int[] subArray (int [] array, int index, int count){
        int[] myArr = new int[count];
        for (int i = index, j = 0; j < count; i++, j++){
            if (i < array.length){
                myArr[j] = array[i];
            }
            else {
                myArr[j] = 1;
            }
        }
        return myArr;
    }//subArray

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] myArr = {3, 6, 2, 5};
        myReverse(array);
        int[] arr = subArray(myArr, 2, 10);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }//class
}//main
