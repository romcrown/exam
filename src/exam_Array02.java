import java.util.Scanner;

public class exam_Array02 {

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
			First_Array(); // 1차원 배열
			break;
		case 2:
			Second_Array(); // 2차원 배열
			break;
		default:
			System.out.println("입력한 값을 다시 확인 해주세요.");
		}
		return 0;
	}

	// 1차원 배열 만들기.
	public static void First_Array() {
		System.out.println("1차원 배열의 크기를 정해주세요.");
		System.out.print("Input > ");
		int First_size = sc.nextInt();		
		
		String[] F_Array = new String[First_size];
		System.out.printf("[%d] 의 크기를 가진 1차원 배열.\n",First_size);		
		sc.nextLine();
		
		// 배열에 값 넣기.
		for (int i = 0 ; i < F_Array.length ; i++) {
			System.out.printf("[%d] InPut > ",(i+1));
			F_Array[i] = sc.nextLine();
		}
		
		// 배열에 넣어진 값 출력하기.
		System.out.printf("[$d] Array OutPut \n",First_size);
		for(int i = 0 ; i < F_Array.length ; i++) {			
			System.out.print("["+(i+1)+"] > "+F_Array[i]+" ");
		}
		System.out.println();
		sc.close();

	}
    
	//2차원 배열
	public static void Second_Array() {
		System.out.println("2차원 배열의 [행][]의 크기를 정해주세요.");
		System.out.print("Input > ");
		int F_Second_size = sc.nextInt();
		System.out.println("2차원 배열의 [][열]의 크기를 정해주세요.");
		System.out.print("Input > ");
		int S_Second_size = sc.nextInt();
		
		String[][] S_Array = new String[F_Second_size][S_Second_size];
		System.out.printf("[%d][%d] 크기를 가진 2차원 배열. \n",F_Second_size,S_Second_size);
		System.out.println("=========================");
		sc.nextLine();
		
		for(int i = 0 ; i<S_Array.length ; i++) {
			for(int j = 0 ; j<S_Array[i].length ; j++) {
				System.out.printf("[%d][%d] Input > ",(i+1),(j+1));
				S_Array[i][j] = sc.nextLine();
			}
		}
		System.out.println("=====================");
		System.out.printf("[%d][%d] Array OutPut \n",F_Second_size,S_Second_size);
		
		for(int i = 0 ; i < S_Array.length ; i++) {
			if(i < S_Array.length ) { //하나의 행이 끝나면 다음 행을 밑에서 출력하게 해준다.
				for(int j = 0 ; j <S_Array[i].length; j++) {
					System.out.print(S_Array[i][j]+" ");
				}		
			}
		System.out.println();
		}
	
	}

	public static void main(String[] args) {
		exam_Array02 r = new exam_Array02();
		r.Run();
	}

}
