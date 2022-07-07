import java.util.Scanner;

/*
 Немного отклонился от темы, стало интересно вывести таблицу умножения в виде именно таблицы, а не примеров
 Поэтому сделал два варианта, пользователь сам выбирает, что ему смотреть, примеры на семь
 или всю таблицу умножения целиком
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isAnswer = false;
        System.out.println("Если Вы хотите увидеть просто таблицу умножения на семь, введите \"7\".\n" + "Иначе введите \"10\", чтобы увидеть полную таблицу умножения на 10.");
        while (!isAnswer) {
            System.out.println("Введите Ваш ответ в виде числа \" 7 \" или \" 10 \": ");
            int answer = 0;
            if (scanner.hasNextInt()) answer = scanner.nextInt();
            if (answer == 7 ){
                examples();
                isAnswer = true;
                scanner.close();
            }
            else if (answer == 10 ) {
                table();
                isAnswer = true;
                scanner.close();
            } else scanner.nextLine();

        }

    }
    // Вывод таблицы умножения 10 на 10
    public static void table () {
        //верхняя строка таблицы умножения
        for (int i = 0; i < 11; i ++) {
            if ( i == 0) System.out.print("  #");
            else if ( i == 10) System.out.println(" " + i);
            else System.out.print("  " + i);

        }

        for (int k = 1; k < 11; k++) { //таблица умножения 10 на 10

            for (int i = 0; i < 11; i++) {
                if (i == 0) {
                    if (k < 10 )System.out.print("  " + k); // Выравнивание первого столбца по 10
                    else System.out.print(" " + k);
                }
                else if (i == 10){ // Вывод последнего числа в строке
                    if ( k * i < 10) System.out.println("  " + k * i);
                    else System.out.println(" " + k * i);
                } // Вывод средней части строки в зависимости от кол-ва цифр в ответе
                else if (k * i < 10) System.out.print("  " + k * i);
                else System.out.print(" " + k * i);
            }

        }
    }
    // Вывод таблицы примеров на семь
    public static  void  examples () {
        for (int i = 1; i < 11; i++) {
            System.out.println("7 x " + i + " = " + i * 7);
        }
    }
}
