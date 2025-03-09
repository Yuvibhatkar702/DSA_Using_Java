public class Temp{

	public static Class Node{

		int data;
		Node next;

		public Node(int data){
			
			this.data = data;
			this.next = null;

		}

	}

	public static int Head;
	public static int Tile;

	public class Add_start(int data){

		Node Start = new Node(1);

		if(Head == null){
			Head = Tile = Start;
		}

		Start.next = Head;

		Head = Start;    

	}

	public static void main(String args[])
	{

	}
}