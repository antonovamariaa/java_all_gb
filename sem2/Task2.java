public class Task2 {
    /*
    напишите метод, который сжимает стороку.
    пример: aaaabbbccd
    результат: a4b3c2d1
     */
    public static void main(String[] args) {
        String str = "aaaabbbcdde'";
        System.out.println(list(str));
    }

    static String list (String str){
        StringBuilder strBuild = new StringBuilder();
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i+1)) {
                count += 1;
            }
            else {
                strBuild.append(str.charAt(i));
                strBuild.append(count + 1);
                count = 0;
            }
        
        }
        return strBuild.toString();
    }
}
