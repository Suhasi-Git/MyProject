package day12;

public class Account {
	
	
	private int acc;
	private String name;
	private int salary;
	
	void setAccno(int acno)
	{
		acc=acno;
	}
	int getAccno()
	{
		return acc;
	}
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public static void main(String[] args) {
		
		Account Ac=new Account();
		Ac.setAccno(1001);
		Ac.setName("Suhasi");
		Ac.setSalary(1222222);
		
		System.out.println(Ac.getAccno());
		System.out.println(Ac.getName());
		System.out.println(Ac.getSalary());
		
	}

}
