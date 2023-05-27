package Constructor;

public class EmpData 
{
	public static void main(String[] args)
	{
		Use_of_static_nonStatic_variable e1=new Use_of_static_nonStatic_variable();
		e1.empName="Amol";
		e1.empID=101;
	    //e1.empCO="abc";
		Use_of_static_nonStatic_variable.empCO="abc";
		
		
		
		Use_of_static_nonStatic_variable e2=new Use_of_static_nonStatic_variable();
		e2.empName="Pooja";
		e2.empID=102;
		//e2.empCO="xyz";
		Use_of_static_nonStatic_variable.empCO="xyz";
		
		
		
		Use_of_static_nonStatic_variable e3=new Use_of_static_nonStatic_variable();
		e3.empName="Priyanka";
		e3.empID=103;
		//e3.empCO="lmn";
		Use_of_static_nonStatic_variable.empCO="lmn";
		
		e1.EmpInfo();
		e2.EmpInfo();
		e3.EmpInfo();
	}

}
