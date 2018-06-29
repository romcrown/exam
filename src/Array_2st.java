import java.util.ArrayList;
import java.util.Scanner;

public class Array_2st {

	public static int F_Second_size;
	public static int S_Second_size;
	public static String [][] S_Array;
	
	public static void Run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("2차원 배열의 [행][]의 크기를 정해주세요.");
		System.out.print("Input > ");
		F_Second_size = sc.nextInt();
		System.out.println("2차원 배열의 [][열]의 크기를 정해주세요.");
		System.out.print("Input > ");
		S_Second_size = sc.nextInt();

		//int[] linelength = new int[F_Second_size*S_Second_size]; 
		//ArrayList<Integer> arraylist = new ArrayList<>();
		
		S_Array = new String[F_Second_size][S_Second_size];
		System.out.printf("[%d][%d] 크기를 가진 2차원 배열. \n", F_Second_size, S_Second_size);
		System.out.println("=========================");
		sc.nextLine();

		for (int i = 0; i < S_Array.length; i++) {
			for (int j = 0; j < S_Array[i].length; j++) {
				System.out.printf("[%d][%d] Input > ", (i + 1), (j + 1));
				S_Array[i][j] = sc.nextLine();		 
			}
		}
		System.out.println("=====================");
		System.out.printf("[%d][%d] Array OutPut \n", F_Second_size, S_Second_size);

		for (int i = 0; i < S_Array.length; i++) {
			if (i < S_Array.length) { // 하나의 행이 끝나면 다음 행을 밑에서 출력하게 해준다.
				for (int j = 0; j < S_Array[i].length; j++) {
					System.out.print("("+(i+1)+","+(j+1)+") "+S_Array[i][j]+" ");
				}
			}
			System.out.println();
		}
		
		for (int i = 0; i < S_Array.length; i++) {
			if (i < S_Array.length) { // 하나의 행이 끝나면 다음 행을 밑에서 출력하게 해준다.
				for (int j = 0; j < S_Array[i].length; j++) {
					System.out.print(S_Array[i][j]+" ");
				}
			}
			System.out.println();
		}
		System.out.println("=====================");
		System.out.println("1. Reverse Array Value.");
		System.out.println("2. Random Array Drawing“.");
		System.out.println("3. Array Rendom Sort.");
		System.out.print("Input > ");
		int num = sc.nextInt();
		int a = 2;
		Array_Format.Run(num,a);
		sc.close();

	}
	
	
	public static void main(String[] args) {
		
	}
}
