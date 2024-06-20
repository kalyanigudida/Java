class factorial
{
	public static void main(String[]args)
		{
			int num=5,start=1,product=1;
			while(start<=num)
			{
			product=product*start;
				start++;
			}
			System.out.println(product);
		}

}