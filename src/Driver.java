public class Driver 
{
	public static void main(String[] args)
	{
		int count = 0;
		String s = "Philipeans";
		for(int i = s.length()-1; i >= 0; i--)
		{
			if(s.charAt(i)== 'A' || s.charAt(i) == 'a')
			{
				count++;
			}
			if(s.charAt(i)== 'E' || s.charAt(i) == 'e')
			{
				count++;
			}
			if(s.charAt(i)== 'I' || s.charAt(i) == 'i')
			{
				count++;
			}
			if(s.charAt(i)== 'O' || s.charAt(i) == 'o')
			{
				count++;
			}
			if(s.charAt(i)== 'U' || s.charAt(i) == 'u')
			{
				count++;
			}
		}
		System.out.println("Vowel count:"+ count);
	}
}

