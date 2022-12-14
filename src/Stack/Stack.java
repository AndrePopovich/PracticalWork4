package Stack;

import java.util.ArrayList;

public interface Stack<T> {
  void push(T item);
  void pop();
  T back();
  ArrayList<T> size();
  void clear(ArrayList<T> list);
  void exit();

}
