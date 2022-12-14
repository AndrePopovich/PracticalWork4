package stack;


import static ui.Colors.CYAN;
import static ui.Colors.GREEN;
import static ui.Colors.RED;

import java.util.ArrayList;

public class SecurityStack<T> implements Stack<T> {
  ArrayList<T> list = new ArrayList<>();

  @Override
  public void push(T item) {
    list.add(item);
    System.out.println(GREEN + "ok");
  }

  @Override
  public T pop() {
    if (list.isEmpty()) {
      System.out.println(RED + "error");
      return null;
    } else {
      int index = list.size() - 1;
      System.out.println(list.get(index));
      return list.remove(index);
    }
  }

  @Override
  public T back() {
    if (list.isEmpty()) {
      System.out.println(RED + "error");
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
    System.out.println(GREEN + "ok");
  }

  @Override
  public void exit() {
    System.out.println(CYAN + "bye");
    System.exit(0);
  }
}
