import java.util.Locale;
import java.util.Scanner;

public class Main {


    private static int a = 0;
    private static int b = 0;
    private static int e = 0;

    private static char c;
    private static String a1;
    private static String b1;

    public static void main(String[] args) {
        //Ввод данных
        System.out.println("Введите необходимые числа и операцию разделяя их пробелом !");
        String insert = new Scanner(System.in).nextLine();
        insert.toUpperCase(Locale.ROOT);
        //Обработка данных
        String[] newData = insert.trim().split(" ");
        String[] testA = newData[0].trim().split("");
        String[] testB = newData[2].trim().split("");

        if (newData.length == 3 & (testA.length <= 2 || testB.length <= 2) & Character.isDigit(newData[0].charAt(0)) & Character.isDigit(newData[2].charAt(0))) {
            System.out.println("OK!");
            if(Integer.parseInt(newData[0])<=10 & Integer.parseInt(newData[2]) <=10) {
                a = Integer.parseInt(newData[0]);
                b = Integer.parseInt(newData[2]);
                c = newData[1].charAt(0);

                System.out.println(returnResult(a, c, b));
            }
        } else if (!Character.isDigit(newData[0].charAt(0)) & !Character.isDigit(newData[2].charAt(0)) & newData.length <= 3) {
            System.out.println("OK to!");
            //имеем: I II III IV V VI VII VIII IX X
            a1 = newData[0];
            b1 = newData[2];
            c = newData[1].charAt(0);

            int xw3 = returnResult(returnA(a1), c, returnA(b1));
            System.out.println(xw3);
        } else{
            System.out.println("Error 25");
        }
    }

    public static int returnResult(int a, char c, int b) {
        switch (c) {
            case ('+'):
                e = a + b;
                break;
            case ('-'):
                e = a - b;
                break;
            case ('*'):
                e = a + b;
                break;
            case ('/'):
                if (b != 0) {
                    e = a / b;
                } else {
                    System.out.println("Error");
                }
                break;

        }
        return e;
    }

    public static int returnResult2(char a1, char c, char b1){
        return  0;
    }

    public static int returnA(String ax) {
        int i = 0;
        switch (ax){
            case ("I"):
                i = 1;
                break;
            case ("II"):
                i = 2;
                break;
            case ("III"):
                i = 3;
                break;
            case ("IV"):
                i = 4;
                break;
            case ("V"):
                i = 5;
                break;
            case ("VI"):
                i = 6;
                break;
            case ("VII"):
                i = 7;
                break;
            case ("VIII"):
                i = 8;
                break;
            case ("IX"):
                i = 9;
                break;
            case ("X"):
                i = 10;
                break;
        }
        return i;
    }
}
