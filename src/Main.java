public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        System.out.println("Задача 1");
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


    public static void task2 () {
        System.out.println("Задача 2");
        // Пишем код для задачи 2
        byte clientOS = 1;
        int clienDeviceYear=2020;
        if (clientOS==0) {if (clienDeviceYear<2015){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }}
        else{
            if (clienDeviceYear<2015){
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
    }
        }
    }
