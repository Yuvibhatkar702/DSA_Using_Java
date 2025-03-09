public class Interfaces{

	public static void main(String args[])
	{
		/*
			InterFaces is a Blue-print of a class.
			Q. why we used interfaces in the java
				1. to Achive Multiple-Inheritance (5th type of inheritance)
				2. Total Abstraction

			we can implement a interfaceses


			Proparty of the Interfaces:-
				1.All methode are public,absract and without imlementaion 
				2.Used to achieve total abstraction
				3.variable in the interface are final,public, and static.  
		*/

		Bear b = new Bear();
		b.grass();
		b.mass();

	}
}


interface Herbivore{

	void grass(); // Public,absract,Without Implementaion
}

interface Carnivore{
	void mass(); // Public,absract,Without Implementaion
}

class Bear implements Herbivore,Carnivore{

	public void grass(){
		System.out.println("Eat only Grass");
	}

	public void mass(){
		System.out.println("Eat only mass");
	}
}