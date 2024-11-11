public class ReturnType{
	public static void main(String[] args){

		int result = profit(250 , 150);
		System.out.println("PROFIT:" + result);

		int roll = school(23);
		System.out.println(roll);

		int resultPercentage = marks(555 , 600);
		System.out.println(resultPercentage);

		int totalMoney = pocketMoney(100, 1000, 18620);
		System.out.println(totalMoney);

		

	}

	public static int profit(int originalRate , int buyRate){

		int profitResult = originalRate - buyRate;
		return profitResult;
	}

	public static int school(int rollNo){
		if(rollNo >= 25){
			System.out.println("you are belongs to A batch");

		}
		else{
			System.out.println("you are belongs to B batch");
		}
		return 0;
		
	}

	public static int marks(int obtainedMarks, int totalMaraks){
		int percentage = (obtainedMarks % totalMaraks) * 100;
		return percentage;
	}

	public static int pocketMoney(int perWeek, int perMonth, int perYear){

		int money = perWeek+perMonth+perYear;
		return money;
	}




}