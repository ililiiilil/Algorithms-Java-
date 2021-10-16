public class CodeSignal5 {
    int shapeArea(int n) {
        int ans = 1;
        
        if(n == 1){
            return 1;
        }else{
            for(int i = 2; i <= n; i++){
                ans += 4 * i - 4;
            }
        }
        
        return ans;
    }
    
}
