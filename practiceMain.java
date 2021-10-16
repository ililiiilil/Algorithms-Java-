public class practiceMain {
    public static void main(String[] args) {
        int sum = 0;
        int[][] matrix = {{0, 1, 1, 2}, {0, 5, 0, 0}, {2, 0, 3, 3}};
        int len = matrix[0].length;

        for (int i = 0; i < len; i++){
            for (int j = 0; j < matrix.length - 1; j++){
                if (matrix[j][i] == 0){
                    break;
                } else {
                    sum += matrix[j][i];
                }
            }
        }
        
        System.out.println(sum);
    }
}
// 00 01 02 03
// 10 11 12 13
// 20 21 22 23
