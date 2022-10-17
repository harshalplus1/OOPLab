import java.util.Scanner;
public class Matrix {
    public static void main(String[] Args){
        Scanner sc=new Scanner(System.in);
        int[][] A=new int[3][3];
        int sum=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                A[i][j]=sc.nextInt();
            }
        }
for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(A[i][j]);
                System.out.print(" ");
            }
           System.out.println();
        }
        System.out.println("Without Diagnol Elements");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i==j){
                    continue;
                }
                else{ 
             System.out.print(A[i][j]);
             System.out.print(" ");
             sum=sum+A[i][j];
             }
            }
           System.out.println();
        }
        System.out.println(sum);
    }
}