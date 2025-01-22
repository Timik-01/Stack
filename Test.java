/**
 * Class to test the functionality of the Stack class.
 * @author Timothy Goll
 * @version 2025.01.15
 */
public class Test {
  public static void main(String[] args) {
    try {
      // Test for String 
      Stack<String> stringify = new Stack<>(3);
      stringify.push("Hello");
      stringify.push("HI");
      System.out.println(stringify.peek().toString());
      System.out.println(stringify.list());
      stringify.pop();
      stringify.pop();
      System.out.println(stringify.list());
    } catch (Exception e) {
      System.out.println("String " + e.getMessage());
    }
    try {
      // Test for int
      Stack<Integer> integerifiy = new Stack<>(2);
      integerifiy.push(2);
      integerifiy.push(4);
      System.out.println(integerifiy.peek().toString());
      System.out.println(integerifiy.list());

      integerifiy.pop();
      integerifiy.pop();
      System.out.println(integerifiy.peek().toString());
      System.out.println(integerifiy.list());
    } catch (Exception ex) {
      System.out.println("Number " + ex.getMessage());
    }
  }
}
