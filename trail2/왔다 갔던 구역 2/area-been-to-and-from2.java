import java.util.Scanner;
public class Main {
    public static final int offset = 1000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] trace = new int[100000];
        for (int i=0; i<trace.length; i++) trace[i] = 0;
        int cursor = 0; //현재 위치
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char dir = sc.next().charAt(0);
            if(dir == 'R') {
                for(int j=cursor + offset; j<cursor + offset + x; j++){
                    trace[j] ++;
                }
                cursor += x;
            }
            else {
                for(int j=cursor + offset-1; j >= cursor + offset - x ; j--){
                    trace[j] ++;
                }
                cursor -= x;
            }
        }
        
        int count = 0;
        for(int i=0; i<trace.length; i++){
            if(trace[i] > 1) count++;
        }

        System.out.println(count);
    }
}