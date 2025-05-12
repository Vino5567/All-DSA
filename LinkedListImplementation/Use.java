package LinkedListImplementation;

public class Use {
    public static void main(String[] args) {
        LinkedListI list = new LinkedListI();

        list.insert(10);
        list.insert(20);
        list.insert(30);

//        list.insertAtStart(5);
//
//        list.insertAt(3, 25);
//
//        list.insertAt(0, 1);

        list.deleteAt(1);

        list.show();

    }
}
