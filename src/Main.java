import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    private static int a = 0;
    private static int b = 0;
    private static int e = 0;

    private static char c;
    private static String a1;
    private static String b1;

    private static Integer[] desimal = {100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static String[] stringi = {"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public static void main(String[] args) {
        //Ввод данных
        System.out.println("Введите необходимые числа и операцию разделяя их пробелом !");
        String insert = new Scanner(System.in).nextLine().toUpperCase();
        //Обработка данных
        String[] newData = insert.trim().split(" ");
        //доделать завтра, исправить ввод запрещенных символов и их количество
        if(newData.length == 3){

        }

        if (newData.length == 3) {
            String[] testA = newData[0].trim().split("");
            String[] testB = newData[2].trim().split("");


            if (newData.length == 3 & (testA.length <= 2 || testB.length < 3) & Character.isDigit(newData[0].charAt(0)) & Character.isDigit(newData[2].charAt(0))) {
                if (Integer.parseInt(newData[0]) <= 10 & Integer.parseInt(newData[2]) <= 10) {
                    a = Integer.parseInt(newData[0]);
                    b = Integer.parseInt(newData[2]);
                    c = newData[1].charAt(0);

                    System.out.println(returnResult(a, c, b));
                } else {
                    System.out.println("Error 20");
                }
            } else if (!Character.isDigit(newData[0].charAt(0)) & !Character.isDigit(newData[2].charAt(0)) & newData.length <= 3) {
                a1 = newData[0];
                b1 = newData[2];
                c = newData[1].charAt(0);

                int xw3 = returnResult(returnA(a1), c, returnA(b1));
                if (xw3 < 0) {
                    xw3 = Math.abs(xw3);
                }
                if (xw3 != 0) {
                    System.out.println(returnRomeo(xw3));
                } else {
                    System.out.println(0);
                }

            } else {
                System.out.println("Error 25");
            }
        } else {
            System.out.println("Error 19 критическая");
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
                e = a * b;
                break;
            case ('/'):
                if (b != 0) {
                    e = a / b;
                } else {
                    System.out.println("Error 21");
                }
                break;

        }
        return e;
    }

    public static int returnA(String ax) {
        int i = 0;
        switch (ax) {
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

    public static String returnRomeo(int xw3) {
        String newResult = "";
        for (int i = 0; i < desimal.length; i++) {
            while (desimal[i] <= xw3) {
                newResult += stringi[i];
                xw3 = xw3 - desimal[i];
            }
        }
        return newResult;

    }

}
