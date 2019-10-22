public class Main {
/*  Создать Абстрактный класс с 2мя абстрактными методами (метод1, метод2),
3мя полями (поле1, поле2, поле3). Добавить getter-ы b setter-ы.
 Наследовать 2 дочерних класса от вашего абстрактного класса.
 В Main классе создать метод printInfo(XXXXXX obj), который бы принимал любой из ваших дочерних классов
  в качестве входного параметра и распечатывал бы всю информацию по полям поле1, поле2, поле3
  а так же вызывал бы методы метод1 и метод2.*/
    public static void main(String[] args) {

Cabbage cabbage = new Cabbage();
cabbage.setColour("White");
cabbage.setSize(15);
cabbage.setType("Koreya");
cabbage.Tasted1();
cabbage.Tasted2();

printInfo(cabbage);


Tomato tomato = new Tomato();
tomato.setColour("Red");
tomato.setSize(20);
tomato.setType("Chili");
tomato.Tasted1();
tomato.Tasted2();
printInfo(tomato);


    }




public static void printInfo(Vegetable vegetable) {
    System.out.println(vegetable.getColour() +  " " + vegetable.getType()+   " " + vegetable.getSize());
}



}
