package com.andre.deq;

public interface Deq<T> {

  void push_front(T item);

  void push_back(T item);

  T pop_front();

  T pop_back();

  T front();

  T back();

  int size();

  void clear();

  void exit();

  boolean isEmpty();

}
