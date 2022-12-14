package Stack;


import java.util.ArrayList;
import java.util.List;

public class SecurityStack<T> implements Stack<T>{
  ArrayList<T> list = new ArrayList<>();

  @Override
  public void push(T item) {
    list.add(item);
  }

  @Override
  public void pop() {
    if(list.size() == 0){
      System.out.println("Стек пустий!!!");
    }
    else {
      int index = list.size();
      list.remove(index);
    }
  }

  @Override
  public T back() {
    return null;
  }

  @Override
  public ArrayList<T> size() {
    return null;
  }

  @Override
  public void clear(ArrayList<T> list) {

  }

  @Override
  public void exit() {

  }
}
