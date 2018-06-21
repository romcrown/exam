

public class Array_Format {

	public static int Run(int a,int b) {
		switch (a) {
		case 1:
			if(b == 1) { //1차원 배열 일때 
				Array_Reverse();	
				break;
			}
			else { //2차원 배열 일때
				Array_2st_Reverse();
				break;
			}
		case 2:
			Array_Random_Drawing();
			break;
		case 3:
			Array_Random();
			break;
		default:
			System.out.println("숫자를 확인해 주세요.");
		}
		return a;
	}

	public static void Array_Reverse() {
		
	}
	
	public static void Array_2st_Reverse() {
		
	}

	public static void Array_Random_Drawing() {

	}

	public static void Array_Random() {

	}

	public static void main(String[] args) {

	}
}
