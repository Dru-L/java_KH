package alone.ex;
import java.util.Scanner;

public class Ex {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int input = 1;
		while(input != 0) {
			System.out.print("메뉴 선택 >> ");
			input = sc.nextInt();
			if(input == 0) {
				break;
			}
		}
		
    }

}
