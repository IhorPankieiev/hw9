public class UserArray {
    static void increase (int[] array, int value){
        int[] myArr = new int[array.length + 1];
        for (int i = 0; i < myArr.length; i++){
            if (i == 0){
                myArr[i] = value;
            }
            else {
                myArr[i] = array[i - 1];
            }
            System.out.print(myArr[i] + " ");
        }
    }//increase

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6};
        increase(arr, 13);
    }//main
}//class
