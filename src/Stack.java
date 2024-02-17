public class Stack<T> {
    private MyLinkedList<T> stack = new MyLinkedList<>();

    public boolean isEmpty() {
        return stack.size() == 0;
    }

    public void push(T data) {
        stack.add(data);
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Empty");
        }
        T data = stack.get(stack.size());
        stack.delete(stack.size());

        return data;
    }
}
