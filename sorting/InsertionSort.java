public class InsertionSort {

    static int[] insertionSort(int[] arr){

        for(int i = 1; i< arr.length; i++){
            int e = arr[i];
            int j = i-1;
            for(; j>=0; j--){  
                if(e<arr[j]){
                    arr[j+1] = arr[j];
                }else{
                    break;
                }

            }
            arr[j+1] = e;
        }

        return arr;

    }
    
    public static void main(String[] args) {
        int [] arr  = {6 , 5, 7, 5, 2, 1};

        int[] ans = insertionSort(arr);

        for(int i = 0; i<ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }
}
