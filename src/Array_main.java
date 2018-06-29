import java.util.Scanner;

public class Array_main {

	public static Scanner sc = new Scanner(System.in);

	public static void Run() {

		System.out.println("===== Create Array =====");
		System.out.println("1. Create 1st Array."); // 1차원 배열 만들기.
		System.out.println("2. Create 2st Array."); // 2차원 배열 만들기.
		System.out.println("3. Stop a Create Array.");
		System.out.println("========================");
		
		System.out.print("Input > ");
         /*while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Please input a 1 or 2 or 3.");
			System.out.print("Input > ");
			break;
		} */
		// int형에 숫자가 아닌 문자를 넣었을때 오류 처리.
		

		int input = sc.nextInt();

		if (input == 1 || input == 2) {
			while (true) {
				while (true) {
					System.out.printf("Is the value you entered %d correct? (y,n) ", input); // 입력한 숫자 확인하기.
					String val = sc.next(); // y 나 n을 받는 scanner.
					if (val.equals("y")) { // 입력값이 y 일떄.
						Number(input);
						break;
					} else if (val.equals("n")) { // 입력값이 n 일때.
						Run();
						break;
					} else {
						System.out.println("Check the entered value."); // y,n 외의 값을 넣었을때.
						break;
					}
				}
				break;
			}
		}
		else if (input == 3) {
			System.out.println("Stop a Create Array.");
		}
		else {
			System.out.println("Check the entered number");
			Run();
		}

	}

	public static int Number(int a) {
		switch (a) {
		case 1:
			Array_1st.Run(); // 1차원 배열 클래스
			break;
		case 2:
			Array_2st.Run(); // 2차원 배열 클래스
			break;
		default:
			System.out.println("Check the entered number");
		}
		return 0;
	}

	public static void main(String[] args) {
		Array_main start = new Array_main() ;
		start.Run();
	}

}
