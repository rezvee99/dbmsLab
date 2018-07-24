package dbmsLab;

import java.util.Scanner;  

public class Duplicate_Elimination {
	
	
	public int a[] = new int[5];
	public static void main(String[] args) {
		int i;
		
		Scanner sc=new Scanner(System.in);	
		Duplicate_Elimination obj = new Duplicate_Elimination();
		for(i=0;i<5;i++) {
			 
			if(i!=0)
			{
				while(true) {
				obj.a[i]=sc.nextInt();
				
				if(obj.a[i-1]!=obj.a[i])
				{
				break;			
				}
				}
			    
				
			}
			else {
				obj.a[i]=sc.nextInt();
			}
			
			
			
		}
		
		for(i=0;i<5;i++) {
		System.out.println(obj.a[i]);
		}
		
		
		sc.close();
		
	}
	
	
	
	

}
