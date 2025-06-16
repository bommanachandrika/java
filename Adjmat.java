public class Adjmat
{
    public static void main(String args[])
    {
        int vertices=5;
        int adjmat[][]=new int[vertices][vertices];
        adjmat[0][1]=1;
        adjmat[1][0]=1;
        adjmat[0][2]=1;
        adjmat[1][3]=1;
        adjmat[3][1]=1;
        adjmat[2][4]=1;
        adjmat[4][2]=1;
        adjmat[3][4]=1;
        adjmat[4][3]=1;
        System.out.println("adjacency matrix:");
        for(int i=0;i<vertices;i++)
        {
            for(int j=0;j<vertices;j++)
            {
                System.out.print(adjmat[i][j]+" ");

            }
            System.out.println(" ");
        }
    }
}