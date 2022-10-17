import java.util.Scanner;
class Search {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of values: ");
        int n;
        n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
            System.out.print(" ");
        }
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        for(int i=0;i<n;i++){
            if(num==arr[i]){
                System.out.print("arr["+i+"]");
                System.out.println(" ");
            }
        }
    }
}