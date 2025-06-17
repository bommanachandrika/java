public class TwoSum
{
public static void main(String args[])
{
int arr[]={2,7,11,15};
int num[]=new int[2];
int target=9;
for(int i=0;i<arr.length;i++)
{                               
for(int j=i+1;j<arr.length;j++)
{
if(arr[i]+arr[j]==target)
{
num[0]=i;
num[1]=j;
break;
}
}
}
System.out.println("["+num[0]+ ","+num[1]+"]");
System.out.println(num);
}
}