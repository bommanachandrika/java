import java.util.*;
public class RotateMat
{
public static void main(String args[])
{
int res[][]=new int[3][3];
int mat[][]={{1,2,3},{4,5,6},{7,8,9}};
int n=mat.length;
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
res[j][n-i-1]=mat[i][j];
}
}
for(int i=0;i<n;i++)
{
	for(int j=0;j<n;j++)
	{
System.out.print(res[i][j]+" ");
}
System.out.println();
}
System.out.println();
}
}