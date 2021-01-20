import java.util.*;

public class Carpet {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/* 갈색 격자 */ 
		System.out.print("brown: ");
		int brown = scanner.nextInt();
		if (brown<8 || brown>5000) return;
		/* 노란색 격자 */ 
		System.out.print("yellow: ");
		int yellow = scanner.nextInt();
		if (yellow<1 || yellow>2000000) return;
		
		System.out.print(solution(brown,yellow));
	}
	public static String solution(int b,int y) {
		Vector<Integer> answer = new Vector<>();
		int num = b+y;
		for(int i=1;i<=num;i++) {
			if ((num%i)==0) answer.add(i); //num의 약수 구하기
		}
		int n1,n2;
		if ((answer.size())%2==0) { //약수가 짝수개
			n1 = answer.get(answer.size()/2);
			n2 = answer.get(answer.size()/2-1);
			answer.removeAllElements();
			answer.add(n1); answer.add(n2);
		}else { //약수가 홀수개
			n1 = answer.get(answer.size()/2);
			answer.removeAllElements();
			answer.add(n1);answer.add(n1);
		}
		return answer.toString();
	}
}