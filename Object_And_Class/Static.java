class Static{
	public static void main(String args[])
	{
		Student s1 = new Student();

		s1.setName("Yuvraj");
		System.out.println(s1.getName());

		s1.setRoll(601);
		System.out.println(s1.getRoll());

		//s1.Brach = "Information Technology";

		System.out.println(s1.Brach);

		Student s2 = new Student();

		s2.setName("Shishir");
		System.out.println(s2.getName());

		s2.setRoll(606);
		System.out.println(s2.getRoll());

		//s2.Brach = "Computer Science";
		System.out.println(s2.Brach);

	}
}

class Student{
	String Name;
	int Roll_no;

	static String Brach = "Information Technology";

	void setName(String n)
	{
		Name = n;
	}

	String getName(){
		return Name;
	}

	void setRoll(int roll){
		Roll_no = roll;
	}

	int getRoll(){
		return Roll_no;
	}
}