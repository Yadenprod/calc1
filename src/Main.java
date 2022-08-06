import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println(calc(""));
    }

    public static String calc(String input) {
        Scanner in = new Scanner(System.in);
        String a =in.nextLine(),b=in.nextLine(),c=in.nextLine();
        System.out.println("Результат: "+a+b+c);
        int z= Integer.parseInt(a);
        int x= Integer.parseInt(c);

            return input;
        }
    }