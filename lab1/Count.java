import java.util.Scanner;
class Count
{
 public static void main(String args[])
 {
  Scanner sc = new Scanner(System.in);
  int p=0, n=0, z=0, i;
  int[] nums = new int[10];
  System.out.println("Enter 10 Numbers: ");
  for(i=0;i<10;i++)
  {
   nums[i]= sc.nextInt();
  }
  for(i=0;i<10;i++)
  {
   if(nums[i]>0)
    p++;
   else if(nums[i]<0)
    n++;
   else
    z++;
  }
  System.out.println("Number of Positive Numbers are: "+p);
  System.out.println("Number of Negitive Numbers are: "+n);
  System.out.println("Number of Zeroes are: "+z);
 }
}
