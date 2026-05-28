
public class Rotate90 {
    public static void rotate(int[][] matrix)
    {
        int n=matrix.length;

        int[][] result=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                result[j][n-i-1]=matrix[i][j];
            }
        }
        for(int i=0;i<n;i++){
            System.arraycopy(result[i],0,matrix[i],0,n);
        }
    }
    public static void main(String[] args){
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
        for(int[] row:matrix){
            for(int x:row){
                System.out.print(x);
            }
        
        System.out.println();
    }
    }
}
