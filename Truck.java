import java.util.*;
public class Truck{
    public static void main(String []args){
        int bridgeLen = 2;
        int bridgeWeight = 10;
        int []trucks = {7,4,5,6};
        System.out.print(solution(bridgeLen,bridgeWeight,trucks));
    }
    public static int solution(int bridgeLen,int bridgeWeight,int[] trucks){
        int answer = 0;
        Queue<Integer>q = new LinkedList<>();
        int max = 0;
        for (int w: trucks){
            while(true){
                if (q.isEmpty()){
                    q.offer(w);
                    max+=w;
                    answer++;
                    break;
                } else if (q.size() == bridgeLen){
                    max-=q.poll();
                } else {
                    if (max + w > bridgeWeight){
                        q.offer(0);
                        answer++;
                    } else {
                        q.offer(w);
                        max+=w;
                        answer++;
                        break;
                    }
                }

            }
        }
        return answer+bridgeLen;
    }
}