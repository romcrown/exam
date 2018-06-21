import java.util.Scanner;

public class Array_1st {

	public static void Run() {
		
		Scanner sc = new Scanner(System.in);	

		System.out.println("1차원 배열의 크기를 정해주세요.");
		System.out.print("Input > ");
		int First_size = sc.nextInt();

		String[] F_Array = new String[First_size];
		System.out.printf("[%d] 의 크기를 가진 1차원 배열.\n", First_size);
		sc.nextLine();

		// 배열에 값 넣기.
		for (int i = 0; i < F_Array.length; i++) {
			System.out.printf("[%d] InPut > ", (i + 1));
			F_Array[i] = sc.nextLine();
		}

		// 배열에 넣어진 값 출력하기.
		System.out.printf("[%d] Array OutPut \n", First_size);
		for (int i = 0; i < F_Array.length; i++) {
			System.out.print("[" + (i + 1) + "] > " + F_Array[i] + " ");
		}
		System.out.println();

		System.out.println("1. 배열 값 역순.");
		System.out.println("2. 배열 랜덤 뽑기.");
		System.out.println("3. 배열 랜덤 정렬.");
		System.out.print("Input > ");
		int num = sc.nextInt();
		int a = 1;
		Array_Format.Run(num,a);
		
		sc.close();

	}
	
	public static void main(String[] args) {

		//Array_1st Start = new Array_1st();
		//Start.Run();
	}
}
