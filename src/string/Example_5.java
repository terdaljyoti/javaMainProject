package string;

public class Example_5 
{
	public static void main(String[] args) 
	{
		String s1="velocity";
		String s2="";
		String s3="   ";
		String s4="velocity";
		String s5="my name is velocity";
		String s6="VELOcity";
		
		
		System.out.println(s1.length());//        ------------------->returns No of character
		System.out.println(s1.isEmpty());//
		System.out.println(s2.isEmpty());//        ----------------->returns true or false  ,it also consider key board space
		System.out.println(s3.isEmpty());
		System.out.println(s1.charAt(3));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s5.contains("my"));
		System.out.println(s5.contains(s4));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equals(s6));
		System.out.println(s1.equalsIgnoreCase(s6));
		
		System.out.println("==========================================================");
		
		String s7="abcabcabcd";
		String s8="ABCD";
		String s9="abc";
		
		System.out.println(s7.indexOf("c"));
		System.out.println(s7.lastIndexOf("c"));
		
		System.out.println(s5.startsWith("my"));
		System.out.println(s5.endsWith("VELOCITY"));
		System.out.println(s5.endsWith("city"));
		System.out.println(s1.substring(4));
		System.out.println(s1.substring(0,4));
		System.out.println(s1.substring(4,8));
		System.out.println(s8.concat(s9));
		System.out.println(s5.replace("velocity", "abc"));
		
		System.out.println("-------------------------------------------------------------------");
		
		String s11="abcd";
		String s22="ABCD";
		String s33="";
		String s44="VELocity";
		String s12="my name is Velocity";
		
		
		
		System.out.println(s11.length());
		System.out.println(s11.isEmpty());
		System.out.println(s33.isEmpty());
		System.out.println(s44.toLowerCase());
		System.out.println(s44.toUpperCase());
		System.out.println(s12.contains("my"));
		System.out.println(s12.charAt(4));
		System.out.println(s11.equals(s22));
		System.out.println(s11.equalsIgnoreCase(s22));
		
		System.out.println("---------------------------------------------------------------------");


		
		
		
		
	}

}
