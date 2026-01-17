import java.util.ArrayList;
import java.util.Scanner;

public class ScannerSet {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(true){
            String temp = sc.nextLine();
            int temp1 = Integer.parseInt(temp);
            if (temp1<1 || temp1>100){
                continue;
            }
            list.add(temp1);//自动装箱后添加
            if (getSum(list)>=200){
                break;
            }
        }
    }

    public static int getSum(ArrayList<Integer> list){
        int sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        return sum;
    }
}
