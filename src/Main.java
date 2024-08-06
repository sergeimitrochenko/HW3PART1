public class Main {
    public static void main(String[] args) {
        System.out.println("И снова здравствуйте,как говорится I will be back!");
        System.out.println("Задача №1");
        int age = 21;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " то он неовершеннолетний");
        }

        System.out.println("Задача № 2");
        int t = 13;
        if (t < 5) {
            System.out.println("На улице " + t + " радусов,наденьте шапку");
        } else {
            System.out.println("На улице " + t + " радусов, не надевайте шапку");
        }
        System.out.println("Задача №3");
        int speed = 55;
        if (speed > 60){
            System.out.println("Если скорость " + speed + " то придется заплатить штраф");
        }else {
            System.out.println("Если скорость " + speed + " можно ездить спокойно");
        }
