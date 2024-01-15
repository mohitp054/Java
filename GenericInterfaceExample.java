import java.util.Scanner;
interface MyInterface<T>
{
	T performOperation(T value);
}
class GenericInterfaceExample
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter an integer : ");
		int intVal=sc.nextInt();
		System.out.print("Enter a double : ");
		double doubleVal=sc.nextDouble();
		System.out.print("Enter a string : ");
		String stringVal=sc.next();
		MyInterface<Object> myInterface=new MyInterface<Object>()
		{
			public Object performOperation(Object value)
			{
				if(value instanceof Integer)
				{
					return (int)value *2;
				}
				else if (value instanceof Double)
				{
					return (double)value/2;
				}
				else if (value instanceof String)
				{
					return ((String)value).toUpperCase();
				}
				else
				{
					return null;
				}
			}
		};
		Object result1 = myInterface.performOperation(intVal);
		Object result2 = myInterface.performOperation(doubleVal);
		Object result3 = myInterface.performOperation(stringVal);
		System.out.println("Result 1 :" + result1);
		System.out.println("Result 2 :" + result2);
		System.out.println("Result 3 :" + result3);
	}
}

