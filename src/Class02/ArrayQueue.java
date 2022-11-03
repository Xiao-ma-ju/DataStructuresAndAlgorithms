package Class02;

/**
 * @PROJECT_NAME: DataStructuresAndAlgorithms
 * @DESCRIPTION: �������
 * @USER: CodeDeer
 * @DATE: 2022/11/1 18:21
 */
public class ArrayQueue {
    private String[] items;
    private int n = 0;
    private int head = 0; // ��ͷ�±�
    private int tail = 0; // ��β�±�

    /**
     * ��������
     *
     * @param capacity ���еĳ���
     */
    public ArrayQueue(int capacity) {
        items = new String[capacity];
        n = capacity;
    }

//    /**
//     * ��ӷ���
//     * @param item Ҫ��ӵ�����
//     * @return �Ƿ���ӳɹ�
//     */
//    public boolean enqueue(String item) {
//        if (tail == n) return false; // �� tail== nʱ����ʾ��������
//        items[tail] = item;
//        ++tail;
//        return true;
//    }

    /**
     * �Ż���ӷ������� tail ָ���βʱ����� head ���ڶ�ͷ��������Ǩ��
     *
     * @param item Ҫ��ӵ�����
     * @return �Ƿ���ӳɹ�
     */
    public boolean enqueue(String item) {
        if (tail == n) { // ���������Ѿ�����β��
            if (head == 0) return false; // �������ˣ����ܲ���
            for (int i = head; i < tail; i++) { // ���ݰ���
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
     * ���ӷ���
     *
     * @return ���س��ӵ�����
     */
    public String dequeue() {
        if (head == tail) return null; // head == tail ��ʾ����Ϊ��
        String ret = items[head];
        ++head;
        return ret;
    }
}
