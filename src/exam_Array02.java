import java.util.Scanner;

public class exam_Array02 {
	
	public static void Run() {
		Scanner sc = new Scanner(System.in);		
		System.out.println("==== 배열 만들기 ====");
		System.out.println("1. 1차원 배열 만들기.");
		System.out.println("2. 2차원 배열 만들기.");
		System.out.print("> ");
		int input = sc.nextInt();
		Number(input);
	}

	public static int Number(int a) {
		switch(a) {
		case 1 :
			First_Array(); //1차원 배열 
			break;
		case 2 :
			Second_Array(); //2차원 배열 
			break;
		default :
			System.out.println("입력한 값을 다시 확인 해주세요.");
		}
		return a;
	}

	//1차원 배열 만들기.
	public static void First_Array(){
		Scanner sc = new Scanner(System.in);
		System.out.println("1차원 배열의 크기를 정해주세요.");
		int First_size = sc.nextInt();
		
		sc.close();
		
	}
	
	public static String[] First_Str(int a) {
		return null;
	}

	public static String[][] Second_Str(int i, int j) {

		return null;
	}
	
	public static void Second_Array() {
		
	}

	public static void main(String[] args) {
		exam_Array02 r = new exam_Array02();
		r.Run();
	}

}
