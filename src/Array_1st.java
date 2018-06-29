import java.util.Scanner;

public class Array_1st {

	public static String[] F_Array;
	public static int First_size;
	
	public static void Run() {
		
		Scanner sc = new Scanner(System.in);	

		System.out.println("========================");
		System.out.println("Please specify the size of Array."); // 배열의 크기 정하기.
		System.out.print("Input > ");
		
		First_size = sc.nextInt(); 
		F_Array = new String[First_size];

		System.out.println("========================");
		System.out.printf("An Array of a size of [%d] \n", First_size);
		sc.nextLine();

		// 배열에 값 넣기.
		for (int i = 0; i < F_Array.length; i++) {
			System.out.printf("[%d] InPut > ", (i + 1));
			F_Array[i] = sc.nextLine();
		}

		// 배열에 넣어진 값 출력하기.
		System.out.println("===================");
		System.out.printf("[%d] Size Array OutPut > \n", First_size);
	
		for (int i = 0; i < F_Array.length; i++) {
			System.out.print("[" + (i + 1) + "] = " + F_Array[i] + " ");
		}		
		System.out.println();
		
		System.out.print("[ ");
		for (int i = 0 ; i < F_Array.length; i++) {		
			System.out.print(F_Array[i]+" ");
		}
		System.out.print("]\n");
		
		System.out.println("=====================");
		
		System.out.println("1. Reverse Array Value.");
		System.out.println("2. Random Array Drawing.");
		System.out.println("3. Array Ranom Sort.");
		System.out.println("=====================");
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
