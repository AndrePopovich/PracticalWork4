package ui;

import static ui.Colors.CYAN;
import static ui.Colors.GREEN;
import static ui.Colors.PURPLE;
import static ui.Colors.RED;
import static ui.Colors.YELLOW;

import java.util.Scanner;
import stack.SecurityStack;

public class Menu {

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
        break;
      case "3":
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
    SecurityStack<Integer> stack = new SecurityStack<>();
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
    menu();
  }
}
