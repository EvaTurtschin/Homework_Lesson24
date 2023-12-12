package homework;

public class Main {
    /* Task 1
    Написать как минимум одну иерархию классов в которой будет один родительский класс
    и два наследника, расширяющих его функционал
     */
    public static void main(String[] args) {

        Dog dog = new Dog();

        Dog dog1 = new Working_Dogs();

        Dog dog2 = new Herding_Dogs();

        Dog dog3 = new Hunting_Dogs();

        dog.feature();
        dog1.feature();
        dog2.feature();
        dog3.feature();


    }
}
