package algorithm.recursion;

/**
 * @author gongcy
 * @date 2023/3/7 6:52 上午
 * @Description 递归 找座位
 */
public class FileApplet {

    public static void main(String[] args) {
//        int n = seek(5);
        int n = seekNoRecursion(5);
        System.out.println(n);
    }

    /**
     * 非递归方式即迭代循环
     * @param n
     * @return
     */
    private static int seekNoRecursion(int n) {
        int ret = 1;
        for (int i = 2; i <= n; i++) {
            ret = ret + 1;
        }
        return ret;
    }

    /**
     * 递归方式
     * @param k
     * @return
     */
    private static int seek(int k) {
        if (k == 1) {
            return 1;
        }

        return seek(k - 1) + 1;
    }
}
