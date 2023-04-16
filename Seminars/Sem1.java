//1. Написать программу, которая запросит пользователя ввести <Имя> в консоли.
//Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”

package Seminars;

/**
 * Sem1
 */
// import java.util.Scanner;
// public class Sem1 {

//     public static void main(String[] args) {
// //         Scanner iScanner = new Scanner(System.in);
// //         System.out.printf("Введите ваше имя: ");
// //         String name = iScanner.nextLine();
// //         System.out.printf("Привет, %s! \n", name);
// //         iScanner.close();
        
// //     }
// // }

//Дан массив двоичных чисел, например [1,1,0,1,1,1], 
//вывести максимальное количество подряд идущих 1.

// public class Sem1 {

//     public static void main(String[] args) {
//             int[] arr = new int[] {1,1,0,1,1,1,0,1,1,1,1,1,1};
//             int count = 0;
//             int max = 0;
//             for (int i = 0; i < arr.length; i++) {
//                 if (arr[i] == 1) {
//                     count++;
//                     if (count > max) {
//                         max = count;
//                     }
//                 }
//                 else {
//                     count = 0;
//                 }
//             }
//             System.out.println(max);
//         }
// }
// // Дан массив nums = [3,2,2,3] и число val = 3.
// Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
// Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.

public class Sem1 {

    public static void main(String[] args) {
        int[] arr = new int[] {3,2,2,3};
        int val = 3;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i +1; j < arr.length; j++) {
                if (arr[i] == val){
                    arr[i] = arr[j];
                    arr[j] = val;
                }
            }
        
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            
        }

}
}