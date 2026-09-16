import java.util.Scanner;
public class Main {
    public static final int offset = 100000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tyle = new int[200000]; //1 : white, 2 : black
        int n = sc.nextInt();
        int cursor = 0;
        // for(int i=0; i<tyle.length; i++) tyle[i] = 0;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            char d = sc.next().charAt(0);
            

            if(d == 'R'){ //오른쪽으로 이동하며 타일 오른쪽->검은색으로 뒤집음
                for(int j=cursor + offset; j<cursor + offset + x; j++){
                    tyle[j] = 2; //블랙으로 뒤집음
                }
                cursor += (x-1);
            }
            else{ //왼쪽으로 이동하며 타일 왼쪽 -> 흰색으로 뒤집음
                for(int j=cursor + offset; j> cursor + offset - x; j--){
                    tyle[j] = 1; //흰색으로 뒤집음
                }
                cursor -= (x-1);
            }
        }

        int white = 0;
        int black = 0;
        for(int i=0; i<tyle.length; i++){
            if(tyle[i] == 1) white ++;
            else if(tyle[i] == 2) black ++;
        }

        System.out.print(white + " " + black);
        
    }
}