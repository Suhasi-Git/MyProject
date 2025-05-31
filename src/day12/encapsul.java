package day12;

public class encapsul {
	
	private String name;
	private int acno;
	private int id;
	private char grade;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAcno() {
		return acno;
	}


	public void setAcno(int acno) {
		this.acno = acno;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public char getGrade() {
		return grade;
	}


	public void setGrade(char grade) {
		this.grade = grade;
	}


	public static void main(String[] args) {
		
		encapsul EN = new encapsul();
		
		EN.setName("suhasi");
		System.out.println(EN.getName());
		
		EN.setAcno(0010010101001);
		System.out.println(EN.getAcno());
		
		EN.setGrade('A');
		System.out.println(EN.getGrade());
		
		EN.setId((001));
		System.out.println(EN.getId());

	}

}
