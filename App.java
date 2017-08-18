import java.util.Scanner;
import java.lang.Exception;

/**
 * Class representing the TodoApp application.
 * It is the main entry point for this program.
 */
public class App{
    public static void main(String[] args) {
      TodoList lista = new TodoList();
      Scanner scan;
      String choice = "";

      while(!"x".equals(choice)){
          System.out.println("Please specify a command [list, add, mark, archive] or type 'x' to quit: ");
          scan = new Scanner(System.in);
          choice = scan.next();
          if("list".equals(choice)){
              lista.listItems();
          } else if("add".equals(choice)){
              addTask(lista);
          } else if("mark".equals(choice)){
              markTask(lista);
          } else if("archive".equals(choice)){
              lista.archive();
          } else if(!"x".equals(choice)){
              System.out.println("Wrong command entered, try again!");
          }
      }
  }

    public static void addTask(TodoList lista){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter task you want to provide: ");
        String name = scan.nextLine();
        lista.addItem(name);
    }

    public static void markTask(TodoList lista){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter index of task you want to mark: ");
        try{
            Integer index = scan.nextInt();
            lista.mark(index);
        } catch(Exception e){
            System.out.println("Wrong index entered");
        }

    }

}
