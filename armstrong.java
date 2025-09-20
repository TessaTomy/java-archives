class armstrong
{
	public static void main(String args[])
	{
		int n,r=0,len;
		for(int i=100;i<=1000;i++)
		{
			n=i;
			r=0;
			len=(String.valueOf(i)).length();
			while(n>0)
			{
				r=r+(int)(Math.pow((n%10),len));
				n/=10;
			}
			if(r==i)
				System.out.println(i);
		}
	}
}
