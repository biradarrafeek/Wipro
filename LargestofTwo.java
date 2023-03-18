import java.util.Scanner;
public class LargestofTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a,b;
		a = s.nextInt();
		b = s.nextInt();
		/* if(a>b)
		{
			System.out.println("First number is greater");
		}
		else
		{
			System.out.println("Second number is greater");
		}
		System.out.println("Outside if-else");
		 */
		
		// Nested if else and if else if 

		if(a>b){
			System.out.println("First number is greater");
		}else if(b>a) {
			System.out.println("Second number is greater");
		}else {
			System.out.println("Both are equal");
		}

		// Assignment Question

		/*	int a=50;
		if(a>10)
		{
		    System.out.print("Coding");
		}
		else(a>20)
		{
		    System.out.print("Ninjas");
		}
		 */


		/*	 int x = 5; 
	        if (x < 6)
	            System.out.print("Hello  ");
	        if(x == 5){
	            System.out.print("Hi  ");
	        }
	        else{ 
	            System.out.print("Hey ");
		 */


		/*	int var1 = 5; 
        int var2 = 6;
        if ((var2 = 1) == var1)
            System.out.print(var2);
        else 
            System.out.print(var2 + 1);
		 */

		/*	
		int a=50;
	    int b=Integer.MIN_VALUE;
	    if(a/0==b)
	    {

	        System.out.println("Hello");
	    }
	    else
	    {
	        System.out.println("Hi");
		 */


		/*	int a=50,b=20;
	    if(a>b)
	    {
	        if(a>100)
	            System.out.println("Ace");
	        if(b<100)
	            b=50;
	    }
	    else if(a==b)
	    {
	        System.out.println("King");
	    }
	    else 
	    {
	        System.out.println("Queen");
		 */

		/*	int i=0;
		   while(i<10)
		   {
		       i=i+1;
		       System.out.print(i);
		       i=i+1;
		 */

		/*	 int x=5;
		 int y=5;
		    while((x==y)
		    {
		        System.out.println("Hello");
		        x++;
		        y++;
		    }
		 */
	}
}