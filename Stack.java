/**
 * This class represents a generic Stack implementation.
 * 
 * @Timothy Goll
 * @version 2025.01.15
 */
public class Stack<T> {
    private T[] array;
    int top;
    int size;

    public Stack(int size) {
        this.array = ((T[]) new Object[size]);
        this.top = -1;
        this.size = array.length;

    }

    public void push(T para) throws StackFullException {
        if (top == size - 1) {
            throw new StackFullException("Stack ist voll!");
        } else {
            top++;
            array[top] = para;
        }
    }

    public T pop() throws StackEmptyException {
        if (top == -1) {
            throw new StackEmptyException("Stack ist leer!");
        } else {
            return array[top - 1] = null;
        }
    }

    public T peek() {
        return array[top];
    }

    public String list() {
        String tmp = "";
        for (int i = 0; i < size; i++) {
            if (array[i] != null) {
                tmp += array[i] + ";";
            }
        }
        return tmp;
    }
}
