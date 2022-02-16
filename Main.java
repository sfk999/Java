import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        int productPrice = 100;
//        int productPrice2 = 200;
//
//        int productsNumber = 10;
//
//        int sum = productPrice * productsNumber;
//        System.out.println("Сумма = " + sum + " руб.");
//
//        String myString = " My automation string 123 ";
//
//        System.out.println("Строка без пробелов " + myString.trim());
//        int stringLenght = myString.trim().length();
//
//        System.out.println("Длина строки " + stringLenght);
//
//        System.out.println("Строка содержит" );
//        System.out.println("price1 != price2:" + (productPrice != productPrice2));

//
////        System.out.println("Строки равны " + string1.equals(string2));ing

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите строку: ");
//        String stringFromConsole = scanner.nextLine();
//        System.out.println("Вы ввели строку: " + stringFromConsole);

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите ваше имя: ");
//        String stringName = scanner.nextLine();
//        System.out.println("Привет, " + stringName + "!");

//        if (string1.equals("First string")) {
//            System.out.println("Первая строка");
//            if (string2.equals("Second"))
//
//        } else {
//            System.out.println("Не первая строка");
//        }

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите ваше имя: ");
//        String stringName = scanner.nextLine();
//        if (stringName.equals("")) {
//            System.out.println("Привет, неизвестный");
//        } else {
//            System.out.println("Привет, " + stringName + "!");
//        }


//        Scanner scanner = new Scanner(System.in);
//        String stringName;
//        do {
//            System.out.println("Введите ваше имя: ");
//            stringName = scanner.nextLine();
//        } while (stringName.length() == 0);
//        System.out.println("Привет, " + stringName + "!");

        Person person1 = new Person("Иван", "Петрович", "Сидоров",33);
        person1.printName();
        person1.printAge();
        person1.getBornYear();

        System.out.println("Человек1: " + person1);

//        Person person2 = new Person("Ирина", "Павловна", "Соколова","23");
//        person2.printName();
//        person2.printAge();


    }
}
