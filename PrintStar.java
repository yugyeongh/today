import java.util.Scanner;

public class PrintStar {
    static char arr [][];
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int len = 1;

        for (int i=0;i<n-1;i++){
            len +=4;
        }

        /* 배열 초기화 */
        arr = new char [len][len];
        for(int i=0; i<len; i++) {
            for(int j=0; j<len; j++) {
                arr[i][j] = ' ';
            }
        }

        fact(len,0);

        /* 배열 출력하기 */
        for(int i=0; i<len; i++) {
            for(int j=0; j<len; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        sc.close();
    }
    public static void fact (int len,int x){

        if (len == 1) return;
        
        for (int i=x;i<len;i++){
            arr [x][i] = '*'; //위쪽 가로
            arr [i][x] = '*'; //왼쪽 세로
            arr [i][len-1] = '*'; //오른쪽 세로
            arr [len-1][i] = '*'; //아래쪽 가로
        }

        fact(len-2,x+2);
    }
}
