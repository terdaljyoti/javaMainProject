package string;

public class Replace
{
	public static void main(String[] args)
	{
		String s1="rfb4678@6%h75yt#^548";

		System.out.println(s1.replaceAll("[a-z]", "0"));
		
		System.out.println(s1.replaceAll( "[0-9]",  "A"));
		
		String s2="wer hgh uy tyur ";
		System.out.println(s2.replace(" ", ""));
		
	    String s3[]=s2.split(" ");
		for(int i=0;i<=s3.length-1;i++)
		{
			System.out.print(s3[i]);
		}
		
		String s4="hj j kjs lkj";
	    System.out.println(s4.trim());	
		
	}

}