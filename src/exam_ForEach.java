import java.util.Scanner;

public class exam_ForEach {
	public static void main(String[] args) {

		//for(타입 값을 받아줄 변수명. : 출력하고 싶은 자료 구조. )
		
		Scanner sc = new Scanner(System.in);
		System.out.println("intput array_size values >");
		int num = sc.nextInt();
		
		int[] a = new int[num];
		for(int i = 0 ; i < a.length ; i++ ) {
			System.out.print("input values > ");
			a[i] = sc.nextInt();
		}
		
		System.out.println();
		for(int out : a) {
			System.out.println(out);
		}
		
		//foreach문 2차원 배열 String 형 
		/*for (String[] a : Str ) {
		for(String b : a ) {
			System.out.println(b);
		}
		}*/

		sc.close();
	}
}
