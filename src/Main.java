import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


//Имея два отсортированных массива размера m и n соответственно, вам нужно найти элемент, который будет находиться на k-й позиции в конечном отсортированном массиве.
//Массив 1 - 100 112 256 349 770
//Массив 2 - 72 86 113 119 265 445 892
//к = 7
//Вывод : 256
//Окончательный отсортированный массив -
//72, 86, 100, 112, 113, 119, 256, 265, 349, 445, 770, 892
//7-й элемент этого массива равен 256.
int k=7;
        int[] arrL = {100, 112, 256, 349, 770};
        int[] arrR = {72, 86, 113, 119, 265, 445, 892};
        System.out.println(Arrays.toString(merge1(arrL, arrR)));
          int i =merge1(arrL, arrR)[k];
        System.out.println("____"+i);

        //Имея отсортированный массив arr[] и число x, напишите функцию, которая подсчитывает вхождения x в arr[]. Ожидаемая временная сложность O(Log n)
        //arr[] = {1, 1, 2, 2, 2, 2, 3,}
        //x = 2
        //Вывод: 4 раза
      int  arr[] = {1, 1, 2, 2, 2, 2, 3};
       int x = 2;
       coincidences(arr,x);

    }
    static int[] merge1(int[]  arrL, int [] arrR) {
        int[]arr=new int[arrR.length+arrL.length];

        int index1 = arrL.length;
        int index2 = arrR.length;
        for (int i = 0; i < index1; i++) {
            arr[i ] =  arrL[i];
        }

        for (int i = 0; i < index2; i++) {
            arr[arrL.length  + i]=  arrR[i];
        }

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < index1 && j < index2) {
            if (arrL[i] <= arrR[j]) {
                arr[k] = arrL[i];
                i++;
            } else {
                arr[k] = arrR[j];
                j++;
            }

            k++;
        }

        while (i < index1) {
            arr[k] = arrL[i];
            i++;
            k++;
        }

        while (j < index2) {
            arr[k] = arrR[j];
            j++;
            k++;
        }
        return arr;
    }
    public static void coincidences(int[] arr,int x){
        int number=0;
        for (int i = 0; i < arr.length ; i++) {

            if (arr[i]==x){
                number++;
            }

        }
        System.out.println(number);
    }

}