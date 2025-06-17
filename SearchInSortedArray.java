import java.util.*;
public class SearchInSortedArray
{
    public static void main(String args[])
    {
        int nums[]={4,7,6,3,0,2,1};
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        int index=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                index=i;
                // break;
            }
        }
        System.out.println(index);
    }
}
