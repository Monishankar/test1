import java.util.Scanner;
class Test
{


	public static void main(String [] args)
	{

		//int a [] = { 4,5,3,4,5,7,8,9,11,21,24,32,32,21};

	
	
		for (int i=0;i<args.length;i++ )
		{
			boolean isunique = false;
			for (int j=0;j<i;j++)
			{
				if(args[i].equals(args[j]))
				{
				isunique=true;
				break;
				}
			}
		
				if(!isunique)
			{
				System.out.print("Distinct elements are :"args[i]+" ");
			}
		}
	}

	
}