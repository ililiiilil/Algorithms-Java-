public class CodeSignal9 {
    int matrixElementsSum(int[][] matrix) {
        int sum = 0;
        int len = matrix[0].length;
    
        for (int i = 0; i < len; i++){
            for (int j = 0; j < matrix.length; j++){
                if (matrix[j][i] == 0){
                    break;
                } else {
                    sum += matrix[j][i];
                }
            }
        }    
        return sum;
    }
    
}
