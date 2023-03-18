import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in); 
		int n;
		n=s.nextInt();
		int digit,even=0,odd=0;
		while(n>0)
		{
			digit = n %10;
			n = n/10;
			if(digit%2!=0)
			{
				odd = odd+digit;
			}
			else 
			{
				even = even+digit;
			}
			System.out.println(even + " "+odd);
		}
	}

}
