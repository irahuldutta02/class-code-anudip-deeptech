package class_19_12_2022;
import java.util.Scanner;

public class Calculator 
{
	public static void main(String args[])
	{
		// declare here
		float a,b,res;
		char choice;
		try (Scanner S = new Scanner(System.in)) {
			do
			{
				// prepare menu for the user to see multiple operations.
				System.out.println("\n\nMain Menu : \n1.Addition\n2.Subtraction\n3.Division\n4.Multiplication\n5.Modulo\n6.Exit");
				
				// enter the choice
				System.out.print("Enter your choice : ");
				
				// read the input choice value.
				choice=S.next().charAt(0);
				
				// this loop will calculate different the operations value at different different values.
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
			// loop works till the number 5 not selected.
  while(choice!=5);
		}
	}
}
