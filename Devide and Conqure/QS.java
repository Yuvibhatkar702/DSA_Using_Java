import java.util.Arrays;

class QS{
	public static void main(String args[])
	{
		String arr[] = {"sun","earth","mars","mercury"};
		Sort(arr, 0, arr.length-1); // Merge Short
		System.out.println(Arrays.toString(arr));
	}

	public static void Sort(String arr[], int Start, int End)
	{
		int mid = Start+(End-Start)/2;

		Sort(arr, Start, mid);
		Sort(arr, mid+1, End);

		main(arr, Start,mid,End);
	}

	public static void main(String arr[], int start , int mid, int end){

		int index1 = start;
		int index2 = mid+1;
		int p = 0;

		String str = new String(end-start+2);

		while(index1 <= mid && index2 <= end){

			if(arr[index1].compareTo(str[index2]) < 0) // false
			{
				str[p] = arr[index1];
				p++; index1++;
			}else{
				str[p] = arr[index2];
				p++; index2++;
			}
		}

		while(index1<=mid) // for remaning element
		{
			str[p++] = arr[index1++];
		}

		while(index2<=end){ // fro remaning element
			str[p++] = arr[index2];
		}

		// copy into orignal array

		for(int i=0, j=start; j<arr.length; i++,j++){
			arr[j] = str[i];
		}
	}
}