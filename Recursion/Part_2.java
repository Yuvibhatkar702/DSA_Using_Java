
public class Part_2{

	public static int Tiling_Problem(int n){

		/*	
			Given the 2*n flooar and tiles of a size "2*1" Count the number of way to tiles  the given board using the 2*1 tiles.
		*/

		// Base Case
		if(n == 0 || n == 1){
			return 1;
		}

		// Vertical 
		// Kam
		// int v1 = Tiling_Problem(n-1);
		// int v2 = Tiling_Problem(n-2);
		// return v1+v2;

		return Tiling_Problem(n-1) + Tiling_Problem(n-2);
	}

	// public static void Remove_duplicate_String(int index, String str, StringBuilder nStr, boolean arr[]){ // Confision here

	// 		// Base
	// 		if(index == arr.length){
	// 			System.out.print(nStr);
	// 			return;
	// 		}

	// 		// Kam
	// 		char Current_String = str.charAt(index);
	// 		if(arr[Current_String - 'a'] == true){
	// 			// Diplicate 
	// 			Remove_duplicate_String(index+1,str,nStr,arr);
	// 		}else{
	// 			arr[Current_String-'a'] = true;
	// 			str.append(Current_String);
	// 			Remove_duplicate_String(index+1,str,nStr,arr);
	// 		}
	// }

	public static int Friends_pairing(int n){
		if(n == 0 || n == 1) //Base Case
		{
			return 1;
		}


		//Kam
		// int Single = Friends_pairing(n-1);
		// int pair = Friends_pairing(n-2);
		// int choose = pair * (n-1);

		// return choose + Single;

		return Friends_pairing(n-2) * (n-1) + Friends_pairing(n-1);
	}

	public static void Binary_String(int n, int Last_Place, String str){

		/*
			Print the all binary String of Size N, without Consicative ones.
		*/

		// Base Case
		if(n == 0){
			System.out.println(str);
			return;
		}

		// kam
		Binary_String(n-1,1,str+"1");

		if(Last_Place == 1){
			Binary_String(n-1,0,str+"0");
		}

	}

	public static void main(String args[]){

		// int n = 3;
		// System.out.println(Tiling_Problem(n));

		// String str = "appnacollage";
		// boolean arr[] = new boolean[26];

		// Remove_duplicate_String(0,str,new StringBuilder(""),arr);

		//System.out.print(Friends_pairing(3));

		String str = "";
		Binary_String(3,1,str);
	}
}