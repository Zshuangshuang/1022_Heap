import java.util.Arrays;

/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-10-22
 * Time:20:54
 **/
public class Test {

    public static void main(String[] args) {
        int[] array = {2,4,1,5,7,8};
        TestHeapP testHeap = new TestHeapP();
        testHeap.createHeap(array,array.length);
        System.out.println(Arrays.toString(array));
    }
}
