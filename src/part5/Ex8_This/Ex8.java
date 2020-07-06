package part5.Ex8_This;

// Создайте классс двумя методами. В первом методе дважды вызовите второй
// метод: один раз без ключевого слова this, а во второй с this - просто
// для того, чтобы убедиться в работоспособности этого синтаксиса; не
// используйте этот способ вызова на практике.

public class Ex8 {
    static class ToThisOrNotToThis {
        public void MethodOne() {
            MethodTwo();
            this.MethodTwo();
        }

        public void MethodTwo() {

        }
    }

    public static void main(String[] args) {
        ToThisOrNotToThis some1 = new ToThisOrNotToThis();
    }
}
