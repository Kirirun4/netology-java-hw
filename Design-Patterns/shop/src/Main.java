import base.*;
import clothes.*;
import clothes.outerwear.*;
import products.*;
import products.fruit.*;

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
            goods[goodsNumber].setCount(Integer.parseInt(parts[1]));
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
            if (goodsList.getCount() != 0) {
                costGoods += goodsList.getCount() * goodsList.getPrice();
                System.out.println(goodsList.getName() + " количество = " + goodsList.getCount() + " шт."
                        + " цена = " + goodsList.getPrice() + " " +
                        " стоимость = " + goodsList.getCount() * goodsList.getPrice() + " рублей");
            }
        }
        System.out.println("Итого: " + costGoods + " " + "рублей");
    }

    private static void printCheak(commodity[] goods) {
        System.out.println("Производится проверка товаров:");
        for (commodity goodsList : goods) {
            if (goodsList.getCount() != 0) {
                if (goodsList.getGroupe() == "windbreaker"){
                    windbreaker windbreaker = new windbreaker();
                    windbreaker.check();
                    windbreaker.clothes();
                    windbreaker.outerwear();
                }
                if (goodsList.getGroupe() == "apple") {
                    apple apple = new apple();
                    apple.check();
                    apple.products();
                    apple.fruit();
                }
                if (goodsList.getGroupe() == "banana") {
                    banana banana = new banana();
                    banana.check();
                    banana.products();
                    banana.fruit();
                }
                if (goodsList.getGroupe() == "bread") {
                    bread bread = new bread();
                    bread.check();
                    bread.products();
                }
                if (goodsList.getGroupe() == "milk") {
                    milk milk = new milk();
                    milk.check();
                    milk.products();
                }
                if (goodsList.getGroupe() == "shirt") {
                    shirt shirt = new shirt();
                    shirt.check();
                    shirt.clothes();
                }
                if (goodsList.getGroupe() == "tShirt") {
                    tShirt tShirt = new tShirt();
                    tShirt.check();
                    tShirt.clothes();
                }
            }
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