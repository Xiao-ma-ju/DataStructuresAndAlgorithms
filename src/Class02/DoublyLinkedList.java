package Class02;

/**
 * @PROJECT_NAME: DataStructuresAndAlgorithms
 * @DESCRIPTION: 双向链表
 * @USER: CodeDeer
 * @DATE: 2022/11/1 14:42
 */
public class DoublyLinkedList {
    /**
     * 创建链表节点
     */
    public class Node {
        public Node prev;
        public int data;
        public Node next;
    }

    // 头结点
    private Node head = null;

    public void remove(int value) {
        Node q = head;
        while (q.next != null && q.data != value) {
            q = q.next;
        }
        if (q != null) { // 找到了值等于value节点
            if (q.prev == null) { // q是头结点
                head = q.next;
            } else {
                q.prev.next = q.next;
            }
        }
    }

    /**
     * 双向链表删除节点PNode
     * @param qNode 要删除的节点
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
