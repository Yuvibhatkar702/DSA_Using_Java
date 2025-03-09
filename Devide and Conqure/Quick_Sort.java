class Quick_Sort{

	public static int Partion(int arr[], int si, int li){
		int i = si-1;
		int pivot = arr[li];

		for(int j=si; j<li; j++){

			if(arr[j] < pivot){
				i++;
				// swap
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		// pivot index
		i++;
		int temp = arr[i];
		arr[i] = pivot;
		arr[li] = temp;
		return i;
	}

	/*
	 * Very IMP Quction 
	 * The worst Case occure in Quick_Sort When pivot is always be thr smaller element or the largest element of the array.
	 */

	public static void Quick(int arr[], int si, int li){
		if(si < li){

			int pivot = Partion(arr, si , li);
			Quick(arr, si, pivot-1); // left hand side
			Quick(arr, pivot+1, li); // rigth hand side
		}
	}
	public static void main(String args[])
	{
		int arr[] = {6,3,9,5,2,8};
		Quick(arr,0,arr.length-1);

		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}