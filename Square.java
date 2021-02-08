public class Square {
    public static void main(String []args){
        System.out.print(solution(8,12));
    }
    /* 사용할 수 있는 정사각형의 개수 반환 */
    public static long solution(int width,int height){
        long w = Long.parseLong(String.valueOf(width));
        long h = Long.parseLong(String.valueOf(height));
        
        return (w*h)-(w+h-gcd(w,h));
    }
    /* 최대공약수 구하기 */
    public static long gcd (long w,long h){
        long min,max;
        max = w>=h ? w:h;
        min = w<h ? w:h;
        while (min !=0){
            long temp = max%min;
            max=min;
            min=temp;
        }
        return max;
    }
}
