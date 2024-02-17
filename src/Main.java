import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();

        myLinkedList.add("a");
        myLinkedList.add("d");
        myLinkedList.add("b");
        myLinkedList.add("c");

        Iterator<String> it1 = myLinkedList.iterator();
        while(it1.hasNext()) {
            String data = it1.next();
            System.out.print(data + " ");
        }

        System.out.println();
        String s = myLinkedList.get(2);
        System.out.println("get " + s);

        myLinkedList.delete(2);
        Iterator<String> it2 = myLinkedList.iterator();
        while (it2.hasNext()) {
            String data = it2.next();
            System.out.print(data + " ");
        }


        System.out.println("\n-----Stack-----");
        Stack<Integer> myStack = new Stack<>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);

        for(int i = 0; !myStack.isEmpty(); i++) {
            System.out.print(myStack.pop() + " ");
        }
        System.out.println();
    }
}