package part5.Ex6_ReverseOverMethod;

// Создайте класс Dog с перегруженным методом bark(). Метод должен быть
// перегружен для разных примитивных типовданных с целью вывода сообщений
// о лае, завывании, поскуливании и т.п. в зависимости от версии
// перегруженного метода. Напишите метод main(), вызывающий все версиии.
// Измените упражнение так, чтобы два перегруженных метода принимали два
// аргумента (разных типов) и отличались только порядком их следованияв списке аргументов.

public class Ex6 {
    static class Dog {

        void bark(String str, int num) {
            System.out.println("Вой");
        }

        void bark(int num, String str) {
            System.out.println("Поскуливание");
        }
    }

    public static void main(String[] args) {
        new Dog().bark(1, "q");
        new Dog().bark("q", 1);
    }
}
