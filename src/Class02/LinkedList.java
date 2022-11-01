package Class02;

/**
 * @PROJECT_NAME: DataStructuresAndAlgorithms
 * @DESCRIPTION: �������ݽṹ
 * @USER: CodeDeer
 * @DATE: 2022/11/1 14:46
 */
public class LinkedList {
    /**
     * ����ڵ�
     */
    public class Node {
        public int data; // ����ڵ��д洢����int���͵�����
        public Node next;
    }

    // ͷ���
    private Node head = null;

    /**
     * �����ѯ����
     * @param value Ҫ��ѯ��ֵ
     * @return ���ؽڵ�
     */
    public Node find(int value) {
        Node p = head;
        while (p != null && p.data != value) {
            p = p.next;
        }
        return p;
    }

    /**
     * �����½ڵ㷽��
     * @param b ������ڵ������½ڵ�
     * @param x Ҫ������½ڵ�
     */
    void insert(Node b, Node x) { // �ڽڵ�b֮�����ڵ�x
        if (b.next == null) { // �жϽڵ�b�ǲ���β���
            b.next = x;
        } else {
            x.next = b.next;
            b.next = x;
        }
    }

    /**
     * ����֪ǰ���ڵ������£�ɾ����һ���ڵ�
     * @param a ǰ�����
     * @param b Ҫɾ���Ľڵ�
     */
    void remove(Node a, Node b) { // ɾ���ڵ�b������֪ǰ���ڵ�a������£�
        if (a.next == null) { // ��ɾ���Ľڵ�b��ͷ���
            head = b.next;
        } else {
            a.next = b.next; // �� a.next = a.next.next;
        }
    }

    /**
     * �ڲ�֪��ǰ���ڵ�������ɾ���ڵ�
     * @param value Ҫɾ���Ľڵ�
     */
    void remove(int value) {
        Node q = head;
        Node p = null; // q��ǰ���ڵ�
        while (q.next != null && q.data == value) {
            p = q;
            q = q.next;
        }
        if (q != null) { // �ҵ�����ȵ�Ԫ�صĽڵ�
            if (p == null) { // q��ͷ���
                head = q.next;
            } else {
                p.next = q.next;
            }
        }
    }

    /**
     * ɾ���ڵ�q�ķ���
     * @param q Ҫɾ���Ľڵ�
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
     * ��������
     * @param k Ҫ���ʵ��±�
     * @return ���ظ��±����ڵĽڵ�
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
