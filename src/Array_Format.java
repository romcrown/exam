import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
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
			if ( b == 1) {
				Array_1st_Random();
				break;
			}
			Array_2st_Random();
			break;
		default:
			System.out.println("Check the entered of number.");
		}
		return a;
	}

	//1차원 배열 순서 뒤집기.
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

	//1차원 배열 값 랜덤 뽑기.
	public static void Array_1st_Random_Drawing() {
		int a;
		String rep;
		String temp;
		System.out.println("=====================");
		System.out.println("1st Random Array Drawing.");

		while (true) {

			for (int j = 0; j < 100; j++) {
				a = (int) (Math.random() * Array_1st.First_size);
				temp = Array_1st.F_Array[0];
				Array_1st.F_Array[0] = Array_1st.F_Array[a];
				Array_1st.F_Array[a] = temp;
			}

			System.out.println("Random Values > " + "[" + Array_1st.F_Array[0] + "]");

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

	//2차원 배열순서 행, 열 기준으로 바꾸기 and 행과 열 숫자 바꾸기.
	public static void Array_2st_Reverse() {

		 int a = Array_2st.F_Second_size;
		 int b = Array_2st.S_Second_size;
		// String[][] c = Array_2st.S_Array;

		/*
		 * int a = 3; int b = 1; String[][] c =
		 * {{"1","2"},{"3","4",},{"5","6"},{"7","8"}}; for( int i = 0 ; i < c.length;
		 * i++) { if(i < c.length) { for( int j = 0 ; j<c[i].length; j++) {
		 * System.out.print(c[i][j] + " "); } } System.out.println();
		 * 
		 * }
		 * 
		 * for (int i = a ; i >= 0 ; i-- ){ for (int j = 0 ; j < c[i].length; j++) {
		 * System.out.print(c[i][j]+" "); } System.out.println(); }
		 */
		/*
		 * for(int i = 0 ; i<Array_2st.S_Array.length ; i++) { for(int j = 0 ; j<
		 * Array_2st.S_Array[i].length ; j++) {
		 * System.out.print(Array_2st.S_Array[i][j]+" "); } System.out.println(); }
		 */
		System.out.println("1. Reverse Array Value.");
		System.out.println("=======================");
		System.out.println("Reverse Row.");
		System.out.println("output > ");

		for (int i = a - 1; i >= 0; i--) {
			for (int j = 0; j < Array_2st.S_Array[i].length; j++) {
				System.out.print(Array_2st.S_Array[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("=======================");
		System.out.println("Reverse Column.");
		System.out.println("output > ");

		for (int q = 0; q < Array_2st.S_Array.length; q++) {
			for (int w = b - 1; w >= 0; w--) {
				System.out.print(Array_2st.S_Array[q][w] + " ");
			}
			System.out.println();
		}
		
		System.out.println("=======================");
		System.out.println("Change Row And Column");
		System.out.println("output > ");
		
		for(int i = a-1 ; i >= 0 ; i--) {
			for(int j = b -1 ; j >= 0 ; j--) {
				System.out.print(Array_2st.S_Array[i][j] + " ");
			}
			System.out.println();
		}
	}

	//2차원 배열의 값 랜덤 뽑기.
	public static void Array_2st_Random_Drawing() {
		int a,b ;
		String rep;
		String temp;
		System.out.println("=====================");
		System.out.println("2st Random Array Drawing.");

		while (true) {

			for (int j = 0; j < 100 ; j++) {
				a = (int) (Math.random() * Array_2st.F_Second_size);
				b = (int) (Math.random() * Array_2st.S_Second_size);
				temp = Array_2st.S_Array[0][0];
				Array_2st.S_Array[0][0] = Array_2st.S_Array[a][b];
				Array_2st.S_Array[a][b] = temp;
			}

			System.out.println("Random Values > " + "[" + Array_2st.S_Array[0][0] + "]");

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

	//1차원 배열 랜덤 정렬.
	public static void Array_1st_Random(){
		System.out.println("1st Array Random Sort.");
		System.out.println("=================");
		
		int alpa = Array_1st.First_size;
		int[] num = new int[alpa];
		
		for(int i = 0 ; i < num.length ; i++) {
			num[i] = (int)(Math.random()*alpa);
			for(int j = 0 ; j < i ; j++) { //랜덤으로 설정된 값이 중복되지 않게해줌.
				if(num[i] == num[j]) {
					i--;
					break;
				}
			}
		}
		
		for(int i = 0 ; i < Array_1st.F_Array.length ; i ++) {
			System.out.print(Array_1st.F_Array[num[i]] + " ");
		}
	}
	
	//2차원 배열 랜덤 정렬. 
	public static void Array_2st_Random() {
		
		System.out.println("2st Array Random Sort.");
		System.out.println("==================");
		
		int alpa = Array_2st.F_Second_size;
		int beta = Array_2st.S_Second_size;
		int[] F_num = new int[Array_2st.F_Second_size];
		int[] S_num = new int[Array_2st.S_Second_size];
				
		//int alpa = 5;
		//int beta = 4;	
		//int[] F_num = new int[5];
		//int[] S_num = new int[4];
		
		// 2차원 배열 행 의 인덱스값 랜덤설정.
		for(int i = 0 ; i < F_num.length ; i++) {
			F_num[i] = (int)(Math.random()*alpa);
			for(int j = 0 ; j < i ;j++) { // 이 for문 은 랜덤값 생성시 같은값을 없애준다. 
				if(F_num[i] == F_num[j]) {
					i--;
					break;
				}
			}
		}
		//System.out.println(Arrays.toString(F_num)); 출력값 확인,
		
		//2차원 배열 열 의 인덱스값 랜덤 설정.
		for(int i = 0 ; i < S_num.length ; i++) {
			S_num[i] = (int)(Math.random()*beta);
			for(int j = 0 ; j < i ; j++) {
				if(F_num[i] == F_num[j]) {
					i--;
					break;
				}
			}
		}
		//System.out.println(Arrays.toString(S_num)); 출력값 확인.
		
		// 2차원 배열의 랜덤 값을 출력.
		for (int i = 0 ; i<Array_2st.S_Array.length; i++) {
			for(int j = 0 ; j<Array_2st.S_Array[i].length; j++) {
				System.out.print(Array_2st.S_Array[F_num[i]][S_num[j]]+" ");
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {

		// Array_Format.Array_2st_Reverse(); 출력값 확인.
		// Array_Format.Array_Random(); 출력값 확인.
	}
}
