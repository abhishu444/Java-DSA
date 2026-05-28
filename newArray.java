public class newArray {
    public static void main(String[] args) {
        int arr[] ={4,1,-5,21,8};
        int n=arr.length;
        int maxValue=arr[0];

        for(int i=0;i<=n-1;i++){
            if(arr[i]>maxValue){
                maxValue=arr[i];
        }
    }
    
        System.out.println("maxvalue is "+ maxValue);
}

}
