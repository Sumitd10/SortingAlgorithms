public class InsertionSort{
    public static void insertionSort(int[] arr){
     int n = arr.length ;
     for(int j=1;j<n;j++){
         int key = arr[j];
         int i  = j-1;
      while((i>-1) && (arr[i]>key)){
          arr[i+1]=arr[i];
          
          i-- ;
      }
      arr[i+1]=key ;
     }
    }
    
    public static void main(String a[]){
        int[] arr1 = {4,6,7,2,99};
        insertionSort(arr1);
        System.out.println("Result");
        for(int i:arr1){
            System.out.println(i+" ");
        }
    }
}