package class_19_12_2022;
import java.util.Scanner;

public class Calculator 
{
	public static void main(String args[])
	{
		float a,b,res;
		char choice;
		try (Scanner S = new Scanner(System.in)) {
			do
			{
				System.out.println("\n\nMain Menu : \n1.Addition\n2.Subtraction\n3.Division\n4.Multiplication\n5.Modulo\n6.Exit");
				
				System.out.print("Enter your choice : ");
				
				choice=S.next().charAt(0);
				
				switch(choice)
				{ 
				    case '1':System.out.print("Enter two numbers : ");
				    a=S.nextFloat();
				    b=S.nextFloat();	
				    res=a+b;
				    System.out.print("Result : " +res);
				    break;
				     
				     case '2':System.out.print("Enter two numbers : ");
					 a=S.nextFloat();
					 b=S.nextFloat();	
					 res=a-b;
					 System.out.print("Result : " +res);
					 break;
					    
				     case '3':System.out.print("Enter two numbers : ");
					 a=S.nextFloat();
					 b=S.nextFloat();	
					 res=a/b;
					 System.out.print("Result : " +res);
					 break;
					    
				     case '4':System.out.print("Enter two numbers : ");
					 a=S.nextFloat();
					 b=S.nextFloat();	
					 res=a*b;
					 System.out.print("Result : " +res);
					 break;
					 
				     case'5': System.out.print("Enter two numbers : ");
					 a=S.nextFloat();
					 b=S.nextFloat();	
					 res=a%b;
					 System.out.print("Result : " +res);
					   
				     case '6':
					 System.exit(0);
					 break;
					 default : System.out.print("Wrong Choice.....\n");
					 break;
				}
			}
  while(choice!=5);
		}
	}
}
