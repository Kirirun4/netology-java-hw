import products.*;
import base.*;
import clothes.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        commodity[] goods = {new apple(), new banana(),new bread(), new milk(), new shirt(), new tShirt(), new windbreaker()};

        Scanner scanner = new Scanner(System.in);
        while (true) {
            printGoods(goods);
            System.out.println("Введите номер товара и количество через пробел или введите `end` ");
            String input = scanner.nextLine();
            if (input.equals("end")) break;
            String[] parts = input.split(" ");
            int goodsNumber = Integer.parseInt(parts[0]) - 1;
            goods[goodsNumber].setNumber(Integer.parseInt(parts[1]));
        }

        printCheak(goods);
        printBasket(goods);
    }

    private static void printGoods(commodity[] goods) {
        System.out.println("Ознакомьтесь со списком товаров: ");
        for (int i = 0; i < goods.length; i++) {
            System.out.println((i + 1) + ". " + goods[i]);
        }
    }

    private static void printBasket(commodity[] goods) {
        int costGoods = 0;
        System.out.println("Ваша корзина: ");
        for (commodity goodsList : goods) {
            if (goodsList.getNumber() != 0) {
                costGoods += goodsList.getNumber() * goodsList.getPrice();
                System.out.println(goodsList.getName() + " количество = " + goodsList.getNumber() + " шт."
                        + " цена = " + goodsList.getPrice() + " " +
                        " стоимость = " + goodsList.getNumber() * goodsList.getPrice() + " рублей");
            }
        }
        System.out.println("Итого: " + costGoods + " " + "рублей");
    }

    private static void printCheak(commodity[] goods) {
        System.out.println("Производится проверка товаров:");
        if (goods[0].getNumber() != 0) {
            apple apple = new apple();
            apple.check();
            apple.food();
        }

        if (goods[1].getNumber() != 0) {
            banana banana = new banana();
            banana.check();
            banana.food();
        }

        if (goods[2].getNumber() != 0) {
            bread bread = new bread();
            bread.check();
            bread.food();
        }

        if (goods[3].getNumber() != 0) {
            milk milk = new milk();
            milk.check();
            milk.food();
        }

        if (goods[4].getNumber() != 0) {
            shirt shirt = new shirt();
            shirt.check();
            shirt.clothes();
        }

        if (goods[5].getNumber() != 0) {
            tShirt tShirt = new tShirt();
            tShirt.check();
            tShirt.clothes();
        }

        if (goods[6].getNumber() != 0) {
            windbreaker windbreaker = new windbreaker();
            windbreaker.check();
            windbreaker.clothes();
            windbreaker.outerwear();
        }
    }
}
// 1. DRY - вынос печати списка возможных товаров и проверок в отдельный метод.
// 2. Single-Responsibility principly - Принцип единственной ответственности.
// Разбил программу на пакеты и классы с соблюдением логики.
// 3. Open-Closed principle - Принцип открытости / закрытости.
// Класс commodity не требует изменений, он расширен за счет наследования классами: apple, banana, bread, milk, shirt, tShirt, windbreaker.
// При этом поля name, price, count закрыты для модификации.
// 4. Liskov substitution principle - Принцип замены Барбары Лисков.
// Для реализации данного принципа было создано 2 отдельных интерфейса - food и clothes.
// 5. Interface segregation principle - Принцип сегрегации (разделения) интерфейса.
// Создано несколько различных логически независимых интерфейсов: check, clothes, food, outerwear.