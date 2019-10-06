/**
An XOR linked list is a more memory efficient doubly linked list.
 Instead of each node holding next and prev fields, it holds a field named both, which is an XOR of the next node and the previous node. 
 Implement an XOR linked list; it has an add(element) which adds the element to the end, and a get(index) which returns the node at index.
 */
public class DoublyLinkedList<T>{
    public class Node<T>{
        Node<T> prev;
        Node<T> next;
        Node<T> both;
        T element;
        public Node(T element){
            this.element = element;
            this.prev = null;
            this.next = null;
            this.both = null;
        }
    }
    public static void main(String [] args){
        DoublyLinkedList<Integer> list = new DoublyLinkedList();
        list.add(5);
    }
        Node head;
    public DoublyLinkedList(){
        this.head = null;
    }
    public void add(T element){
        Node n = new Node(element);
        if(head == null){ //head.prev.element is null so can't XOR
            head = n;
            head.both.element = (head.prev.element) ^ (head.next.element);
            return;
        }
        else{
            Node tmp = head;
            while(tmp.next != null){
                tmp = tmp.next;
            }
            tmp.next = n;
            n.prev = tmp;
            n.both.element = (n.prev.element) ^ (n.next.element);
        }

    }
    public Node<T> get(int index){
        if(head == null){
            return null;
        }
        if(index == 0) return head;
        int count = 0;
        Node tmp = head;
        while(tmp.next != null && count < index){
            if(count + 1 == index){
                return tmp.next;
            }
            tmp = tmp.next;
        }
        return null;
    }
    
}