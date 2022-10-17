import java.util.Scanner;
class sym{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Rows and Cols");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int a[][]=new int[r][c];
        int flag=1;
        System.out.println("Elements:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(a[i][j]==a[j][i]){
                    continue;
                }
                else{
                    flag=0;
                }
            }
        }
        if(flag==1){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}