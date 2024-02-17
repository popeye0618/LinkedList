import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyLinkedList <T> implements Iterable<T>{

    private Node<T> head;
    private Node<T> tail;
    private int size = 0;

    public MyLinkedList() {
        head = null;
        tail = null;
    }

    public int size() {
        return size;
    }

    public void add(T input) {
        Node<T> newNode = new Node<>(input);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public T get(int i) {
        int index = i - 1;
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node<T> current = head;
        for(int j = 0; j < index; j++) {
            current = current.next;
        }
        return current.data;
    }

    public void delete(int i) {
        int index = i - 1;
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            head = head.next;
            if (head == null) {
                tail = null;
            }
        } else {
            Node<T> current = head;
            for(int j = 0; j < index - 1; j++) {
                current = current.next;
            }
            current.next = current.next.next;
            if (current.next == null) {
                tail = current;
            }
        }
        size--;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Node<T> current = head;
            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                T data = current.data;
                current = current.next;
                return data;
            }
        };
    }
}

class Node <T> {
    public Node<T> next = null;
    public T data;

    public Node(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return String.valueOf(this.data);
    }
}
