public class App {
    public static void main(String[] args) throws Exception {
        int n1 = 10;
        String res = "";

        if (n1>= 5){
            res = "maior ou igual a 5";
        }else{
            res = "menor que 5";
        }

        System.out.println("Hello, World! "+ n1+ " é "+ res);
    }
}
