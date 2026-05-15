// Arrays.toString()
import java.util.Arrays;

public class ToStringExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        // Преобразование массива в строку для вывода
        String arrayString = Arrays.toString(numbers);
        System.out.println("Содержимое массива: " + arrayString);
    }
}

// Arrays.binarySearch()
import java.util.Arrays;

public class BinarySearchExample {
    public static void main(String[] args) {
        int[] sortedArray = {2, 5, 8, 12, 16, 23, 38, 56};
        int key = 23;
        
        int index = Arrays.binarySearch(sortedArray, key);
        System.out.println("Индекс элемента " + key + ": " + index); // 5
        
        int missingKey = 99;
        int missingIndex = Arrays.binarySearch(sortedArray, missingKey);
        // Метод возвращает отрицательное значение, если элемент не найден
        System.out.println("Индекс элемента " + missingKey + ": " + missingIndex); // -9
    }
}

// Arrays.equals()
import java.util.Arrays;

public class EqualsExample {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        int[] array3 = {1, 2, 4};

        boolean isEqual12 = Arrays.equals(array1, array2);
        boolean isEqual13 = Arrays.equals(array1, array3);
        
        System.out.println("array1 равен array2? " + isEqual12); // true
        System.out.println("array1 равен array3? " + isEqual13); // false
    }
}

// Arrays.sort()
import java.util.Arrays;

public class SortExample {
    public static void main(String[] args) {
        int[] unsortedArray = {5, 2, 9, 1, 5, 6};
        System.out.println("До сортировки: " + Arrays.toString(unsortedArray));
        
        Arrays.sort(unsortedArray);
        
        System.out.println("После сортировки: " + Arrays.toString(unsortedArray));
        // [1, 2, 5, 5, 6, 9]
    }
}

// Arrays.compare()
import java.util.Arrays;

public class CompareExample {
    public static void main(String[] args) {
        int[] arrayA = {1, 2, 3};
        int[] arrayB = {1, 2, 4};
        int[] arrayC = {1, 2};
        
        int resultA_B = Arrays.compare(arrayA, arrayB);
        int resultA_C = Arrays.compare(arrayA, arrayC);
        
        System.out.println("Сравнение arrayA и arrayB: " + resultA_B); // -1 (arrayA < arrayB)
        System.out.println("Сравнение arrayA и arrayC: " + resultA_C); // 1  (arrayA > arrayC)
    }
}
