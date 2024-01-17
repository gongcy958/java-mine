/**
 * @author gongcy
 * @date 2023/7/22 5:18 下午
 * @Description
 */
public class HelloNative {

    static {
        System.load("/Users/mine/ownenv/java-mine/src/main/java/libHelloNative.so");
    }

    public static native void greeting();

    public static void main(String[] args) {
        greeting();
    }

}
