import java.io.*;
import java.util.Arrays;

public class PhoneNumber {
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String number;
		int num = Integer.parseInt(br.readLine()); //입력할 개수
		String phone_book[] = new String [num];
		for (int i=0;i<phone_book.length;i++) { //번호 입력
			number = br.readLine();
			phone_book[i] = number;
		}
		System.out.print(solution(phone_book));
	}
    public static boolean solution(String[] phone_book) {
        boolean answer = true;
		Arrays.parallelSort(phone_book); //배열 정렬
		for(int i=0;i<phone_book.length-1;i++) {
			if (phone_book[i+1].startsWith(phone_book[i])) { //접두어 겹치면 false
				answer = false;
				break;
			}
		}
		return answer;
    }
}
