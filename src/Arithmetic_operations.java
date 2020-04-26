import java.util.Scanner;
public class Arithmetic_operations {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число x= ");
        int x = scanner.nextInt();
        System.out.print("Введите число y= ");
        int y = scanner.nextInt();
        System.out.print("Введите число z= ");
        int z = scanner.nextInt();
        int average = (x+y+z)/3;
        System.out.println("Среднее = "+ average);
        int del;
        del= average/2;
        System.out.println("Деление без остатка: " + del+" ");
        if (del>3){
        System.out.println("Программа выполнена корректно");
        }
    }
}
