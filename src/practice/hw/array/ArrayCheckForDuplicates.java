package practice.hw.array;

public class ArrayCheckForDuplicates {
    public static void main(String[] args) {
// Задайте массив на 10 элементов и заполните его случайными числами в интервале от -10 до 10.
// Распечатайте полученный массив. Создайте метод, который определяет наличие дубликатов в массиве.
//Разработайте соответсвующий тест (набор тестов).

        int[] array = new int[10];
        int a = -10;
        int b = 10;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (b - a + 1) + a);
        }
        printArray(array);
        boolean res = checkForDuplicates(array);
        System.out.println("Check for duplicates: " + res);
    }
    //============================

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    //  метод для проверки дубликатов в массиве
    public static boolean checkForDuplicates(int[] arr) {
        // для каждого элемента массива проверяем, встречается ли он потом в массиве
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] != 0 && arr[i] == (arr[j])) {
                    return true;
                }
            }
        }
        // дубликат не найден
        return false;
    }
    
}

