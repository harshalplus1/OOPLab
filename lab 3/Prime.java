import java.util.Scanner;
class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting and ending values: ");
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        int flag=0;
        int[] arr = new int[n];
        for (int i = n; i < m; i++) {
            for (int j = 2; j < i; j++) {
                flag=0;
                if (i % j ==0) {
                    flag=1;
                    break;
                }
            }
            if(flag==0) {
                System.out.println(i);
            }
        }

    }
}