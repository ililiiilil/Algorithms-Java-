import java.util.ArrayList;

public class CodeSignal12 {
    boolean isLucky(int n) {
    
        ArrayList<Integer> ans = new ArrayList<Integer>();
        while(n > 0){
            ans.add(n % 10);
            n /= 10;
        }
        int sum1 = 0;
        int sum2 = 0;
        int mid = 0;
        mid = ans.size() / 2;
        
        for(int i = 0; i < ans.size(); i++){
            if(i < mid){
                sum1 += ans.get(i);
            }else{
                sum2 += ans.get(i);
            }
        }
        
        if (sum1 == sum2){
            return true;
        } else{
            return false;
        }
    }
}
