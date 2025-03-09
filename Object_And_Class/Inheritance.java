public class Inheritance{

	public static void main(String args[])
	{
		Sunny s = new Sunny();
		s.Roll();
	}
}

/*
 * When one object access all the properties and Methode of a parent object, it is known as inheritance. It provides code reusability. It is used to achieve runtime polymorphism.
*/
// class Yuvraj{

// 	String Name;

// 	void Nature(){
// 		System.out.print("Good");
// 	}

// 	void height(){
// 		System.out.print("5.2");
// 	}

// 	void color(){
// 		System.out.print("Nimgora");
// 	}

// 	void Roll(){
// 		System.out.print("20IF007");
// 	}
// }

// class Sunny extends Yuvraj{ // Single Level Inheritances

// 	int roll_number;

// 	void Roll(int roll){

// 		this.roll_number = roll;
// 		System.out.print(roll_number);
// 	}

// }

// class Akash extends Sunny{ // multi-level Inheritances

// 	int height;

// 	void height(int h){
// 		this.roll_numbe = h;
// 	}
// }


class familys{

	void parents(){
		System.out.print("Papa");
		System.out.pritn("Mummy");
	}
}

class big_bro extends familys{ // hierarchial inheritance 

	void bro(){

		System.out.print("Akash");
	}
	
}

class small_bro extends familys{ // hieraechial inheritance

	void bro(){
		System.out.print("Sunny");
	}
}

class wahini extends big_bro{

	void nature(){
		System.out.print("bad"); // Hybrid inheritance
	}
}