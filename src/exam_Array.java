import java.util.Scanner;

public class exam_Array {
	
	public static void main(String[] args) {

 		String[] first_Str = new String[2]; 
		String[][] Str = new String[2][3]; //2행 3열 

		int[] first_number = new int[3];
 		int[][] number = new int[3][3]; //3행 3열
		
		int i, j;
		
		Scanner sc = new Scanner(System.in);

		// String형 1차원 배열	
		for(i = 0 ; i < first_Str.length ; i++) {
			System.out.printf("%d 번째 단어를 넣어 주세요 : (남은횟수 %d)\n",(i+1),(first_Str.length-i));
			first_Str[i] = sc.nextLine();
		}
		
		/*for(String a:first_Str) {
			System.out.println(a);
		}*/
		
		for(i = 0 ; i< first_Str.length; i++) {
			System.out.print((i+1)+"번째 값 > "+first_Str[i]);
			System.out.println();
		}
		
		// String형 2차원 배열
		for (i = 0; i < Str.length; i++) {
			for (j = 0; j < Str[i].length; j++) {
				System.out.println(i + " 행 " + j + " 열 넣을 문자를 입력하세요.");
				Str[i][j] = sc.nextLine();
			}
		}
		System.out.println("String_OutPut>");
		
		/*for (String[] a : Str ) {
			for(String b : a ) {
				System.out.println(b);
			}
		}*/
	
		for (i = 0; i < Str.length; i++) {
			System.out.println(i+"행의 배열의 값");
			if (i <= Str.length) {
				for (j = 0; j < Str[i].length; j++) {
					System.out.print(Str[i][j] + " ");
				}
				System.out.println();
			}

		}
		
		System.out.println();
		
		// int 형 1차원 배열 
		for ( i = 0 ; i < first_number.length ; i ++) {
			System.out.printf("%d 번째 숫자를 넣어 주세요.(남은횟수: %d)\n",(i+1),(first_number.length-i));
			int output = sc.nextInt();
			first_number[i] = output;
		}
		for ( i = 0 ; i < first_number.length ; i++) {
			System.out.printf("%d 번째 값 > %d\n",(i+1),first_number[i]);
		}
		
		// int형 2차원 배열 
		for (int a = 0; a < number.length; a++) {
			for (int b = 0; b < number[a].length; b++) {
				System.out.println(a + " 행" + b + " 열 숫자를 입력하세요.");
				number[a][b] = sc.nextInt();
			}
		}
		System.out.println("Int_OutPut >");
		for (int a = 0 ; a < number.length; a++) {
			if(a<=number.length) {
				System.out.println();
				for(int b = 0; b<number[a].length; b++ ) {
				System.out.print(number[a][b]+" ");	
				}
			}
			
		}
		sc.close();

	}

}
