import java.util.Scanner;
class magic{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Rows");
        int r=sc.nextInt(),rowsum,colsum,flag=0,standard=0;
        int i,j;
        int ar[][]=new int[r][r];
        System.out.println("Elements:");
        for(i=0;i<r;i++){
            for(j=0;j<r;j++){
                ar[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<r;i++){
            rowsum=0;
            for(j=0;j<r;j++){
                rowsum+=ar[i][j];
            }
            if(i==0){
                standard=rowsum;
            }
            if(rowsum!=standard){
                System.out.println("na");
                flag=1;
                break;
            }
        }
            
        for(i=0;i<r;i++){
            colsum=0;
            for(j=0;j<r;j++){
                colsum+=ar[j][i];
            }
            if(colsum!=standard && flag!=1){
                System.out.println("na");
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("yes");
        }


    }
}