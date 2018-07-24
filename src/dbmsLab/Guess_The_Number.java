package dbmsLab;

import java.util.Scanner;

import com.sun.org.apache.bcel.internal.generic.GOTO;
import com.sun.xml.internal.ws.policy.EffectiveAlternativeSelector;

public class Guess_The_Number {
	
	
	public static void main(String[] args) {
		
	
		int random = (int )(Math.random() * 100+1);
		int a;
		Scanner scanner =new Scanner(System.in);
		
		int i=0;
		//System.out.println("Gussed Number is= "+random);
		while(true)
		{
		
			a=scanner.nextInt();
			i++;
			
			if(a==random) {
				
				break;
				
			}
			else if(i==3&&a!=random)
			{
			 if(random>90)
			{
				System.out.println("your number within 90-100");
			}
			else if(random>80)
			{
				System.out.println("your number within 80-90");
			}
			else if(random>70)
			{
				System.out.println("your number within 70-80");
			}
			else if(random>60)
			{
				System.out.println("your number within 60-70");
			}
			else if(random>50)
			{
				System.out.println("your number within 50-60");
			}
			else if(random>40)
			{
				System.out.println("your number within 40-50");
			}
			
			else if(random>30)
			{
				System.out.println("your number within 30-40");
			}
			
			else if(random>20)
			{
				System.out.println("your number within 20-30");
			}
			
			else if(random<10)
			{
				System.out.println("your number within 10-20");
			}
			else
			{
				System.out.println("number within 0-10 ");
			}
			
			}
			
			else if(i==10 && random==a)
			{
				System.out.println();
			}
			
			System.out.println("DoseN't mathched, try Again");
					
		
		}
		
		
		if(random==a) {
		System.out.println("matched & Gussed Number is= "+random);
		}
		else {
			System.out.println("Play again");
		}
			
		
		
	}

}
