package company.net;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

           // TASK 1

        /*
        //1. Приветствовать любого пользователя при вводе его имени через командную строку.
        System.out.println("Введите имя и нажмите <Enter>: ");
        Scanner scan=new Scanner (System.in);
        String name=scan.next();
        System.out.println("Привет, " + name);
        scan.close();*/




        /*
        //3. Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.
        int x, y, z;
        x=7;
        y=5;
        z=8;
        System.out.println(x);
        System.out.print(y);
        System.out.println(z);*/




        /*
        //4. Ввести пароль из командной строки и сравнить его со строкой-образцом.
        Scanner s=new Scanner (System.in);
        System.out.println("Enter password:  ");
        int p=s.nextInt();

        boolean n=(p==123456);
        System.out.println("This password is " +n);*/




        /*
        //5. Ввести целые числа как аргументы командной строки, подсчитать их суммы (произведения) и вывести результат на консоль.
        int x, y, z, p;
        x=2;
        y=1;
        z=5;
        p=8;

        System.out.print("x+y+z+p = ");
        System.out.println (x+y+z+p);

        System.out.print("x*y*z*p =");
        System.out.println(x*y*z*p);*/


       //6.Ввести с консоли n целых чисел. На консоль вывести: 6.1. Четные и нечетные числа.

        /*int number;
        Scanner sr = new Scanner(System.in);
        System.out.print("Введите целое число");
        if(sr.hasNextInt()){
            number = sr.nextInt();
            if ((number % 2) == 0){
                System.out.print("Четное число " + number);
            }else{System.out.print("Не четное число " + number);}
        }else{System.out.print("Вы ввели не целое число");}*/




// Если вводить несколько чисел через пробел - не получается - надо добавить какую-то функцию после if (numbers[i] % 2 == 0) ;
       /*System.out.print("Сколько целых чисел вы собираетесь ввести? ");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        if (size == 0) {
            System.out.print("Программа завершена.");
            System.exit(0);
        }
        Integer[] numbers = new Integer[size];
        System.out.print("Введите целые числа через пробел "
                + "и нажмите <Enter>: ");
        for (int i = 0; i < size; i++)
            numbers[i] = in.nextInt();

        // 1. Четные и нечетные числа

           for (int i = 0; i < size; i++) {
            if (numbers[i] % 2 == 0) ;
            {
                System.out.println("Четное число "+(numbers[i] % 2 == 0));
            }
        }*/



        // TASK 2

        //8.Ввести числа от 1до к
        /*int m[][]=new int[9][10];
        int i,j,k=0;

        for (i=0;i<9;i++)
            for(j=0;j<10;j++){
                m[i][j]=k;
                k++;
            }
        for (i=0;i<9;i++){
            for (j=0;j<10;j++)
                System.out.print(m[i][j]+" ");
            System.out.println();
        }*/


        // Заполнить матрицу случайными числами
        int m2[][]=new int[5][5];
        Random rand= new Random();

        for (int i=0;i<5;i++)
            for (int j=0;j<5;j++)
                m2[i][j]=rand.nextInt(10);

        for (int i=0;i<5;i++)
        {
            for (int j = 0; j < 5; j++)
                System.out.print(m2[i][j] + " ");
            System.out.println();
        }

    }


}









