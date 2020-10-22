/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-10-22
 * Time:21:01
 **/
public class TestHeapP {

    public void adjustUp(int[] array,int size,int index){
        while(true){
            //判断当前节点是不是根节点，如果是根节点，直接退出
            if (index == 0){
                break;
            }
            //找到父节点
            int parentIndex = (index-1)/2;
            //如果父节点的值本来就小于index位置的值，那么直接break,邹泽交换父节点和index位置的值
            if (array[parentIndex] < array[index]){
                break;
            }
            int tmp = array[parentIndex];
            array[parentIndex] = array[index];
            array[index] = tmp;

            //将当前parentIndex赋值给index继续循环
            index = parentIndex;
        }

    }
    public void createHeap(int[] array,int size){
        //lastIndex表示最后一个叶子节点
        int lastIndex = size-1;
        //lastParentIndex表示最后一个叶子节点的父节点
        int lastParentIndex = (size-1-1)/2;
        for (int i = lastParentIndex; i >= 0 ; i--) {
            adjustUp(array,size,i);
        }
    }

}
