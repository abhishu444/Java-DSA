public class Array {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int max=arr[0];//assume first element is max
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
            System.out.print("maximum element in arrya is" + max);
        }
    }

