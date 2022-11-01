package Class02;

/**
 * @PROJECT_NAME: DataStructuresAndAlgorithms
 * @DESCRIPTION: ��������ʵ�ֵ�˳��ջ
 * @USER: CodeDeer
 * @DATE: 2022/11/1 14:52
 */
public class ArrayStack {
    private String[] items;
    private int count; // ջ��Ԫ�صĸ���
    private int n; // ջ�Ĵ�С

    public ArrayStack(int n) {
        this.items = new String[n];
        this.count = 0;
        this.n = n;
    }

    /**
     * ��ջ����
     * @param item Ҫ��ջ������
     * @return �Ƿ���ջ�ɹ�
     */
    public boolean push(String item) {
        if (count == n) {
            items = simplePush(items, n);
        }
        // ��item�ŵ��±�Ϊcount��λ�ã�����count++
        items[count] = item;
        ++count;
        return true;
    }

    /**
     * ��ջ����
     * @return ��ջ�Ƿ�ɹ�
     */
    public String pop() {
        if (count == 0)
            return null; // ջΪ�գ�ֱ�ӷ���null
        // ����ϴ��Ϊcount-1������Ԫ�أ�����ջ��Ԫ�ظ���count-1
        String tmp = items[count - 1];
        --count;
        return tmp;
    }

    /**
     * ��̬���ݺ���
     * @param items Ҫ���ݵ�ջ
     * @param n ԭʼջ�ĳ���
     * @return ���ݺ��ջ
     */
    public String[] simplePush(String[] items, int n) {
        String[] temp = new String[n * 2];
        copy(items, temp);
        return temp;
    }

    /**
     * ��������
     * @param arr1 Ҫ����������
     * @param arr2 ����������
     */
    public void copy(String[] arr1, String[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
    }

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");
        stack.push("5");
        stack.push("6");
        stack.push("7");
        stack.push("8");
        stack.push("9");
        stack.push("10");

        while (true) {
            String temp = stack.pop();
            if (temp != null) {
                System.out.println(temp);
            }
        }
    }
}
