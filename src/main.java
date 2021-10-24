import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] list = Arrays.stream(inp.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int point = Integer.parseInt( inp.nextLine());
        String  command =inp.nextLine();

        int sumleft = 0;
        int sumRight = 0;

        for( int i =0; i<list.length; i++) {
            if (i < point) {
                if (command.equals("cheap")) {
                    if (list[i] < list[point]) {
                        sumleft += list[i];
                    }
                } else {
                    if (list[i] >= list[point]) {
                        sumleft += list[i];
                    }
                }

            } else if (i > point) {
                if (command.equals("cheap")) {
                    if (list[i] < list[point]) {
                        sumRight += list[i];
                    }
                } else {
                    if (list[i] >= list[point]) {
                        sumRight += list[i];
                    }
                }
            }
        }
        if( sumleft >= sumRight){
            System.out.print("Left - " + sumleft);
        }else{
            System.out.print("Right - " + sumRight);
        }
    }
}
