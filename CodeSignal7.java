public class CodeSignal7 {
    int makeArrayConsecutive2(int[] statues) {
        int minAns = statues[0];
        int maxAns = statues[0];
        int res = statues.length - 2;
        
        for (int i = 0; i < statues.length; i++){
            if (minAns > statues[i]){
                minAns = statues[i];
            }
            
            if (maxAns < statues[i]){
                maxAns = statues[i];
            } 
        }
        
        return maxAns - minAns - res - 1;
        
    }
}
