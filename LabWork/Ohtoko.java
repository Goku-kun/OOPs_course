abstract class Ningen {
        abstract public void eat();
        void display() {
                System.out.println("Hero koroshi Stein.");
        }
}
class Ohtoko extends Ningen {
        public void eat() {
                System.out.println("MUDA MUDA MUDA");
        }
        public static void main(String[] args) {
                Ohtoko kozo = new Ohtoko();
                kozo.eat();
                kozo.display();
        }
}
