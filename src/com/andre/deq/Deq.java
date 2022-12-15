package com.andre.deq;

public interface Deq<T> {

  void pushFront(T item);

  void pushBack(T item);

  T popFront();

  T popBack();

  T front();

  T back();

  int size();

  void clear();

  void exit();

  boolean isEmpty();

}
