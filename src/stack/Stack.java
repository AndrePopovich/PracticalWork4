package stack;

public interface Stack<T> {
  void push(T item);
  T pop();
  T back();
  int size();
  void clear();
  void exit();

}
