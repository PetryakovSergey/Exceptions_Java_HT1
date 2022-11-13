//1. Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
public class ex1 {
    public static void main(String[] args) {
        int[] arr = {23,425,1,2,5,1};
        Boundaries(arr);
        System.out.println(zeroDiv(5, 0));
        String s = "sdq133";
        StringToNumber(s);
    }

    public static int zeroDiv(int a, int b){
        return a/b;
    }
    public static void Boundaries(int []array){
        for (int i = 0; i <= array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public static int StringToNumber(String st){
        return Integer.parseInt(st);
    }
}
