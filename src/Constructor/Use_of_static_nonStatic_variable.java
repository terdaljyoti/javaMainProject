package Constructor;

public class Use_of_static_nonStatic_variable 
{
	String empName;
	int empID;
	static String empCO;  //static global variable
	
	public void EmpInfo()
	{
		System.out.println("Employee name :"+empName+"\tEmployee ID :"+empID+"\tCEO :"+empCO);
	}

}
