public class hello{
    public static void main(String[] args) {
        final int lung = 0;

        System.out.print("Hello World!");
        System.out.print("I wrote this in GitHub!");

        for (int i = 0; i < Integer.parseInt(args[0]); i++){
            System.out.print("You said to make this text appear this many times!");

        }
        for (int i = 0; i < Integer.parseInt(args[1]); i++){
            System.out.print("You also said to make this text appear this many times");
        }
    }
}
