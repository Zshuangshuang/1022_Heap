/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-10-22
 * Time:21:10
 **/
public class MyPriorityQueue {

    public int[] array = new int[100];
    public int size = 0;


    public void adjustUp(int[] array,int size,int index){
        while(true){
            if (index == 0){
                break;
            }
            int parentIndex = (index-1)/2;
            if (array[parentIndex] < array[index]){
                break;
            }
            int tmp = array[parentIndex];
            array[parentIndex] = array[index];
            array[index] = tmp;

            index = parentIndex;
        }
    }
    public void offer(int x){
        array[size] = x;
        size++;
        adjustUp(array,array.length,size-1);
    }
    public void adjustDown(int[] array,int size,int index){
        while (true){
            int leftChild = index*2+1;
            if (leftChild >= size){
                return;
            }
            int minIndex = leftChild;
            int rightChild = leftChild+1;
            if (rightChild < size && array[rightChild] < array[minIndex]){
                minIndex = rightChild;
            }
            if (array[index] < array[minIndex]){
                break;
            }
            int tmp = array[minIndex];
            array[minIndex] = array[index];
            array[index] = tmp;

            index = minIndex;
        }
    }
    public Integer poll(){
        if (size == 0){
            return null;
        }
        int ret = array[0];
        array[0] = array[size-1];
        size--;
        adjustDown(array,size,0);
        return ret;
    }

    public Integer peek(){
        if (size == 0){
            return null;
        }
        return array[0];
    }

    public boolean isEmpty(){
        return size == 0;
    }
}
