public class Task5 {
    /*
     * Реализовать функцию возведения числа а в степень b. a, b из Z. 
     * Сводя количество выполняемых действий к минимуму.
    Пример 1: а = 3, b = 2, ответ: 9
    Пример 2: а = 2, b = -2, ответ: 0.25
    Пример 3: а = 3, b = 0, ответ: 1
     */
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int q = 1;
        for (int i = 0; i < b; i++) {
            q *= a;

        }
        System.out.println(q);
    }
}
