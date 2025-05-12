package LinkedListImplementation;

public class LinkedListI {

    NodeI head;  // create a head node while the LL declare

    public void insert(int data){
        NodeI node = new NodeI(); // while insert a new data, create a new note and store the data and reference to null,
        node.data = data;
        node.next = null;

        if(head == null){
            head = node; // if head node is empty then put the created node in head,otherwise
        }else{
            NodeI n = head; // place head on n to traverse
            while(n.next != null){  // find the last index
                n = n.next;  // here we do increment opration in this format
            }
            n.next = node; // and put the inserted node here
        }
    }

    public void insertAtStart(int data){
        NodeI node = new NodeI();
        node.data = data;
//        node.next = null;

        node.next = head;
        head = node;
    }
    
    public void insertAt(int index, int data){
        NodeI node = new NodeI();
        node.data = data;
//        node.next = null;

        if(index == 0){
            insertAtStart(data);
        }else {
            NodeI n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }

    }

    public void deleteAt(int index){

        if(index == 0){
            head = head.next;
        }else{
            NodeI n = head;
            NodeI n1 = null;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
//            n1 = n.next;
//            n.next = n1.next;
//            n1 = null;
            n.next = n.next.next;
        }
    }

    public void show(){
        NodeI n = head;
        while (n.next != null){
            System.out.println(n.data);
            n = n.next;
        }
        System.out.println(n.data);
    }

}
