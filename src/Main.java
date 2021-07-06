import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Ввод данных
        System.out.println("Введите необходимые числа и операцию разделяя их пробелом !");
        String insert = new Scanner(System.in).nextLine();

        //Обработка данных

        String[] newData = insert.trim().split(" ");
        if (newData.length == 3) {
            System.out.println("OK!");
        }
        int xxxx = 0;
        char xx = newData[1].charAt(0);
        switch (xx) {
            case ('+'):
                xxxx = Integer.parseInt(newData[0]) + Integer.parseInt(newData[2]);
                break;
            case ('-'):
                xxxx = Integer.parseInt(newData[0]) - Integer.parseInt(newData[2]);
                break;
            case ('*'):
                xxxx = Integer.parseInt(newData[0]) * Integer.parseInt(newData[2]);
                break;
            case ('/'):
                xxxx = Integer.parseInt(newData[0]) / Integer.parseInt(newData[2]);
                break;

        }

        //Вывод данных
        System.out.println(xxxx);


    }
}
