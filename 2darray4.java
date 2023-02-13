import java.util.*;
class array{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a[][]=new int [3][3];
		int mirr[][]=new int [3][3];
	 System.out.print("enter a");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				mirr[i][2-j]=a[i][j];
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(mirr[i][j]);
			}
			System.out.println();
		}
		}
	}
