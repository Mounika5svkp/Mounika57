package ArrayDemo;
import java.util.Scanner;

public class UserInput2DArray 
{

	public static void main(String[] args) 
	{
	Scanner s=new Scanner(System.in);
	System.out.println(" Enter the no of rows");
	int rows = s.nextInt();
	System.out.println("enter the no of column");
	int col=s.nextInt();
	
	int multidimensionalarray[][]=new int [rows][col];
	for (int i=0;i<rows;i++)
	{
		for( int j=0;j<col;j++)
		{
			multidimensionalarray[i][j]=(i+1)*(j+1);
		}
	}
			for (int i=0;i<rows;i++)
			{
				for(int j=0;j<col;j++)
				{
					System.out.println(multidimensionalarray[i][j]+ " ");
				}
				s.close();
			}
	}
}
