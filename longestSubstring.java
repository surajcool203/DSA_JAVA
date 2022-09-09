class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap <Character, Integer> map = new HashMap<>();
        int left=0 , max_length=0, temp=0;
        char ch;
        for(int i = 0;i<s.length();i++){
            ch = s.charAt(i);
            if(map.containsKey(ch) && map.get(ch)>=left)
              left=map.get(ch) + 1;
        
        temp = i - left + 1;
        
        map.put(ch , i);
        
        max_length = Math.max(temp, max_length);
        }
        
        return max_length;
    }
}