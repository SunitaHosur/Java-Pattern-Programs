class HallowRightPascal {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++)
			{
				if(i==1 || i==2 ||j==1 || j==i)
				{
				System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i=4; i>=1; i--)
		{
			for(int j=1; j<=i; j++)
			{
				if(i==1 || i==2 || j==1 || j==i)
				{
				System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
