package Array;

public class Array_acount {

	public static void main(String[] args) {

//int[] scores;

//scores = new int[] { 75, 80, 90 };

		int[] scores = { 83, 90, 87 };
		System.out.println(scores);
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);

		int sum1 = 0;
		for (int i = 0; i < 3; i++) {
			sum1 += scores[i];

		}

		System.out.println(scores);
		System.out.println("รัวี : " + sum1);
		int sum2 = add(scores);

// int sum2 = add( new int[] { 75, 80, 90 } );

		System.out.println("รัวี : " + sum2);
		System.out.println();
	}

	public static int add(int[] scores) {
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += scores[i];
		}
		return sum;
	}

}