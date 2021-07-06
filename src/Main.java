import java.util.Scanner;

public class Main {


    private static int a = 0;
    private static int b = 0;
    private static int e = 0;
    private static char c;

    public static void main(String[] args) {
        //Ввод данных
        System.out.println("Введите необходимые числа и операцию разделяя их пробелом !");
        String insert = new Scanner(System.in).nextLine();

        //Обработка данных
        String[] newData = insert.trim().split(" ");
        if (newData.length == 3 ) {
            System.out.println("OK!");
            a = Integer.parseInt(newData[0]);
            b = Integer.parseInt(newData[2]);
            c = newData[1].charAt(0);
        }
        //Вывод данных
        System.out.println(returnResult(a,c,b));
    }
    public static int returnResult(int a, char c, int b){
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
                e = a / b;
                break;
        }
        return e;
    }

}
