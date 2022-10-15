public class Task6 {
    static int[][] array (int[][] myArr3, int[][] myArr1, int[][] myArr2){
        for (int i = 0; i < myArr3.length; i++){
            for (int j = 0; j < myArr3.length; j++){
                myArr3[i][j] = myArr1[i][j] + myArr2[i][j];
            }
        }
        return myArr3;
    }//array

    public static void main(String[] args) {
        //значення першого масиву
        int[][] myArr1 = new int[3][3];
        for (int i = 0; i < myArr1.length; i++){
            for (int j = 0; j < myArr1.length; j++){
                myArr1[i][j] = i + j;
            }
        }
        System.out.println();

        for (int i = 0; i < myArr1.length; i++){
            for (int j = 0; j < myArr1.length; j++){
                System.out.print(myArr1[i][j] + " ");
            }
            System.out.println();
        }
        //значення другого масиву
        int[][] myArr2 = new int[3][3];
        for (int i = 0; i < myArr2.length; i++){
            for (int j = 0; j < myArr2.length; j++){
                myArr2[i][j] = (int)( (Math.random() * 7) - 1);
            }
        }
        System.out.println();

        for (int i = 0; i < myArr2.length; i++){
            for (int j = 0; j < myArr2.length; j++){
                System.out.print(myArr2[i][j] + " ");
            }
            System.out.println();
        }
        //значення третього масиву
        int[][] myArr3 = new int[3][3];
        array(myArr3, myArr1, myArr2);
        System.out.println();

        for (int i = 0; i < myArr3.length; i++){
            for (int j = 0; j < myArr3.length; j++){
                System.out.print(myArr3[i][j] + " ");
            }
            System.out.println();
        }
    }//main
}//class
