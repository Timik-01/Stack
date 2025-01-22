/**
 * Exception thrown when attempting to push to a full stack.
 * @author Timothy Goll
 * @version 2025.01.15
 */
 
public class StackFullException extends Exception {

    public StackFullException(String m) {
        super(m);
    }
}