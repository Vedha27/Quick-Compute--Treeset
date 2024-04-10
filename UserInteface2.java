package treesetQuickCompute;
import java.util.*;


public class UserInterface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner y=new Scanner(System.in);
		
		NumAvg n=new NumAvg();
		
		int choice=0;
		
		while(choice!=3)
		{
			System.out.println("1. Add number");
			System.out.println("2. Find average");
			System.out.println("3. Exit");
			System.out.println("Enter your choice");
			
			choice=y.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.print("Enter the number:");
				int num=y.nextInt();
				n.addNum(num);
				break;
			
			case 2:
				double avg=n.calAvg();
				if(n.getNumSet().isEmpty())
				{
					System.out.println("The set is empty");
				}
				else
				{
					System.out.println(avg);
				}
				break;
			case 3:
				System.out.println("Thank you for using the applicaion");
				break;
				
			default:
				System.out.println("Invalid Choice");
				break;
			}
		}
		

	}

}
