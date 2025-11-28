public class Main {
    // метод к заданию 1
    public static void checkYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(" Год: " + year + " является високосным ");
        } else {
            System.out.println(" Год: " + year + " не является високосным ");
        }
        if (year < 1584) {
            System.out.println(" Данный год входит в период, когда високосный год не был введен ");
        }
    }
    // метод к заданию 2
    public static void checkClientDeviceYear(int clientDeviceYears, int clientOS) {
        if (clientOS == 0 && clientDeviceYears >= 2015) {
            System.out.println(" Установите версию приложения для IOS по ссылке ");
        } else if (clientOS == 0 && clientDeviceYears < 2015) {
            System.out.println(" Установите облегченную версию для IOS по ссылке");
        }
        if (clientOS == 1 && clientDeviceYears >= 2015) {
            System.out.println(" Установите версию приложения для Android по ссылке ");
        } else if (clientOS == 1 && clientDeviceYears < 2015) {
            System.out.println(" Установите облегченную версию для Android по ссылке ");
        }
    }
    // метод к заданию 3
    public static int determinateTheDistance(int deliveryDistance) {
        int timeDeliveryOne = 1;
        int timeDeliveryTwo = timeDeliveryOne + 1;
        int timeDeliveryThree = timeDeliveryTwo + 1;

        if (deliveryDistance > 100) {
            return 0;
        }
        if (deliveryDistance <= 20) {
            return timeDeliveryOne;
        }
        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            return timeDeliveryTwo;
        } else {
            return timeDeliveryThree;
        }
    }


    public static void main(String[] args) {

        System.out.println(" Задание №1 ");

        int year = 1999;
        checkYear(year);
        System.out.println(" -------------- ");


        System.out.println(" Задание №2 ");
        int clientOS = 1;
        int clientDeviceYears = 2013;
        checkClientDeviceYear(clientDeviceYears, clientOS);
        System.out.println(" -------------- ");

        System.out.println(" Задание №3 ");

        int deliveryDistance = 90;
        int daysNeeded = determinateTheDistance(deliveryDistance);
        System.out.println(" Потребуется дней " + daysNeeded);
    }
}



