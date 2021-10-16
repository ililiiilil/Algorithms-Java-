public class two {
    public int centuryFromYear(int year) {
        int ans = year / 100;
        
        if (year % 100 != 0){
            ans += 1;
        }
        return ans;
    }
}
