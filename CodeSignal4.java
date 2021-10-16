public class four {
    int adjacentElementsProduct(int[] inputArray) {
        int ans = inputArray[0] *inputArray[1];
        int len = inputArray.length;
        
        for(int i = 0; i < len - 1; i++){
            if(ans < inputArray[i] * inputArray[i+1]){
                ans = inputArray[i] *inputArray[i+1];
            }
        }
        
        return ans;
    }
}
