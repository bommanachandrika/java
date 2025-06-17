public class MaxSubArray
{
public static void main(String args[])
{
int nums[]={5,4,-1,7,8};
int sum=nums[0];
int total=nums[0];
for(int i=1;i<nums.length;i++)
{
	total=Math.max(nums[i],total+nums[i]);
	sum=Math.max(sum,total);
}
System.out.println(sum);
}
}