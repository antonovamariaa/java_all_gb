public class Task3 {
    /*
     * Напишите метод, который принимает на вход строку (String) и определяет является ли 
     * строка палиндромом (возвращает boolean значение).

Палиндром - Слово или фраза, которые одинаково читаются слева направо и справа налево.
     */
    public static void main(String[] args) {
        String str = "потоп";
        if (palindr(str)){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
    static Boolean palindr(String str){
        char[] letters = str.toCharArray();
        for (int i = 0; i < letters.length/2; i++) {
            if(letters[i] != letters[letters.length - 1 - i]){
                return false;
            }
            
                
            
        }
        return true;
    }

    static Boolean palindr2(String str){
        String s1 = str.toLowerCase();
        StringBuilder res = new StringBuilder(s1);
        String s2 = res.reverse().toString();
        System.out.println(res);
        return s1.equals(s2);
    }
}
