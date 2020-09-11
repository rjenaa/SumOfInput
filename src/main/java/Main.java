/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {
    public static sum(int input){
        int sum = 0;
        for (int i = input; i > 0; i--){
            sum+= i;
        }
        return sum;
    }


    public static void main(String[] args){
        System.out.println(sum(3));

    }
}
