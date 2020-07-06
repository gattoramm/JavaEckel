package part5.Ex9_ThisConstructor;

// Подготовьте класс с двумя (перегруженными) конструкторами. Используя
// ключевое слово this, вызовите второй конструктор из первого.

public class Ex9 {
    static class ThisConstructor {

        String str = "DEFAULT STRING!";
        int someNum = 10;
        public ThisConstructor(int num) {
            System.out.println("Конструктор с параметром int, s = " + num);
        }

        public ThisConstructor(String s) {
            this.someNum = someNum;
            System.out.println("Вызвали конструктор с аргументом int = " + someNum + " внутри конструктора с аргументом String = " + s);
            System.out.println("Конструктор с параметром String, s = " + s);
        }

        ThisConstructor(String s, int num) {
            this(s);
            System.out.println("Вызвали конструктор с аргументом String = " + s + " внутри конструктора с аргументом int = " + num);
            System.out.println("Конструктор с аргументом String = " + s + " и int = " + num);
        }
    }

    public static void main(String[] args) {
        ThisConstructor thisConstr1 = new ThisConstructor(5);
        System.out.println("********************************************");
        ThisConstructor thisConstr2 = new ThisConstructor("World");
        System.out.println("********************************************");
        ThisConstructor thisConstr3 = new ThisConstructor("WWW",3);
    }
}
