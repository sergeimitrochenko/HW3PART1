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
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " можно ездить спокойно");
        }
        System.out.println("Задача №4");
        int years = 17;
        if (years >= 2 && years <= 7) {
            System.out.println("Если возраст человека равен " + years + " то ему нужно ходить в детский сад.");
        }
        if (years >= 7 && years <= 17) {
            System.out.println("Если возраст человека равен " + years + " то ему нужно ходить в школу.");
        }
        if (years >= 18 && years <= 24) {
            System.out.println("Если возраст человека равен " + years + " то ему нужно ходить в университет.");
        }
        if (years >= 25) {
            System.out.println("Если возраст человека равен " + years + " то ему нужно ходить на работу.");
        }
        System.out.println("task 5");
        int old = 8;
        if (old < 5) {
            System.out.println("Если возраст ребенка равен " + old + " то ему нельзя кататься на аттракционе.");
        }
        if (old > 5 && old < 14) {
            System.out.println("Если возраст ребенка равен " + old + " то ему можно кататься на аттракционе в сопровождении взрослого.");
        }
        if (old > 14) {
            System.out.println("Если возраст ребенка равен " + old + " то ему можно кататься на аттракционе без сопровождения взрослого");
        }
        System.out.println("Задача № 6");
        int placeSitting = 60;
        int place = 102;
        int people = 82;
        if (people < placeSitting){
            System.out.println("В вагоне имеется сидячее место");
        }
        else if (people > placeSitting && people < place){
            System.out.println("В вагоне имеется стоячее место");
        }
        else {
            System.out.println("В вагоне нет свободных мест");
        }
        System.out.println("task 7");
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three){
            System.out.println(one);
        }
        else if (two > one && two > three){
            System.out.println(two);
        }
        else{
            System.out.println(three);
        }
    }
}