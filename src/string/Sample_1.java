package string;

public class Sample_1 
{
	public static void main(String[] args) 
	{
		String s1="jyoti",s2="",s3="abcd",s4="ABCD";
		
		
		System.out.println(s1.length());
		System.out.println(s1.isEmpty());
		System.out.println(s2.isEmpty());
		System.out.println(s3.equals(s4));
		System.out.println(s3.equalsIgnoreCase(s4));
		System.out.println(s1.toLowerCase());
		System.out.println(s4.toUpperCase());
		System.out.println(s1.charAt(2));
		System.out.println(s1.contains("o"));
		
		System.out.println("___________________________________________");
		
		String s5="abcdabcdab",s6="my name is velocity";
		System.out.println(s5.indexOf("c"));
		System.out.println(s5.lastIndexOf("c"));
		System.out.println(s6.startsWith("my"));System.out.println(s6.startsWith("i"));
		System.out.println(s6.endsWith("ty"));System.out.println(s6.endsWith("abc"));
		System.out.println(s5.substring(3, 6));
		System.out.println(s3.concat(s4));
		System.out.println(s6.replace("velocity", "jyoti"));
		 
		String arr[]=s1.split("");
		
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println(arr.length);
		
	}

}
