/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-10-22
 * Time:20:42
 **/
public class TestHeap {
    //index 表示要调整的位置
    //size表示数组的长度
    public void adjustDown(int[] array,int size,int index){
        while (true) {
            //leftChild表示最后一个叶子节点
            int leftChild = index * 2 + 1;
            //判断index的叶子节点是否存在，不存在直接return
            if (leftChild >= size) {
                return;
            }
            //假设当前的叶子节点位置处的值最小
            int minIndex = leftChild;
            int rightChild = leftChild + 1;
            //判断右子树节点是否存在，并且判断右子树的值是否小于左子树的值
            if (rightChild < size && array[rightChild] < array[leftChild]) {
                minIndex = rightChild;
            }
            //判断minIndex处的值和index处的值得大小，如果index位置的值更小，则break;否则交换两处的值
            if (array[index] <= array[minIndex]) {
                break;
            }
            int tmp = array[index];
            array[index] = array[minIndex];
            array[minIndex] = tmp;
            //将minIndex赋值给index继续循环
            index = minIndex;
        }
    }
    public void createHeap(int[] array,int size){
        //lastIndex表示最后一个叶子节点
        int lastIndex = size-1;
        //lastParentIndex表示最后一个叶子节点的父节点
        int lastParentIndex = (size-1-1)/2;
        for (int i = lastParentIndex; i >= 0 ; i--) {
            adjustDown(array,size,i);
        }
    }
}
