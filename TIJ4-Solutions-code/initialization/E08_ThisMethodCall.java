//: initialization/E08_ThisMethodCall.java
/****************** Exercise 8 *****************
 * Create a class with two methods. Within the
 * first method call the second method twice to
 * see it work, the first time without using this,
 * and the second time using this.
 * (You should not use this form in practice.)
 ***********************************************/
package initialization;

public class E08_ThisMethodCall {
  public void a() {
    b();
    //new E08_ThisMethodCall().b();
    this.b();
  }
  static void b() {
    System.out.println("b() called");
  }
  public static void main(String args[]) {
    new E08_ThisMethodCall().a();
    //a();
    b();
  }
} /* Output:
b() called
b() called
*///:~
