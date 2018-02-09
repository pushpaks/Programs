package my.learning.stacks;

public class BalancedParanthesis {
  public class Stack {
    int top = -1;
    char[] items = new char[100];

    // public boolean isFull() {
    // if (top == 99) {
    // return true;
    // } else {
    // return false;
    // }
    // }

    public boolean isEmpty() {
      if (top == -1) {
        return true;
      } else {
        return false;
      }
    }

    public void push(char x) {
      if (top == 99) {
        System.out.println("Stack full");
      } else {
        items[++top] = x;
      }
    }

    public char pop() {
      char element = 0;
      if (isEmpty()) {
        System.out.println("Stack underFlow");
      } else {
        element = items[top];
        top--;

      }
      return element;
    }

  }

  public boolean isBalanced(char ch1, char ch2) {

    if (ch1 == '{' && ch2 == '}')
      return true;
    else if (ch1 == '(' && ch2 == ')')
      return true;
    else if (ch1 == '[' && ch2 == ']')
      return true;
    else
      return false;
  }

  public boolean validParan(char[] charArray) {
    Stack stk = new Stack();
    

    for (int i = 0; i < charArray.length; i++) {
      if (charArray[i] == '{' || charArray[i] == '(' || charArray[i] == '[' )
      stk.push(charArray[i]);
      if (charArray[i] == '}' || charArray[i] == ')' || charArray[i] == ']') {
        if (stk.isEmpty()) {
          return false;
        } else if (!isBalanced(stk.pop(), charArray[i])) {

          return false;
        }
      }

    }

    if (stk.isEmpty())
    {
      return true;
    } else {
      return false;
    }
  }

  public static void main(String[] args) {
    char[] str = {'{'};
    BalancedParanthesis bp = new BalancedParanthesis();
    System.out.println(bp.validParan(str));

  }

}
