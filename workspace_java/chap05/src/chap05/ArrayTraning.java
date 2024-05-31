package chap05;

public class ArrayTraning {
	public static void main(String[] args) {
		
		// 주어진 배열의 전체항목의 합과 평균값을 구하여라.
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		int sum2 = 0;
		int sum = 0;
		double avg = 0;
		
		for (int i=0; i<array.length; i++) {
			sum2 = sum2 + array[i].length;
			for (int j=0;j<array[i].length; j++) {
				sum = sum + array[i][j];
			}
		}
		avg = (double)sum/sum2;
		
		
		System.out.println("sum :" + sum);
		System.out.println("avg :" + avg);
	
		
		// 주어진 배열의 항목에서 최대값을 구하여라.
		int max = 0;
		int[] array2 = {1, 5, 3, 8, 2};
		int who = 0;
		for (int i=0; i<array2.length; i++) {
			if (array2[i] > max) {
				max = array2[i];
				who = i;
			}
		}
		System.out.println("index : " + who);
		System.out.println("max : " + max);
		
		
	}
}
