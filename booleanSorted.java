public class MyClass {
    public static boolean arraySorted(int arr[],int index)
    {
        //base case
        if(index  >= arr.length){
            return true;
        }
        if(arr[index]<arr[index-1]){
            return false;
        }
        return arraySorted(arr,index+1);
    }
    
    public static void main(String args[]) {
    int arr[] = {1,1,3,3,6,6,7};
      System.out.println(arraySorted(arr,1));
    }
}