import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner numb = new Scanner(System.in);
        int[] arr = new int[0];
        while (true){
            System.out.println("Меню");
            System.out.println("1. Згенерувати массив");
            System.out.println("2. Сортування TimSort");
            System.out.println("3. Сортування IntroSort");
            System.out.println("4. Сортування двома методами");
            System.out.println("5. Завершення программи :(");
            System.out.print("\nОпція: ");

            switch (numb.nextInt()){
                case 1:
                    System.out.print("\nВведіть розмір массиву: ");
                    arr = new int [numb.nextInt()];

                    for (int i = 0; i < arr.length; i++) {
                        arr[i] = (int)(Math.random() * arr.length) + 1;
                    }
                    System.out.println("\n");
                    break;
                case 2:
                    System.out.println("\n");
                    if(arr.length == 0) {
                        System.out.println("Ініціалізуйте массив!");
                        break;
                    }
                    timSortMethod(arr);
                    System.out.println("\n");
                    break;
                case 3:
                    System.out.println("\n");
                    if(arr.length == 0) {
                        System.out.println("Ініціалізуйте массив!");
                        break;
                    }
                    introSortMethod(arr);
                    System.out.println("\n");
                    break;
                case 4:
                    System.out.println("\n");
                    if(arr.length == 0) {
                        System.out.println("Ініціалізуйте массив!");
                        break;
                    }
                    System.out.println("TimSort: ");
                    timSortMethod(arr);
                    System.out.println("IntroSort: ");
                    introSortMethod(arr);
                    System.out.println("\n");
                    break;
                case 5:
                    System.out.println("\n Папа!");
                    return;
                default:
                    break;
            }
        }
    }

    static void timSortMethod(int []arr){
        int[] timArr = arr.clone();
        long startTimTime = System.currentTimeMillis();
        TimSort.timSort(timArr, timArr.length);
        long endTimTime = System.currentTimeMillis() - startTimTime;
        System.out.println("\tSorted for "+endTimTime+"ms");
    }

    static void introSortMethod(int []arr){
        int[] introArr = arr.clone();
        IntroSort introsort = new IntroSort(introArr.length);
        for (int j : introArr) {
            introsort.dataAppend(j);
        }
        long startIntroTime = System.currentTimeMillis();
        introsort.sortData();
        long endIntroTime = System.currentTimeMillis() - startIntroTime;
        System.out.println("\tSorted for "+endIntroTime+"ms");
    }
}
