package Generalization;

public class TestGeneralization
{
	public static void main(String[] args)
	{
		System.out.println("features of JIO SimCard :");
		Jio j=new Jio();
		j.ac();
		j.data();
		j.featureA();
		j.sms();
		
		System.out.println("features of VI SimCard :");
		VI v=new VI();
		v.ac();
		v.data();
		v.sms();
		v.feature();
		
		System.out.println("features of Airtel SimCard :");
		Airtel A=new Airtel();
		A.ac();
		A.data();
		A.feature();
		A.sms();
	}

}
