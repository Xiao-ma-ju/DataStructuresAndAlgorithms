package Class02;

/**
 * @PROJECT_NAME: DataStructuresAndAlgorithms
 * @DESCRIPTION: 基于数组实现的顺序栈
 * @USER: CodeDeer
 * @DATE: 2022/11/1 14:52
 */
public class ArrayStack {
    private String[] items;
    private int count; // 栈中元素的个数
    private int n; // 栈的大小

    public ArrayStack(int n) {
        this.items = new String[n];
        this.count = 0;
        this.n = n;
    }

    /**
     * 入栈方法
     * @param item 要入栈的数据
     * @return 是否入栈成功
     */
    public boolean push(String item) {
        if (count == n) {
            items = simplePush(items, n);
        }
        // 将item放到下标为count的位置，并且count++
        items[count] = item;
        ++count;
        return true;
    }

    /**
     * 出栈方法
     * @return 出栈是否成功
     */
    public String pop() {
        if (count == 0)
            return null; // 栈为空，直接返回null
        // 返回洗标为count-1的数组元素，并且栈中元素个数count-1
        String tmp = items[count - 1];
        --count;
        return tmp;
    }

    /**
     * 动态扩容函数
     * @param items 要扩容的栈
     * @param n 原始栈的长度
     * @return 扩容后的栈
     */
    public String[] simplePush(String[] items, int n) {
        String[] temp = new String[n * 2];
        copy(items, temp);
        return temp;
    }

    /**
     * 拷贝函数
     * @param arr1 要拷贝的数组
     * @param arr2 拷贝的数组
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
