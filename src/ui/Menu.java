package ui;

import java.util.Scanner;

public class Menu {
  private Scanner s = new Scanner(System.in);
  private String select;

  public void menu(){
    System.out.println("***** Головне меню *****");
    System.out.println("1. Стек із захистом від помилок");
    System.out.println("2. Дек з захистом від помилок");
    System.out.println("3. Черга з захистом від помилок");
    System.out.print("Виберіть структуру даних:");
    select = s.nextLine();
    switch (select){
      case "1":
        break;
      case "2":
        break;
      case "3":
        break;
      default:
        System.out.println("Невірний вибір");
        break;
    }
    menu();
  }

  public void stackData(){
    System.out.println("***** Перелік команд *****");
    System.out.println("1. push");
    System.out.println("2. Дек з захистом від помилок");
    System.out.println("3. Черга з захистом від помилок");
  }
}
