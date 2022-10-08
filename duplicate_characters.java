import java.util.*;
class Main{
    public static void countDuplicateCharacters(String str){
        HashMap<Character, Integer> map = new HashMap<>();
        char[] charArray = str.toCharArray();
        for(char c : charArray)
        {
            if(map.containsKey(c))
                map.put(c, map.get(c)+1);
                
            else
                map.put(c, 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet())
        {
            if(entry.getValue() > 1){
            System.out.print(entry.getKey());
            }
        }
    }
    
    
    public static void main (String[] args)
    {
        String str = "geeksforgeeks";
        countDuplicateCharacters(str);
    }
}
