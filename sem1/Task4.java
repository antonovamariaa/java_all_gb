public class Task4 {
    /*
     * Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.
     */
    public static void main(String[] args) {
        String line = "Добро пожаловать на курс по Java";
        String[] words = line.split(" ");
        String res = "";
        for (int i = words.length - 1; i >= 0; i--) {
            res += words[i];
            res += " ";
        }
        String res2 = String.join(",", words);
        System.out.println(res2);
        System.out.println(res.trim());
    }
}
