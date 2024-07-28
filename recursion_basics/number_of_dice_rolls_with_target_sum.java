import java.util.ArrayList;

public class number_of_dice_rolls_with_target_sum {

    public static void main(String[] args) {
       System.out.println(numRollsToTarget(2,6,7)); 
    }
    public static int numRollsToTarget(int n, int k, int target) {
        int a=diceRet(String.valueOf(n),target,k);
        return a;
    }
    static int diceRet(String p, int target,int face) {
    if (target == 0) {

        return 1;
    }

    int b=0;
    for (int i = 1; i <= face && i <= target; i++) {
        b=b+(diceRet(p + i, target - i,face));
    }
    return b;
}

}
