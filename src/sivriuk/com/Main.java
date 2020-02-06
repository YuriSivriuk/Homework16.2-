package sivriuk.com;

import java.util.Scanner;
import java.util.Arrays;

public class Main {


    /*2*) Дан кирпич со сторонами a,b,c и отверстие со сторонами x,y. Определить пройдет ли кирпич в отверстие.
    Например кирпич со сторонами 2,3,2 не пройдет в отверстие 1x50.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ширину кирпича : ");
        int width = scanner.nextInt();
        System.out.println("Введите высоту кирпича : ");
        int height = scanner.nextInt();
        System.out.println("Введите длину кирпича : ");
        int length = scanner.nextInt();
        System.out.println("Введите высоту отверстия : ");
        int height2 = scanner.nextInt();
        System.out.println("Введите ширину отверстия : ");
        int width2 = scanner.nextInt();
        int[] array = {width, height, length};
        int[] array2 = {height2, width2};
        Arrays.sort(array);
        Arrays.sort(array2);

        if (array[0] <= array2[0] && array[1] <= array2[1]) {
            System.out.println("Кирпич пройдет в отверстие ");
        } else System.out.println("Кирпич не пройдет в отверстие ");

    }
}
