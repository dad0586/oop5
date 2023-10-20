// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook("Birinchi Kitob");
        // System.out.println(phoneBook.getName());

        phoneBook.add("Ali", "Aliyev", "12345");
        phoneBook.add("Vali", "Valiyev", "23242");
        phoneBook.add("A", "Valiyev", "23242");
        phoneBook.add("B", "Valiyev", "23242");
        phoneBook.add("C", "Valiyev", "23242");
        phoneBook.add("D", "Valiyev", "23242");


        phoneBook.show();
    }
}