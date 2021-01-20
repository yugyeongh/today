import java.util.Scanner;

public class FindNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //개수 입력받기
		int n[] = new int [N]; 
		
		for (int i=0;i<n.length;i++) 
			n[i] = sc.nextInt(); //입력한 N만큼 반복
		
		int M = sc.nextInt(); //개수 입력받기
		int m[] = new int [M];
		for (int i=0;i<m.length;i++)
			m[i] = sc.nextInt(); //입력한 M만큼 반복
		search(n,m);
	}
	public static void search(int n[],int m[]) {
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<n.length;j++) {
				if (m[i] == n[j]) { 
					System.out.print("1");
					break;
				}
				if (j == n.length-1) System.out.print("0");
			}
		}
	}
}