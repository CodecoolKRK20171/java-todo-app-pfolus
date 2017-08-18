

/**
 * Class representing a single todo item.
 *
 */
public class TodoItem{
    boolean isDone;
    String name;

    public TodoItem(String name){
        this.name = name;
        isDone = false;
    }

    public void mark(){
        this.isDone = true;
    }

    public void Unmark(){
        this.isDone = false;
    }
    public String toString(){
        String sign = "[ ]";
        if(isDone == true){
            sign = "[x]";
        }
        return sign + " " + name;
    }

}
