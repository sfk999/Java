public class Main {
    public static void main(String[] args) {

        int productPrice = 100;
        productPrice = productPrice + 1;

        int productsNumber = 10;

        int sum = productPrice * productsNumber;
        System.out.println("Сумма = " + sum + " руб.");

        String myString = " My automation string 123 ";

        System.out.println("Строка без пробелов " + myString.trim());
        int stringLenght = myString.trim().length();

        System.out.println("Длина строки " + stringLenght);

        System.out.println("Строка содержит" );

    }
}
