package stack;


import java.util.ArrayList;

public class SecurityStack<T> implements Stack<T> {

  ArrayList<T> list = new ArrayList<>();

  @Override
  public void push(T item) {
    list.add(item);
    System.out.println("ok");
  }

  @Override
  public void pop() {
    if (list.isEmpty()) {
      System.out.println("error");
    } else {
      int index = list.size() - 1;
      list.remove(index);
    }
  }

  @Override
  public T back() {
    if (list.isEmpty()) {
      System.out.println("error");
      return null;
    } else {
      int index = list.size() - 1;
      return list.get(index);
    }
  }

  @Override
  public int size() {
    return list.size();
  }

  @Override
  public void clear() {
    list.clear();
    System.out.println("ok");
  }

  @Override
  public void exit() {
    System.out.println("bye");
    System.exit(0);
  }
}
