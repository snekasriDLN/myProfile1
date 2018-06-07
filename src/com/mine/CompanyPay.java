package com.mine;

public class CompanyPay {
static double salary;
static double comision;
int[] count = new int[10];
public static double getSalary() {
	return salary;
}
public static void setSalary(double salary) {
	CompanyPay.salary = salary;
}
public static double getComision() {
	return comision;
}
public static void setComision(double comision) {
	CompanyPay.comision = comision;
}
public int[] getCount() {
	return count;
}
public void setCount(int[] count) {
	this.count = count;
}

public void calculateCompanyPay(int grossSales) {
	double newSalary = salary+(grossSales*(comision/100.0));
	System.out.println(newSalary);
	salary=newSalary;
}
public void setRange(double salary) {
	if((salary>=200) && (salary<300))
	{
		System.out.println("a rang");
		int oldvalue=count[0];
		int newvalue= oldvalue+1;
		count[0]=newvalue;
		System.out.println("The salespeople earned salaries in this ranges"+count[0]);
	}
	else if((salary>=300) && (salary<400))
	{
		System.out.println("b rang");
		int oldvalue=count[1];
		int newvalue= oldvalue+1;
		count[1]=newvalue;
		System.out.println("The salespeople earned salaries in this ranges"+count[1]);
	}
	else if((salary>=400) && (salary<500))
	{
		System.out.println("c rang");
		int oldvalue=count[2];
		int newvalue =oldvalue+1;
		count[2]=newvalue;
		System.out.println("The salespeople earned salaries in this ranges"+count[2]);
	}
	else if((salary>=500) && (salary<600))
	{
		System.out.println("d rang");
		int oldvalue=count[3];
		int newvalue= oldvalue+1;
		count[3]=newvalue;
		System.out.println("The salespeople earned salaries in this ranges"+count[3]);
	}
	else if((salary>=600) && (salary<700))
	{
		System.out.println("e rang");
		int oldvalue=count[4];
		int newvalue= oldvalue+1;
		count[4]=newvalue;
		System.out.println("The salespeople earned salaries in this ranges"+count[4]);
	}
	else if((salary>=700) && (salary<800))
	{
		System.out.println("f rang");
		int oldvalue=count[5];
		int newvalue=oldvalue+1;
		count[5]=newvalue;
		System.out.println("The salespeople earned salaries in this ranges"+count[5]);
	}
	else if((salary>=800) && (salary<900))
	{
		System.out.println("g rang");
		int oldvalue=count[6];
		int newvalue=oldvalue+1;
		count[6]=newvalue;
		System.out.println("The salespeople earned salaries in this ranges"+count[6]);
	}
	else if((salary>=900) && (salary<1000))
	{
		System.out.println("h rang");
		int oldvalue=count[7];
		int newvalue=oldvalue+1;
		count[7]=newvalue;
		System.out.println("The salespeople earned salaries in this ranges"+count[7]);
	}
	else if(salary>1000)
	{
		System.out.println("i rang");
		int oldvalue=count[8];
		int newvalue=oldvalue+1;
		count[8]=newvalue;
		System.out.println("The salespeople earned salaries in this ranges"+count[8]);
	}
	else
	{
		System.out.println("out of rang");
		int oldvalue=count[9];
		int newvalue=oldvalue+1;
		count[9]=newvalue;
		System.out.println("The salespeople earned salaries in this ranges\"+count[9]");
	}
}
public static void main(String[] args) {
	CompanyPay payment= new CompanyPay();
	CompanyPay.setSalary(200);
	CompanyPay.setComision(9);
	payment.calculateCompanyPay(5000);
	payment.setRange(salary);
	
}
}
