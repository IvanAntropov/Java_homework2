// Написать программу вычисления n-ого треугольного числа.

import java.util.Scanner;

public class Ex2 {

    // Решение рекурсией
    static int RecursionTriangle(int number){
        if(number == 1){
            return 1;
        }else{
            return number + RecursionTriangle(number - 1 );
        }
    }

    // Решение через for
    static int ForTriangle(int number){
        int result = 0;
        for(int i = 0; i < number; i++){
            result += (i+1);
        }
        return result;
    }

    // Решение по формуле
    static int TriangleFormula(int number){
        int result = (number*(number+1))/2;
        return (int) result;
    }

    static int InputNumber(String text1, String text2){
        Scanner in = new Scanner(System.in);
        int number = 0;
        boolean check = true;
        while(check) {
            System.out.printf(text1);
            if (in.hasNextInt()) {
                number = in.nextInt();
                if(number <= 0){
                    System.out.println(text2);
                }else {
                    check = false;
                }
            } else {
                System.out.println(text2);
                in.next();
            }
        }
        return number;
    }


    public static void main(String[] args){

        int number;
        number = InputNumber("Введите целое положительное число: ", "___Error___ \nЧисло должно быть целым и положительным.");
        System.out.printf("%d треуголное число рекурсией: %d\n", number, RecursionTriangle(number));
        System.out.printf("%d треуголное число циклом for: %d\n", number, ForTriangle(number));
        System.out.printf("%d треуголное число по формуле: %d\n", number, TriangleFormula(number));

    }
}