public class MyClass {
        public static void checkSubstring(String str , int index, String curr){
            int n = str.length();
            //Base case 
            if(index==n){
                return ;
            }
            System.out.print(curr);
            for (int i=index+1;i<n;i++){
                curr += str.charAt(i);
                //count the string one by one firstly hed is on 1 the 2 and then 3
                checkSubstring(str,i,curr);
                
                curr = curr.substring(0,curr.length()-1);
                
            }
        }
    
    
    public static void main(String args[]) {
      String str = "123";
      int index = -1;
      String curr = " ";
        checkSubstring(str,index,curr);    
    }
}