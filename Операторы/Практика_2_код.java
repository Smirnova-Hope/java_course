// пример 1, проверка типа массива
int[] numbers = new int[5];
String[] words = new String[10];

System.out.println(numbers instanceof int[]);   // true
System.out.println(words instanceof String[]); // true
System.out.println(numbers instanceof Object); // true (массивы наследуют Object)

// пример 2, проверка реализации интерфейса
interface Drawable {}
class Circle implements Drawable {}

Drawable shape = new Circle();
System.out.println(shape instanceof Circle);    // true
System.out.println(shape instanceof Drawable);  // true
System.out.println(shape instanceof String);    // false

// пример 3, с null
String str = null;
System.out.println(str instanceof String);  // false
System.out.println(str instanceof Object);  // false
System.out.println(str instanceof List);    // false

// Даже для интерфейса или абстрактного класса
Number num = null;
System.out.println(num instanceof Integer); // false
