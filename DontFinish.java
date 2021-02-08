import java.util.HashMap;

class DontFinish{
    public static void main (String []args){
        String [] participant = {"marina","josipa","nikola","vinko","filipa"};
        String [] completion = {"josipa","filipa","marina","nikola"};
        System.out.print(solution(participant,completion));
    }
    public static String solution(String []participant,String []completion){
        String answer = "";
        HashMap<String,Integer> map = new HashMap<>();
        for (String p:participant){
            if (map.containsKey(p)){ //같은 이름의 참가자가 존재한다면
                map.replace(p,map.get(p)+1); //해시맵의 인터져 값 증가하기 
            } else {
                map.put(p,1); //해시맵에 저장
            }
        }
        for (String c:completion){
            map.replace(c,map.get(c)-1); //같은 이름에 있는 인터져 값 대체
        }
        for(String s : map.keySet()){
            if(map.get(s)==1){
                answer = s;
                break;
            }
        }
        return answer;
    }
}
