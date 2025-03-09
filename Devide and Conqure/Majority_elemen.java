class Majority_element{
	public static void main(String args[]){
		int arr[] = {1,1,3,1,2,4,2,7,1,8,1};
		System.out.println(Winner(arr));	

	}

	public static int Winner(int arr[])
	{
		int Winner = arr[0];
		int lead = 1;

		for(int i=1; i<arr.length; i++)
		{
			if(arr[i] == Winner)
			{
				lead++;
			}else if (lead > 0) {
				lead--;	
			} else{
				Winner = arr[i];
			}
		}
		return Winner;
	}
}