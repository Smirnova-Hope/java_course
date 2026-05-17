//Проверка с использованием unbound wildcard (<?>)
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Object obj = new ArrayList<String>();        
        // ошибка компиляции, так нельзя if (obj instanceof ArrayList<String>) { ... }
        //проверяем принадлежность к ArrayList
        if (obj instanceof ArrayList<?>) {
            System.out.println("Это ArrayList какого-то типа!")     
            // После проверки можно безопасно привести к ArrayList<?>
            ArrayList<?> list = (ArrayList<?>) obj;
        }
    }
}

// Использование Raw Types
public class Box<T> {
    private T content;
}
Object myBox = new Box<Integer>();
if (myBox instanceof Box) {
    System.out.println("Это объект класса Box");
    Box<Integer> castedBox = (Box<Integer>) myBox; 
}

// Pattern Matching для instanceof
public static void processHolder(Object obj) {
    if (obj instanceof Holder<?> holder) {
        System.out.println("Холдер содержит: " + holder.getData());
    }
}
class Holder<T> {
    private T data;
    public T getData() { return data; }
}

