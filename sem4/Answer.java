package sem4;

class Answer {
    public void printPrimeNums() {
        for (int i = 1; i <= 1000; i++) {
            boolean Prime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    Prime = false;
                    break;
                }
            }
            if (Prime) {
                System.out.println(i);
            }
        }
    }


// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{
    public static void main(String[] args) {

        Answer ans = new Answer();
        ans.printPrimeNums();
    }
}
}