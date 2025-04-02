public class secondLargest{

    int Sec_largest(int arr[]){
        int first= arr[0];
        int second= arr[0];
        for(int i=1;i<arr.length; i++){
            if(arr[i]>first){
                // second=first;
                first=arr[i];
            }
            // else if(arr[i]!=first && arr[i]>second){
            //     second= arr[i];
            }
            for(int i=0; i<arr.length; i++){
                if(arr[i]!=first && arr[i]>second){
                    second=arr[i];
                }
            
        }
        return second;
    }
    public static void main(String[] args) {
        System.out.println("hello!");
        
        int arr[]={1,2,3,4,5,3,21,3,66,63};

        System.out.println(new secondLargest().Sec_largest(arr));

    }
}