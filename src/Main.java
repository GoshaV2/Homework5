public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        {
            byte clientOS=0;
            if(clientOS==1){
                System.out.println("Установите версию приложения для Android по ссылке");
            }else if(clientOS==0){
                System.out.println("Установите версию приложения для iOS по ссылке");
            }else{
                System.out.println("Выберите другую операционную систему");
            }
        }
        System.out.println("Задание 2");
        {
            byte clientOS=0;
            int clienDeviceYear=2015;
            if(clienDeviceYear>=2015){
                System.out.println("всё норм");
            }else if(clientOS==1){
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }else if(clientOS==0){
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        }
        System.out.println("Задание 3");
        {
            int year=2021;
            boolean leapYearCheck;
            if(year%400==0){
                leapYearCheck=true;
            }else if(year%100==0){
                leapYearCheck=false;
            }else if(year%4==0){
                leapYearCheck=true;
            }else{
                leapYearCheck=false;
            }
            if(leapYearCheck){
                System.out.println(year + " год является високосным");
            }else{
                System.out.println(year + " год не является високосным");
            }
        }
        System.out.println("Задание 4");
        {
            int deliveryDistance = 95;
            if(deliveryDistance<=20){
                System.out.println("Потребуются: сутки");
            }else if(20<deliveryDistance && deliveryDistance<=60){
                System.out.println("Потребуется: 2 суток");
            }else if(60<deliveryDistance && deliveryDistance<=100){
                System.out.println("Потребуется: 3 суток");
            }
        }
        System.out.println("Задание 5");
        {
            int monthNumber = 12;
            switch (monthNumber){
                case 12:
                    System.out.println("Зимний месяц");
                    break;
                case 1:
                    System.out.println("Зимний месяц");
                    break;
                case 2:
                    System.out.println("Зимний месяц");
                    break;
                case 3:
                    System.out.println("Весений месяц");
                    break;
                case 4:
                    System.out.println("Весений месяц");
                    break;
                case 5:
                    System.out.println("Весений месяц");
                    break;
                case 6:
                    System.out.println("Летний месяц");
                    break;
                case 7:
                    System.out.println("Летний месяц");
                    break;
                case 8:
                    System.out.println("Летний месяц");
                    break;
                case 9:
                    System.out.println("Осенний месяц");
                    break;
                case 10:
                    System.out.println("Осенний месяц");
                    break;
                case 11:
                    System.out.println("Осенний месяц");
                    break;
                default:
                    System.out.println("Указан неверный месяц");

            }
        }
    }
}