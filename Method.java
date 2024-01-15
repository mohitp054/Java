public class Methodwithreturntype
{

public int multiply(int num1,int num2)
{
return num1*num2;
}

public static void main(String[] args)
{
Methodwithreturntype obj=new Methodwithreturntype();
int mul=obj.multiply(5,3);
System.out.println("Multiplication= "+mul);


}



}