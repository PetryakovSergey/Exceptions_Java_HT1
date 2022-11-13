/*3. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, 
каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. 
Если длины массивов не равны, необходимо как-то оповестить пользователя.
*/

import java.util.ArrayList;

import javax.management.RuntimeErrorException;


public class ex4 {
    public static void main(String[] args) {
        double [] arr1 = {1,2,3,4,1};
        double [] arr2 = {4,1,4,1,0};
        System.out.println(divArray(arr1, arr2));
    }
    public static ArrayList<Double> divArray(double[]array1, double[]array2){
        int j =0;
        double val;
        ArrayList <Double>result = new ArrayList<Double>();
        if (array1.length!= array2.length){
            throw new RuntimeErrorException(null, "not equal arrays");
        }
        else {
            while (j< array1.length) {
                if (array2[j] ==0){
                    throw new RuntimeErrorException(null, "div by zero");
                }else{
                val = array1[j]/array2[j];
                result.add(val);
                j++;
                }
            }
        }
        return result;
        
    
    }
}
