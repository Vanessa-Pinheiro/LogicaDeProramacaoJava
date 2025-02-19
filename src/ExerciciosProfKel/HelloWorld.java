package ExerciciosProfKel;

public class HelloWorld {
    public static void main(String[] args) {
        //Criar uma função com o nome helloWorld que retorne a frase Hello World!
        String message = getHelloWorldmessage();
        System.out.println(message);
        
    }

    private static String getHelloWorldmessage() {
        return "Hello World!";
    }

}
