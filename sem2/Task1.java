
public class Task1 {
    /*
     * Дано четное число N (>0) и символы c1 и c2. 
Написать метод, который вернет строку длины N, которая состоит 
из чередующихся символов c1 и c2, начиная с c1.
Ответ: c1c2c1…c2 (всего N символов)
     */
    public static void main(String[] args) {
        char c1 = 'l';
        char c2 = 'L';
        int n = 6;
        System.out.println(concat(c1, c2, n));


    }

    static String concat (char c1, char c2, int n){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n/2; i++) {
            stringBuilder.append(c1);
            stringBuilder.append(c2);
        }
        return stringBuilder.toString();
    }
}
