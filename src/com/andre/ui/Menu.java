package com.andre.ui;

import static com.andre.ui.Colors.CYAN;
import static com.andre.ui.Colors.GREEN;
import static com.andre.ui.Colors.PURPLE;
import static com.andre.ui.Colors.RED;
import static com.andre.ui.Colors.YELLOW;

import com.andre.deq.SecurityDeq;
import com.andre.queue.SecurityQueue;
import com.andre.stack.SecurityStack;
import java.util.Scanner;

public class Menu {

  private SecurityStack<Integer> stack = new SecurityStack<>();
  private SecurityDeq<Integer> deq = new SecurityDeq<>();
  private SecurityQueue<Integer> queue = new SecurityQueue<>();
  private Scanner s = new Scanner(System.in);
  private String select;

  public void menu() {
    System.out.println(PURPLE + "\n***** Головне меню *****" + YELLOW);
    System.out.println("1. Стек із захистом від помилок");
    System.out.println("2. Дек з захистом від помилок");
    System.out.println("3. Черга з захистом від помилок");
    System.out.println("4. Вихід з програми");
    System.out.print(CYAN + "Виберіть структуру даних: ");
    select = s.nextLine();
    switch (select) {
      case "1":
        stackData();
        break;
      case "2":
        deqData();
        break;
      case "3":
        queueData();
        break;
      case "4":
        System.out.println(GREEN + "Ви вийшли з програми!!!");
        System.exit(0);
        break;
      default:
        System.out.println(RED + "Невірний вибір");
        break;
    }
    menu();
  }

  public void stackData() {
    System.out.println(PURPLE + "\n***** Перелік команд *****" + YELLOW);
    System.out.println("push");
    System.out.println("pop");
    System.out.println("back");
    System.out.println("size");
    System.out.println("clear");
    System.out.println("exit");
    System.out.print(CYAN + "Введіть одну з запропонованих команд: ");
    select = s.nextLine();
    switch (select) {
      case "push":
        Scanner s2 = new Scanner(System.in);
        System.out.print(CYAN + "Введіть число, яке хочете додати: ");
        int number = s2.nextInt();
        stack.push(number);
        break;
      case "pop":
        stack.pop();
        break;
      case "back":
        stack.back();
        break;
      case "size":
        System.out.println(stack.size());
        break;
      case "clear":
        stack.clear();
        break;
      case "exit":
        stack.exit();
        break;
      default:
        System.out.println(RED + "Невірно введена команда!!!");
        break;
    }
    stackData();
  }
  public void queueData() {
    System.out.println(PURPLE + "\n***** Перелік команд *****" + YELLOW);
    System.out.println("push");
    System.out.println("pop");
    System.out.println("front");
    System.out.println("size");
    System.out.println("clear");
    System.out.println("exit");
    System.out.print(CYAN + "Введіть одну з запропонованих команд: ");
    select = s.nextLine();
    switch (select) {
      case "push":
        Scanner s2 = new Scanner(System.in);
        System.out.print(CYAN + "Введіть число, яке хочете додати: ");
        int number = s2.nextInt();
        queue.push(number);
        break;
      case "pop":
        queue.pop();
        break;
      case "front":
        queue.front();
        break;
      case "size":
        System.out.println(queue.size());
        break;
      case "clear":
        queue.clear();
        break;
      case "exit":
        queue.exit();
        break;
      default:
        System.out.println(RED + "Невірно введена команда!!!");
        break;
    }
    queueData();
  }
  public void deqData(){
    Scanner s2 = new Scanner(System.in);
    int number;
    System.out.println(PURPLE + "\n***** Перелік команд *****" + YELLOW);
    System.out.println("push_front");
    System.out.println("push_back");
    System.out.println("pop_front");
    System.out.println("pop_back");
    System.out.println("front");
    System.out.println("back");
    System.out.println("size");
    System.out.println("clear");
    System.out.println("exit");
    System.out.print(CYAN + "Введіть одну з запропонованих команд: ");
    select = s.nextLine();
    switch (select) {
      case "push_front":
        System.out.print(CYAN + "Введіть число, яке хочете додати: ");
        number = s2.nextInt();
        deq.pushFront(number);
        break;
      case "push_back":
        System.out.print(CYAN + "Введіть число, яке хочете додати: ");
        number = s2.nextInt();
        deq.pushBack(number);
        break;
      case "pop_front":
        deq.popFront();
        break;
      case "pop_back":
        deq.popBack();
        break;
      case "front":
        deq.front();
        break;
      case "back":
        deq.back();
        break;
      case "size":
        System.out.println(deq.size());
        break;
      case "clear":
        deq.clear();
        break;
      case "exit":
        deq.exit();
        break;
      default:
        System.out.println(RED + "Невірно введена команда!!!");
        break;
    }
    deqData();
  }
}
