public class SelectionSort {

    static int[] selectionSort(int [] arr){
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    
    public static void main(String[] args) {
        int [] arr  = {3 , 5, 7, 5, 2, 1};

        int[] ans = selectionSort(arr);

        for(int i = 0; i<ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }
}
