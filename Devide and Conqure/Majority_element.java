class Majority_element{
	public static void main(String args[]){
		int arr[] = {1,1,3,1,2,4,2,7,1,8,1};
		System.out.println(Winner(arr));	

	}

/*
	Given an array nums of size n, returnthe majority element. (MEDIUM)Themajorityelementistheelementthatappearsmorethan⌊n/2⌋times.Youmayassumethat the majority element always exists in the array.Sample Input 1: nums = [3,2,3]Sample Output 1: 3Sample Input 2: nums = [2,2,1,1,1,2,2]Sample Output 2: 2Constraints(extra Conditions):●n == nums.length●1 <= n <= 5 * 104●-109 <= nums[i] <= 10
*/
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