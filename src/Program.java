import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner numb = new Scanner(System.in);
        int[] greatArr = new int[0];
        int[] badArr = new int[0];
        int[] normalArr = new int[0];
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
                    int size = numb.nextInt();
                    greatArr = new int [size];
                    badArr = new int [size];
                    normalArr = new int [size];

                    for (int i = 0; i < size; i++) {
                        greatArr[i] = i;
                    }

                    for (int i = 0, j = size; i < size; i++, j--) {
                        badArr[i] = j;
                    }

                    for (int i = 0; i < size; i++) {
                        normalArr[i] = (int)(Math.random() * size) + 1;
                    }

                    System.out.println("\n");
                    break;
                case 2:
                    System.out.println("\n");
                    if(greatArr.length == 0) {
                        System.out.println("Ініціалізуйте массив!");
                        break;
                    }
                    timSortMethod(greatArr, badArr, normalArr);
                    System.out.println("\n");
                    break;
                case 3:
                    System.out.println("\n");
                    if(greatArr.length == 0) {
                        System.out.println("Ініціалізуйте массив!");
                        break;
                    }
                    introSortMethod(greatArr, badArr, normalArr);
                    System.out.println("\n");
                    break;
                case 4:
                    System.out.println("\n");
                    if(greatArr.length == 0) {
                        System.out.println("Ініціалізуйте массив!");
                        break;
                    }
                    System.out.println("TimSort: ");
                    timSortMethod(greatArr, badArr, normalArr);
                    System.out.println("IntroSort: ");
                    introSortMethod(greatArr, badArr, normalArr);
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

    static void timSortMethod(int []greatArr, int []badArr, int []normalArr){
        System.out.print("Great arr: ");
        int[] timArr1 = greatArr.clone();
        long startTimTime1 = System.currentTimeMillis();
        TimSort.timSort(timArr1, timArr1.length);
        long endTimTime1 = System.currentTimeMillis() - startTimTime1;
        System.out.println("\tSorted for "+endTimTime1+"ms");

        System.out.print("Bad arr: ");
        int[] timArr2 = badArr.clone();
        long startTimTime2 = System.currentTimeMillis();
        TimSort.timSort(timArr2, timArr2.length);
        long endTimTime2 = System.currentTimeMillis() - startTimTime2;
        System.out.println("\tSorted for "+endTimTime2+"ms");

        System.out.print("Normal arr: ");
        int[] timArr3 = normalArr.clone();
        long startTimTime3 = System.currentTimeMillis();
        TimSort.timSort(timArr3, timArr3.length);
        long endTimTime3 = System.currentTimeMillis() - startTimTime3;
        System.out.println("\tSorted for "+endTimTime3+"ms");
    }

    static void introSortMethod(int []greatArr, int []badArr, int []normalArr) {
        System.out.print("Great arr: ");
        int[] introArr1 = greatArr.clone();
        IntroSort introsort1 = new IntroSort(introArr1.length);
        for (int j : introArr1) {
            introsort1.dataAppend(j);
        }
        long startIntroTime1 = System.currentTimeMillis();
        introsort1.sortData();
        long endIntroTime1 = System.currentTimeMillis() - startIntroTime1;
        System.out.println("\tSorted for " + endIntroTime1 + "ms");


        System.out.print("Bad arr: ");
        int[] introArr2 = badArr.clone();
        IntroSort introsort2 = new IntroSort(introArr2.length);
        for (int j : introArr2) {
            introsort2.dataAppend(j);
        }
        long startIntroTime2 = System.currentTimeMillis();
        introsort2.sortData();
        long endIntroTime2 = System.currentTimeMillis() - startIntroTime2;
        System.out.println("\tSorted for " + endIntroTime2 + "ms");


        System.out.print("Great arr: ");
        int[] introArr3 = normalArr.clone();
        IntroSort introsort3 = new IntroSort(introArr3.length);
        for (int j : introArr3) {
            introsort3.dataAppend(j);
        }
        long startIntroTime3 = System.currentTimeMillis();
        introsort1.sortData();
        long endIntroTime3 = System.currentTimeMillis() - startIntroTime3;
        System.out.println("\tSorted for " + endIntroTime3 + "ms");
    }
}
