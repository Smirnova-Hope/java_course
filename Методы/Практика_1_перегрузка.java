class Calculator {
    
    // перегруженный метод для двух целых чисел
    int add(int a, int b) {
        return a + b;
    }
    
    // другой тип параметров (double)
    double add(double a, double b) {
        return a + b;
    }
    
    //другое количество параметров
    int add(int a, int b, int c) {
        return a + b + c;
    }
    
    // можно менять порядок параметров разного типа
    String concat(String str, int num) {
        return str + num;
    }
    
    String concat(int num, String str) {
        return num + str;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(2, 3));          // 5
        System.out.println(calc.add(2.5, 3.7));      // 6.2
        System.out.println(calc.add(1, 2, 3));       // 6
        System.out.println(calc.concat("X", 100));   // X100
        System.out.println(calc.concat(200, "Y"));   // 200Y
    }
}
