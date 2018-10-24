public class UseBoth {
  public void doOtherThing() {
    Parent p1 = new Parent();
    Parent p2 = new Child(); // illegal
    p1.doSomething();
    p2.doSomething();
  }
}
