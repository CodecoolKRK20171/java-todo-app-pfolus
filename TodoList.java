import java.util.LinkedList;
import java.util.Collections;
import java.util.ArrayList;


/**
 * Class representing a todo list.
 * TodoList object should aggregate TodoItem objects.
 */
public class TodoList{
    static LinkedList<TodoItem> lista = new LinkedList<TodoItem>();

    public static void addItem(String name){
        lista.add(new TodoItem(name));
    }

    public static void listItems(){
        int i = 0;
        for(TodoItem item : lista){
            System.out.println(i + "." + item.toString());
            i++;
        }
    }

    public static void archive(){
        ArrayList<Integer> indices = new ArrayList<Integer>();
        Integer index = 0;
        for(TodoItem item : lista){
            if(item.isDone == true){
                indices.add(index);
            }
                index++;
        }
        Collections.sort(indices);
        Collections.reverse(indices);
        for(Integer i : indices){
            lista.remove(lista.get(i));
        }
    }

    public static void mark(Integer index){
        Integer iterator = 0;
        for(TodoItem item : lista){
            if(iterator == index){
                item.mark();
            }
            iterator++;
        }
    }

}
