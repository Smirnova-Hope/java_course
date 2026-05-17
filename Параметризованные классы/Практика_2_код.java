// 1) <? extends T>

// метод, который должен посчитать сумму чисел в списке, без маски
public static double sumOfList(List<Number> list) {
    double sum = 0.0;
    for (Number n : list) {
        sum += n.doubleValue();
    }
    return sum;
}
// чтобы метод принимал списки любых чисел, используем <? extends Number>
import java.util.List;

public class Main {
    // метод принимает List, содержащий Number илм его наследников
    public static double sumOfList(List<? extends Number> list) {
        double sum = 0.0;
        for (Number n : list) { 
            sum += n.doubleValue();
        }
        return sum;
    }
    public static void main(String[] args) {
        List<Integer> ints = List.of(1, 2, 3);
        List<Double> doubles = List.of(1.5, 2.5);
      
        System.out.println(sumOfList(ints));     // 6.0
        System.out.println(sumOfList(doubles));  // 4.0
    }
}

// 2) <? super T>
// чтобы метод мог принимать списки типов-родителей, используем <? super Integer>
import java.util.ArrayList;
import java.util.List;

public class Main {
    // метод принимает список Integer или любых его супертипов
    public static void addNumbers(List<? super Integer> list) {
        for (int i = 1; i <= 3; i++) {
            list.add(i); 
        }
    }
    public static void main(String[] args) {
        List<Number> numberList = new ArrayList<>();
        List<Object> objectList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();

        addNumbers(numberList);
        addNumbers(objectList);
        addNumbers(integerList);
    }
}
