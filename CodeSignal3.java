public class three {
    public boolean checkPalindrome(String inputString) {
    
        int len = inputString.length();
        char[] ans = new char[len];
        
        for (int i = 0; i < len; i++){
            ans[i] = inputString.charAt(i);
        }
        
        boolean flag = true;
        
        for (int i = 0; i < len / 2; i++){
            if(ans[i] != ans[len - 1 - i]){
                flag = false;
                break;
            }
        }
        return flag;
    }
}
