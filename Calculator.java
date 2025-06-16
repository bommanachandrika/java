public class Calculator
{
    public int add(int num1,int num2)
    {
        int r=num1+num2;
        return r;
    }
    public static void main(String args[])
    {
        Calculator calc=new Calculator();
        int result=calc.add(2,8);
        System.out.println(result);
    }
}