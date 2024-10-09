public class sorting {
    public static void main(String[] args) {
        
        int arr[]={2,8,65,4,7,5,45,96};
        int n =arr.length;
        System.out.println("Original array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
                                                                  

        int temp=0;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){

                if (arr[j]<arr[i]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("\nSorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        

    }
    
}
