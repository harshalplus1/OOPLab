import java.util.Scanner;
class pde{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Rows and Cols");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int sum=0;
        int a[][]=new int[r][c];
        System.out.println("Elements:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i==j){
                    System.out.println(a[i][j]);
                    sum+=a[i][j];
                }
            }
          System.out.println("Sum"+sum);
        }
    }
}