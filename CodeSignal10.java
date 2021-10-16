import java.util.ArrayList;

public class CodeSignal10 {
    String[] allLongestStrings(String[] inputArray) {
        ArrayList<String> ans = new ArrayList<String>();
        int maxInputArray = inputArray[0].length();
        
        for(int i = 0; i < inputArray.length - 1; i++){
            if(maxInputArray < inputArray[i+1].length()){
                maxInputArray = inputArray[i+1].length();
            }  
        }
        
        for(int i = 0; i < inputArray.length; i++){
            if(maxInputArray == inputArray[i].length()){
                ans.add(inputArray[i]);
            }
        }
        
        String[] res = ans.toArray(new String[0]);
        
        return res;
        
    }
}
