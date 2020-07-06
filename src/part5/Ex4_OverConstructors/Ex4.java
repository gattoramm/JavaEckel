package part5.Ex4_OverConstructors;

// Создайте класс с конструктором по умолчанию (без параметров), который выводит
// на экран сообщение. Добавьте перегруженный конструктор, принимающий в качестве
// параметра строку (String) и расечатывающийее вместе с сообщением.


public class Ex4 {
    static class SomeStr {
        SomeStr() {
            System.out.println("Hello!");
        }

        SomeStr(String str) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        SomeStr str1 = new SomeStr();
        SomeStr str2 = new SomeStr("World!");
    }
}