package Class02;

/**
 * @PROJECT_NAME: DataStructuresAndAlgorithms
 * @DESCRIPTION: ˫������
 * @USER: CodeDeer
 * @DATE: 2022/11/1 14:42
 */
public class DoublyLinkedList {
    /**
     * ��������ڵ�
     */
    public class Node {
        public Node prev;
        public int data;
        public Node next;
    }

    // ͷ���
    private Node head = null;

    public void remove(int value) {
        Node q = head;
        while (q.next != null && q.data != value) {
            q = q.next;
        }
        if (q != null) { // �ҵ���ֵ����value�ڵ�
            if (q.prev == null) { // q��ͷ���
                head = q.next;
            } else {
                q.prev.next = q.next;
            }
        }
    }

    /**
     * ˫������ɾ���ڵ�PNode
     * @param qNode Ҫɾ���Ľڵ�
     */
    void remove(Node qNode) {
        if (qNode == null) {
            return;
        }
        if (qNode.prev == null) {
            head = qNode.next;
            return;
        }
        qNode.prev.next = qNode.next;
    }
}
