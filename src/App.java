public class App {
    public static void main(String[] args) throws Exception {
        Array numbers = new Array(3);
        numbers.Insert(10);
        numbers.Insert(20);
        numbers.Insert(30);
        numbers.Insert(40);

        System.out.println(numbers.IndexOf(50));
        numbers.Print();

    }
}
