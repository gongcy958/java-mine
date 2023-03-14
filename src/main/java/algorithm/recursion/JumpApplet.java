package algorithm.recursion;

/**
 * @author gongcy
 * @date 2023/3/7 7:08 上午
 * @Description
 */
public class JumpApplet {

    public static void main(String[] args) {

        int k = jump(5);
        System.out.println(k);
    }

    private static int jump(int n) {

        if (n == 1) {
            return 1;
        }

        if (n == 2) {
            return 2;
        }
        return jump(n - 1) + jump(n - 2);
    }
}
