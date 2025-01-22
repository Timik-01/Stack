/**
 * Exception thrown when attempting to pop or peek from an empty stack.
 * @author Timothy Goll
 * @version 2025.01.15
 */
public class StackEmptyException extends Exception {
 
    public StackEmptyException(String m) {
        super(m);
    }
}