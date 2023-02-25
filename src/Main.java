public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задача 1 ");
        // Пишем код для задачи 1
        byte clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Версия приложения не  определена.");
        }
    }


    public static void task2() {
        System.out.println("Задача 2");
        // Пишем код для задачи 2
        byte clientOS = 1;
        int clienDeviceYear = 2020;
        if (clientOS == 0) {
            if (clienDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else {
            if (clienDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        // Пишем код для задачи 3
        int year = 2020;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " является високосным");
        } else {
            System.out.println(year + " не является високосным");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        // Пишем код для задачи 4
        int deliveryDistance = 95;
        int deliveryDays = 1;
        if (deliveryDistance > 20 && deliveryDistance < 60) {
            deliveryDays++;
            System.out.println("Потребуется дней - " + deliveryDays);
        }
        if (deliveryDistance > 60 && deliveryDistance < 100) {
            deliveryDays = deliveryDays + 2;
            System.out.println("Потребуется дней - " + deliveryDays);
        } else {
            System.out.println("Свыше 100 км доставки нет");
        }


    }

    public static void task5() {
        System.out.println("Задача 5");
        // Пишем код для задачи 5
        int month = 12;

        switch (month) {
            case 12, 1, 2:
                System.out.println(month + " месяц - это зима");
                break;
            case 3, 4, 5:
                System.out.println(month + " месяц - это весна");
                break;
            case 6, 7, 8:
                System.out.println(month + " месяц - это лето");
                break;
            case 9, 10, 11:
                System.out.println(month + " месяц - это осень");
                break;
        }


    }
}
