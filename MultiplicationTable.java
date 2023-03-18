import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		for(int i = 1;i<=10;i++)
		{
			System.out.println(n* i );
		}
	}

}
