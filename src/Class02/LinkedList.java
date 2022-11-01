package Class02;

/**
 * @PROJECT_NAME: DataStructuresAndAlgorithms
 * @DESCRIPTION: 链表数据结构
 * @USER: CodeDeer
 * @DATE: 2022/11/1 14:46
 */
public class LinkedList {
    /**
     * 链表节点
     */
    public class Node {
        public int data; // 假设节点中存储的是int类型的数据
        public Node next;
    }

    // 头结点
    private Node head = null;

    /**
     * 链表查询方法
     * @param value 要查询的值
     * @return 返回节点
     */
    public Node find(int value) {
        Node p = head;
        while (p != null && p.data != value) {
            p = p.next;
        }
        return p;
    }

    /**
     * 插入新节点方法
     * @param b 在这个节点后插入新节点
     * @param x 要插入的新节点
     */
    void insert(Node b, Node x) { // 在节点b之后插入节点x
        if (b.next == null) { // 判断节点b是不是尾结点
            b.next = x;
        } else {
            x.next = b.next;
            b.next = x;
        }
    }

    /**
     * 在已知前驱节点的情况下，删除后一个节点
     * @param a 前驱结点
     * @param b 要删除的节点
     */
    void remove(Node a, Node b) { // 删除节点b（在已知前驱节点a的情况下）
        if (a.next == null) { // 待删除的节点b是头结点
            head = b.next;
        } else {
            a.next = b.next; // 或 a.next = a.next.next;
        }
    }

    /**
     * 在不知道前驱节点的情况下删除节点
     * @param value 要删除的节点
     */
    void remove(int value) {
        Node q = head;
        Node p = null; // q的前驱节点
        while (q.next != null && q.data == value) {
            p = q;
            q = q.next;
        }
        if (q != null) { // 找到了相等的元素的节点
            if (p == null) { // q是头结点
                head = q.next;
            } else {
                p.next = q.next;
            }
        }
    }

    /**
     * 删除节点q的方法
     * @param q 要删除的节点
     */
    void remove(Node q) {
        if (q == null) {
            return;
        }
        if (head == q) {
            head = q.next;
            return;
        }
        Node p = head;
        while (p.next != null && p.next != q) {
            p = p.next;
        }
        if (p.next == q) {
            p.next = q.next;
        }
    }

    /**
     * 访问数据
     * @param k 要访问的下标
     * @return 返回该下标所在的节点
     */
    public Node get(int k) {
        Node p = head;
        int i = 0;
        while (p.next != null && i != k) {
            i++;
            p = p.next;
        }
        return p;
    }
}
