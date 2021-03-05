import model.Customer;
import model.CustomerList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
            8. Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод toString().
            Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами.
            Задать критерии выбора данных и вывести эти данные на консоль.
            Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
            Найти и вывести:
            a) список покупателей в алфавитном порядке;
            b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
         */

        ArrayList<Customer> list = new ArrayList<>(Arrays.asList(
                new Customer(1, "Mark", "Gomel", 1223, 2154),
                new Customer(2, "Eva", "Minsk", 4565, 8587),
                new Customer(3, "Gleb", "Grodno", 7896, 1243)));

        Customer customer = new Customer(4, "Nina", "Minsk", 4812, 9545);

        CustomerList customers = new CustomerList(list);
        customers.add(customer);

        System.out.println("Список покупателей в алфавитном порядке:");
        customers.getListByName();
        customers.showList();

        System.out.println("Задайте интервал для поиска карт:");
        Scanner sc =new Scanner(System.in);
        int from = sc.nextInt();
        int to = sc.nextInt();
        sc.close();

        System.out.println("Владельцы карт:");
        customers.getListByCard(from, to);
    }
}
