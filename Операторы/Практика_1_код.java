// 1. Конкатенация строк +, +=
String empty = "";
String hello = "Hello, ";
String world = "World!";

// Оператор +
String greeting = hello + world; // "Hello, World!"
String mix = "Число: " + 42;     // "Число: 42"

// Оператор +=
String phrase = "Я пишу на";
phrase += " Java";               // "Я пишу на Java"

// 2. Операторы присваивания и арифметические
int a = 10;       // 
a += 5;           // То же, что и a = a + 5;  (a = 15)
a -= 3;           // a=12)
a *= 2;           // a=24)
a /= 4;           // a=6
a %= 4;           // a=2

// 3. Тернарный оператор
int x = 10;
int y = 20;
// Если x < y, вернется x, иначе y
int min = (x < y) ? x : y; // min станет равен 10
String status = (x > 0) ? "Положительное" : "Отрицательное"; 

// 4. Логические операторы (||, &&)
boolean isTrue = true;
boolean isFalse = false;
// Логическое или
boolean resultOr = isTrue || intent(); 
// Логическое и
boolean resultAnd = isFalse && intent(); // false 

// 5. Побитовые и логические операторы
// базовый тип boolean
boolean a = true;
boolean b = false;
boolean test1 = a | b;  
boolean test2 = a & b;  
boolean test3 = a ^ b;   
// тип int 
int num1 = 0b1010; 
int num2 = 0b1100; 
int bitOr  = num1 | num2; // числа в десятичной
int bitAnd = num1 & num2; 
int bitXor = num1 ^ num2; 

// 6. Операторы равенства
// С базовыми типами и литералами
int n1 = 5;
boolean eq1 = (n1 == 5);   // true
boolean eq2 = (n1 != 10);  // true
// С типом String, сравнение ссылок
String s1 = "cat";
String s2 = "cat"; 
String s3 = new String("cat");
boolean res1 = (s1 == s2); // true (указывают на один объект в пуле строк)
boolean res2 = (s1 == s3); // false
boolean res3 = (s1 != s3); // true

// 7.Операторы сравнения
int age = 18;
boolean canVote = (age >= 18); // true
boolean isChild = (age < 12);  // false

// 8.Операторы сдвига
int val = 8; 
int left = val << 2;   // Сдвиг влево на 2 бита
int right = val >> 2;
int negative = -8;
int unsignedRight = negative >>> 2; // Беззнаковый сдвиг вправо

// 9.Арифметические операторы
int sum  = 10 + 5; // 15
int diff = 10 - 5; // 5
int prod = 10 * 5; // 50
int quot = 10 / 3; // 3 
int rem  = 10 % 3; // 1
double exactQuot = 10.0 / 3.0; // 3.3333333333333335

// 10. Унарные операторы
// Префиксный инкремент
int p = 5;
int resultPrefix = ++p; 
// Сначала p увеличилось до 6, потом присвоилось. 
// Итог: p = 6, resultPrefix = 6

// Постфиксный инкремент
int q = 5;
int resultPostfix = q++;  // Итог: q = 6, resultPostfix = 5
// Аналогично для декремента (--)
int m = 10;
--m; // m стало 9 (префиксный)
m--; // m стало 8 (постфиксный)

// 11.Скобки
// ( ) для изменения приоритета
int noBrackets = 2 + 3 * 4;   // 14 так как у * приоритет выше
int withBrackets = (2 + 3) * 4; // 20 сначала выполнится сложение

// [ ] для массивов (базового типа)
int[] numbers = {10, 20, 30};
int firstNumber = numbers[0]; 
