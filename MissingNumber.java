import java.util.*;
public class MissingNumber {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=(n*(n+1))/2;
        for(int i=0;i<n;i++){
            sum=sum-nums[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        MissingNumber mn=new MissingNumber();
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements in the array:");
        n=sc.nextInt();
        int nums[]=new int[n];
        System.out.println("Enter the number of elements into the array:");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int x=mn.missingNumber(nums);
        System.out.println("The element which is not present is:"+x);
    }
}
