public class BreakContinueExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;  // пропускаем чётные числа
            }
            if (i > 5) {
                break;     // прерываем цикл, если число больше 5
            }
            System.out.println("Обработано: " + i);
        }
    }
}
