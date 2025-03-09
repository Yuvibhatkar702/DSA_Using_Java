class Super{
	public static void main(String args[])
	{
		/*
			Super key-world is used to refer immediate parent class object.
				- to access parent's properties.
				- to access parent's functions. 
				- to access the parent's constuctor.
			java will automatically initillize the super keyworld in the drive class.
		*/

		Girls g = new Girls();
		System.out.println(g.mess);
	}
}

class Hostel{
	
	String mess;
	Hostel(){
		System.out.println("This is boys room");
	}


}

class Girls extends Hostel{

	

	Girls(){
		super.mess = "Good/bad";
		System.out.println("This is a girl Hostel");

	}


}