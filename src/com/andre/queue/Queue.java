package com.andre.queue;

public interface Queue<T> {
  void push(T item);
  T pop();
  T front();
  int size();
  void clear();
  void exit();
  boolean isEmpty();


}
