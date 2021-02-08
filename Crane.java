import java.util.*;
public class Crane {
    public static void main(String[]args){
        int arr[][] = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int moves[] = {1,5,3,5,1,2,1,4};
        System.out.println(solution(arr,moves));
    }
    public static int solution(int[][] board,int[] moves){
        int answer=0;
        Stack<Integer> stack =  new Stack<>();
        for (int i=0;i<moves.length;i++){ //열
            for (int j=0;j<board.length;j++){ //행

                if (board[j][moves[i]-1]!=0){
                    if (stack.isEmpty()){ //스택이 비어 있으면 인형 넣기
                        stack.push(board[j][moves[i]-1]);
                    } else { //스택이 비어있지 않으면
                        if (stack.peek() == board[j][moves[i]-1]){ //인형이 동일하면
                            stack.pop(); //스택에 있는 인형 삭제
                            answer+=2; //값 증가
                        } else { //인형이 동일하지 않으면
                            stack.push(board[j][moves[i]-1]); //스택에 인형 추가
                        }
                    }
                    board[j][moves[i]-1]=0;
                    break;
                }
            }
        }
        return answer;
    }
}
