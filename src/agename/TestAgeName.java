package agename;
public class TestAgeName{
    
    public static void main(String[] args) {
        String firstName = args [0];
        String lastName = args [1];
        int age = Integer.valueOf(args[2]);
        double height = Double.valueOf(args[3]);

        System.out.println("Seu nome é: " + firstName + " " + lastName);
        System.out.println("Sua idade é: " + age + " anos.");
        System.out.println("Sua altura é: " + height + " m.");
    }

}
