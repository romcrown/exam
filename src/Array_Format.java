import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Array_Format {

	public static Scanner sc = new Scanner(System.in);

	public static int Run(int a, int b) {
		switch (a) {
		case 1:
			if (b == 1) { // 1차원 배열 일때
				Array_Reverse();
				break;
			} else { // 2차원 배열 일때
				Array_2st_Reverse();
				break;
			}
		case 2:
			if (b == 1) {
				Array_1st_Random_Drawing();
				break;
			}
			Array_2st_Random_Drawing();
			break;
		case 3:
			Array_Random();
			break;
		default:
			System.out.println("Check the entered of number.");
		}
		return a;
	}

	public static void Array_Reverse() {
		System.out.println("=====================");
		System.out.println("Reverse order of Array.");

		ArrayList<String> list = new ArrayList<String>(Arrays.asList(Array_1st.F_Array));
		// Array -> ArrayList 로 바꿔준다.
		Collections.reverse(list);
		// Collections 를 사용해서 배열을 뒤집어 준다.

		System.out.print("output > ");
		System.out.println(list);
	}

	public static void Array_1st_Random_Drawing() {
		int a;
		String rep;
		String temp;
		System.out.println("=====================");
		System.out.println("1차원 배열 랜덤 뽑기.");

		while (true) {

			for (int j = 0; j < 100; j++) {
				a = (int) (Math.random() * Array_1st.First_size);
				temp = Array_1st.F_Array[0];
				Array_1st.F_Array[0] = Array_1st.F_Array[a];
				Array_1st.F_Array[a] = temp;
			}

			System.out.println("랜덤 으로 뽑힌 값 > " + "[" + Array_1st.F_Array[0] + "]");

			while (true) {
				System.out.println("Repeat Drawing ? (y,n)");
				rep = sc.next();

				if (rep.equals("y") || rep.equals("n")) {
					break;
				}
			}
			if (rep.equals("n"))
				break;
		}
	}

	public static void Array_2st_Reverse() {
		
		//int a = Array_2st.F_Second_size;
		//int b = Array_2st.S_Second_size;
		//String[][] c = Array_2st.S_Array;
		int a = 3;
		int b = 1;
		String[][] c = {{"1","2"},{"3","4",},{"5","6"},{"7","8"}};
		
		//System.out.println("행을 역순으로.");
		for( int i = 0 ; i < c.length; i++) {
			if(i < c.length) {
				for( int j = 0 ; j<c[i].length; j++) {
					System.out.print(c[i][j] + " ");	
				}	
			}
			System.out.println();
			
		}
		
		for (int i = a - 1 ; i <= 0 ; i-- ){
			for (int j = 0 ; j < c[i].length; j++) {
				System.out.print(c[i][j]+" ");
			}
		}
		//System.out.println("열을 역순으로.");

	}

	public static void Array_2st_Random_Drawing() {

	}

	public static void Array_Random() {

	}

	public static void main(String[] args) {

		Array_Format.Array_2st_Reverse();
	}
}
