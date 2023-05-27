package Logical;

public class EX_reverse_words_from_string 
{
	public static void main(String[] args)
	{
		 String s1="sabhyata is a engineear";   //s1=inputString
		 String s2[]=s1.split(" ");             //s2=word
         for(int j=0;j<=s2.length-1;j++)
         {
	       String rev="";                        //reverseWord
           for(int i=s2[j].length()-1;i>=0;i--)
           {
	       
        	 rev=rev+s2[j].charAt(i);
        	 
           }
        
         System.out.print(rev+" ");
		}
	}
}
