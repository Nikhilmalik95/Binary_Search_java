public class FirstAndLastOccurance {
    
    static void fAndLastOcc(int[] arr , int num){

        int size = arr.length;
        int f  = -1;
        int l = -1;
        for(int i = 0; i<size; i++){
            if(arr[i] == num){
                f = i;
                break;
            }
        }

        for(int j = 0; j<size; j++){
            if(arr[j] == num){
                l = j;

            }
        }

        if(f != -1){
            System.out.println("first occurance is : "+ f);
        }else{
            System.out.println("element not exist");
        }

        if(l != -1){
            System.out.println("last occurance is : "+ l);
        }

    }

    static void binarySearchFirstOcc(int[] arr , int num){
        int s = 0;
        int e = arr.length-1;
        int mid = (s+e)/2;
        int ans = -1;
        while(s<=e){
            if(arr[mid] == num){
                ans = mid;
                e = mid-1;
            }else if(arr[mid] > num){
                e = mid-1;
            }else{
                s = mid+1;
            }

            mid = (s+e)/2;
        }

        if(ans == -1){
            System.out.println("element does not exist");
        }else{
            System.out.println("first occ : " + ans);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1 , 2 , 2 ,2, 3, 3, 4 ,5};
        int num = 2;
        //fAndLastOcc(arr , num); // O(n)

        // In binary search O(log n)
        binarySearchFirstOcc(arr , num);
    }
}
