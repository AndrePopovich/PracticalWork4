package stack;

public interface Stack<T> {
  void push(T item);
  void pop();
  T back();
  int size();
  void clear();
  void exit();

}
