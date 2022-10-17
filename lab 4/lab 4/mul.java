import java.util.Scanner;
class mul{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Rows adn Cols");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int a[][]=new int[r][c];
        int flag=1;
        int b[][]=new int[c][r];
        int d[][]=new int[r][r];
        System.out.println("A:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("B:");
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                b[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<r;j++){
                d[i][j]=0;
                for(int k=0;k<c;k++){
                    d[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<r;j++){
                System.out.print(d[i][j]+" ");
            }
            System.out.println("");
        }
    }
}