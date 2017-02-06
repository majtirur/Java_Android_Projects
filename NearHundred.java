class NearHundred {
	public static boolean nearHundred(int num) {
		if(num >= 90 && num <= 110)
			return true;
		else if (num >= 190 && num <= 210)
			return true;
		return false;
	}
	public static void main(String args[]){
		int[] nums = {90, 93, 89, 111, 194, 167, 201, 210};

			System.out.println("iter \t current_number => nearHundred(current_number");
		for(int iter = 0; iter < nums.length; iter++) {
			int current_number = nums[iter];
			System.out.println(iter + "\t" + current_number + " => " + nearHundred(current_number));
		}
	}
}
