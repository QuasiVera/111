import pack1.Cat;
import pack1.Fox;

public class Main {
    /*
    1.
1.1 Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}. Распечатайте содержимое данного множества.
1.2 Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.  Распечатайте содержимое данного множества.
1.3 Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.  Распечатайте содержимое данного множества.
    * */

    /*
    *
    * */
    public static void main(String[] args) {

        Notebook note1 = new Notebook(8, 512, "Windows 11", "white");
        Cat ca1 = new Cat("Пушок", "Игорь", "белый");
        Fox fox1 = new Fox("Nick", 7, "orange");
        System.out.println(fox1);
        System.out.println(ca1);
        System.out.println(note1);

    }
}