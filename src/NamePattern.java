
public class NamePattern {
	
	 	public static void main(String args[])
		{      
			int i,j,k;
			for(i=1; i<=5; i++)
			{
				for(j=55; j>=i; j--)
				{
					System.out.print(" ");
				}
				for(k=1; k<(i*2); k++)
				{
					if(k>1 && k<(i*2)-1)
					{
						if(i==3 && k==3)
							System.out.print("*");
						else
							System.out.print(" ");
					}
					else
						{
							System.out.print("*");
						}
				}
				System.out.println();
			}
		System.out.println();
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			for(i=1;i<=3;i++)
			{
				for(k=1;k<=50;k++)
				{
					System.out.print(" ");
				}
			   	for(j=1;j<=5;j++)
				{
					if(i==2 && j>=2 && j<=4)
					{
						System.out.print("  ");
					}
					else
					{
					   System.out.print(" *");
					}
				}
				System.out.println( );
			}
			for(i=1;i<=3;i++)
			{	
				for(k=1;k<=51;k++)
				{
					System.out.print(" ");
				}
				for(j=1;j<=9;j++)
				{
					if(j>1)
					{
						if(i>=1 && j==(2*i+2))
							System.out.print("*");
						else
							System.out.print(" ");
					}
					else
					{
					   System.out.print("*");
					}
				}
				System.out.println(" ");
			}
		System.out.println();
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			for(i=1;i<=5; i++)
			{
				for(k=1;k<=50;k++)
				{
					System.out.print(" ");
				}
				for(j=1;j<=6;j++)
				{
					if(i==1)
						System.out.print(" *");
					else
						{
						if(i>=2 && j==6)
							System.out.print("*");
						else
							System.out.print(" ");
						}
				}
			System.out.println();
			}
		System.out.println();
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			for(i=1;i<=5; i++)
			{	
				for(k=1;k<=50;k++)
				{
					System.out.print(" ");
				}
				for(j=1; j<=9; j++)
				{
					if(j>=2 && j<=8)
						{
							if(i==3)
								System.out.print("*");
							else
								System.out.print(" ");
						}
					else
						System.out.print("*");
				}
				System.out.println();
			}
		System.out.println();
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			for(i=1;i<=5; i++)
			{
				for(k=1;k<=50;k++)
				{
					System.out.print(" ");
				}
				for(j=1;j<=6;j++)
				{
					if(i==1 || i==5)
						System.out.print(" *");
					else
						{
						if(i>=2 && j==6)
							System.out.print("*");
						else
							System.out.print(" ");
						}
				}
			System.out.println();
			}
		System.out.println();
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		for(i=1;i<=5; i++)
			{
				for(k=1;k<=50;k++)
				{
					System.out.print(" ");
				}
				for(j=1;j<=6;j++)
				{
					if(i==1)
						System.out.print(" *");
					else
						{
						if(i>=2 && j==6)
							System.out.print("*");
						else
							System.out.print(" ");
						}
				}
			System.out.println();
			}
		System.out.println();
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		for(i=1; i<=5; i++)
			{
				for(j=55; j>=i; j--)
				{
					System.out.print(" ");
				}
				for(k=1; k<(i*2); k++)
				{
					if(k>1 && k<(i*2)-1)
					{
						if(i==3 && k==3)
							System.out.print("*");
						else
							System.out.print(" ");
					}
					else
						{
							System.out.print("*");
						}
				}
				System.out.println();
			}
		System.out.println();
	/////////////////////////////////////////////////////////////////////////////////////////////////////////
		}



	}

