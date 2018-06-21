import java.util.Scanner;

public class Array_main {

	public static Scanner sc = new Scanner(System.in);

	public static void Run() {
		System.out.println("==== 배열 만들기 ====");
		System.out.println("1. 1차원 배열 만들기.");
		System.out.println("2. 2차원 배열 만들기.");
		System.out.println("==================");
		System.out.print("Input > ");
		int input = sc.nextInt();
		Number(input);
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
			System.out.println("입력한 값을 다시 확인 해주세요.");
		}
		return 0;
	}


	public static void main(String[] args) {
		Array_main r = new Array_main();
		r.Run();
	}

}
