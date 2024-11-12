public class LoopEx{
	public static void main(String[] args){

		byte[] ages = {18,20,21,34,32,67,32,15,16,53};

		int[] salary = {520000,38000,100000,155000,200000,45000,60000,78000,52000,90000};

		float[] cgpa = {5.6f, 4.8f, 3.4f,5.8f,4.5f,6.2f,3.6f,6.2f,8.4f,2.9f};

		char[] alphabets = {'A' , 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};

		String[] subjects = {"Maths","English","Kannada","Hindi","Social","Science","Economics","Accountancy","Biology","Chemistry"};


		System.out.println("-----------------From Left to Right---------------");

		for(int i = 0; i < 10; i++){
			System.out.println(ages[i]);
			System.out.println(salary[i]);
			System.out.println(cgpa[i]);
			System.out.println(alphabets[i]);
			System.out.println(subjects[i]);
		}

		System.out.println("-----------------From Right to Left---------------");

		for(int i = 9; i < 0; i--){
			System.out.println(ages[i]);
			System.out.println(salary[i]);
			System.out.println(cgpa[i]);
			System.out.println(alphabets[i]);
			System.out.println(subjects[i]);

		}

		System.out.println("-----------------From Middle to Left---------------");

		for(int i = 5; i > 5 ; i--){

			System.out.println(ages[i]);
			System.out.println(salary[i]);
			System.out.println(cgpa[i]);
			System.out.println(alphabets[i]);
			System.out.println(subjects[i]);

		}

		System.out.println("-----------------From Left to Middle---------------");

		for(int i = 0; i < 5 ; i++){

			System.out.println(ages[i]);
			System.out.println(salary[i]);
			System.out.println(cgpa[i]);
			System.out.println(alphabets[i]);
			System.out.println(subjects[i]);

		}

		System.out.println("-----------------From Skipping One Element---------------");

		for(int i = 0; i < 10; i=i+2){

			System.out.println(ages[i]);
			System.out.println(salary[i]);
			System.out.println(cgpa[i]);
			System.out.println(alphabets[i]);
			System.out.println(subjects[i]);


		}









		 
	}
}