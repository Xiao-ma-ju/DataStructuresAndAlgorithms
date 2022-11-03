package Class02;

/**
 * @PROJECT_NAME: DataStructuresAndAlgorithms
 * @DESCRIPTION: 数组队列
 * @USER: CodeDeer
 * @DATE: 2022/11/1 18:21
 */
public class ArrayQueue {
    private String[] items;
    private int n = 0;
    private int head = 0; // 队头下标
    private int tail = 0; // 队尾下标

    /**
     * 创建队列
     *
     * @param capacity 队列的长度
     */
    public ArrayQueue(int capacity) {
        items = new String[capacity];
        n = capacity;
    }

//    /**
//     * 入队方法
//     * @param item 要入队的数据
//     * @return 是否入队成功
//     */
//    public boolean enqueue(String item) {
//        if (tail == n) return false; // 当 tail== n时，表示队列满了
//        items[tail] = item;
//        ++tail;
//        return true;
//    }

    /**
     * 优化入队方法，当 tail 指向队尾时，如果 head 不在队头，则将数据迁移
     *
     * @param item 要入队的数据
     * @return 是否入队成功
     */
    public boolean enqueue(String item) {
        if (tail == n) { // 插入数据已经到队尾了
            if (head == 0) return false; // 队列满了，不能插入
            for (int i = head; i < tail; i++) { // 数据搬移
                items[i - head] = items[i];
            }
            tail -= head;
            head = 0;
        }
        items[tail] = item;
        tail++;
        return true;
    }

    /**
     * 出队方法
     *
     * @return 返回出队的数据
     */
    public String dequeue() {
        if (head == tail) return null; // head == tail 表示队列为空
        String ret = items[head];
        ++head;
        return ret;
    }
}
