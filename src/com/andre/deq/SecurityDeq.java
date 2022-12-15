package com.andre.deq;

import static com.andre.ui.Colors.CYAN;
import static com.andre.ui.Colors.GREEN;
import static com.andre.ui.Colors.RED;

import com.andre.ui.Menu;
import java.util.ArrayList;

public class SecurityDeq<T> implements Deq<T> {
  private ArrayList<T> list = new ArrayList<>();
  @Override
  public void pushFront(T item) {
    list.add(0,item);
    System.out.println(GREEN + "ok");
  }

  @Override
  public void pushBack(T item) {
    list.add(item);
    System.out.println(GREEN + "ok");
  }

  @Override
  public T popFront() {
    if (list.isEmpty()) {
      System.out.println(RED + "error");
      return null;
    } else {
      System.out.println(list.get(0));
      return list.remove(0);
    }
  }

  @Override
  public T popBack() {
    if (list.isEmpty()) {
      System.out.println(RED + "error");
      return null;
    } else {
      int index = list.size();
      System.out.println(list.get(index - 1));
      return list.remove(index - 1);
    }
  }

  @Override
  public T front() {
    if (isEmpty()) {
      System.out.println(RED + "error");
      return null;
    } else {
      System.out.println(list.get(0));
      return list.get(0);
    }
  }

  @Override
  public T back() {
    if (isEmpty()) {
      System.out.println(RED + "error");
      return null;
    } else {
      int index = list.size();
      System.out.println(list.get(index - 1));
      return list.get(index - 1);
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
    Menu menu = new Menu();
    menu.menu();
  }

  @Override
  public boolean isEmpty() {
    return list.isEmpty();
  }
}
