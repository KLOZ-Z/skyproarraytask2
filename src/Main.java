public class Main {

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1(){
        System.out.println("\nTask 1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int k : arr) sum = sum + k;
        System.out.println("Сумма трат за месяц составила "+ sum +" рублей");
        System.out.println("\nTask 2");
        int min = 300000;
        int max = -1;
        for (int j : arr) {
            if (j > max)
                max = j;
            if (j < min)
                min = j;
        }
        System.out.println("Минимальная сумма трат за день составила "+ min+ " рублей.");
        System.out.println("Максимальная сумма трат за день составила "+ max+ " рублей.");
        System.out.println("\nTask 3");
        double meanSum = sum/arr.length;
        System.out.println("Средняя сумма трат за месяц составила "+ meanSum +" рублей");
    }

    public static void task4(){
        System.out.println("\nTask 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for(int i= reverseFullName.length-1;i>=0;i--){
            System.out.print(reverseFullName[i]);
        }
    }


    public static void main(String[] args) {
        task1();
        task4();
    }
}