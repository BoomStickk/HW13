import java.util.Scanner;

public class Main {
    public static String mirrorEnds(String text) {                    //2ра задача
        text=text.toLowerCase();
        char[] arr = text.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < text.length() / 2; ++i) {
            if (arr[i] != arr[text.length() - 1 - i]) {
                return builder.toString();
            }
            builder.append(arr[i]);
        }
        return text;
    }

    public static String reverseString(String text) {
        StringBuilder sb = new StringBuilder(text);
        sb.reverse();
        return sb.toString();
    }


    public static int countYZ(String text) {                            //3та задача
        int count = 0;
        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " ");
            if (words[i].endsWith("y") || words[i].endsWith("z"))
                count++;
        }
        return count;
    }

    public static void printExclamation(int n) {                      //4та задача
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("!");
            }
            System.out.println();
        }

    }

    private static void printFrame(int size) {                       //5та задача
        System.out.print("?");
        for (int i = 0; i < size - 2; i++) {
            System.out.print("-");
        }
        System.out.println("?");

        for (int i = 2; i < size; i++) {
            System.out.print("|");
            for (int j = 0; j < size - 2; j++) {
                System.out.print("-");
            }
            System.out.println("|");
        }
        System.out.print("?");
        for (int i = 0; i < size - 2; i++) {
            System.out.print("-");
        }
        System.out.println("?");
    }


    public static void main(String[] args) {
        System.out.println("===================task2==========================");
        Scanner in = new Scanner(System.in);
        System.out.print("enter text: ");
        String text = in.next();
        if (!mirrorEnds(text).equals("")) {
            System.out.println("it starts with- " + mirrorEnds(text) + " -and it ends with- " + reverseString(mirrorEnds(text)));
        } else {
            System.out.println("the word isn't mirrored");
        }
        System.out.println("===================task3=============================");
        String text1 = "fez day";
        String text2 = "day fyyyz";
        String text3 = "Dad fez";
        String text4 = "Yellowy fez day";
        System.out.println(countYZ(text1));
        System.out.println(countYZ(text2));
        System.out.println(countYZ(text3));
        System.out.println(countYZ(text4));
        System.out.println("===================task4=============================");
        System.out.print("enter an integer: ");
        Scanner hmm = new Scanner(System.in);
        int number = hmm.nextInt();
        printExclamation(number);
        System.out.println("===================task5=============================");
        System.out.print("enter an integer: ");
        int number2 = hmm.nextInt();
        printFrame(number2);


    }
}