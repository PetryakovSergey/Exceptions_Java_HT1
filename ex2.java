//Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?

public class ex2 {
    public static void main(String[] args) {
        String [][] matrix = {{"11","22",},{"33","44"}, {"55","66"}};
        System.out.println(sum2d(matrix));
    }
    public static int sum2d(String[][]arr){
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < 5; j++) {
                    int val = Integer.parseInt(arr[i][j]);
                    sum += val;
                }
            }
            return sum;
        }
}

/*
1. NumberFormatException
2. NullPointerException
3. ArrayIndexOutOfBoundsException
4. 
*/