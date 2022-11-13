import java.util.ArrayList;

import javax.management.RuntimeErrorException;

/*3. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, 
каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. 
Если длины массивов не равны, необходимо как-то оповестить пользователя.*/

public class ex3 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,1};
        int[] arr2 = {4,1,4,1,1,4};
        System.out.println(diffArray(arr1, arr2));
    }
    public static ArrayList<Integer> diffArray(int[]array1, int[]array2){
        int j =0;
        int val;
        ArrayList <Integer>result = new ArrayList<Integer>();
        if (array1.length!= array2.length){
            throw new RuntimeErrorException(null, "not equal arrays");
        }
        else {
            while (j< array1.length) {
                
                val = array1[j]-array2[j];
                result.add(val);
                j++;
                
            }
        }
        return result;
        
    }
}
