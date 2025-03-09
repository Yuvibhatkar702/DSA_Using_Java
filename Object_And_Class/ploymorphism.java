public class ploymorphism{

	public static void main(String args[])
	{
		/*
			Polymorphism mense to try to do a similar thing in multiple fromes. 

			If one task is performed in different ways, it is known as polymorphism.

			In Java, we use method overloading and method overriding to achieve polymorphism.

			Thare are the two type of Polymorphism 
			1. Compile time PolyMorphism (Static)
				Methode Overloding :- Multiple function With the same name but diffrent parameters.
			

			2. Run time polymorphism (Diynamic)
				Methode Overriding :- Parent and Chile classes both contain a same function with same parameter also but different Defination

		*/

		calculator cal = new calculator();
		cal.add(55,66); //121
		cal.add((float)2.3,44);
		System.out.println(cal.add((float)3.1,(float)6.4));

		calculator st= new Subsraction();
		st.add(11,22);
	}
}

class calculator{

	void add(int a, int b){ 
		System.out.println(a+b);
	}

	void add(float a, int b){ // Methode Overloding
		System.out.println(a+b);
	}

	float add(float a, float b){ // Methode Overloding
		return a+b;
	}

}

class Subsraction extends calculator{

	void add(int a, int b){
		System.out.print(a-b); // Methode Overriding
	}


}