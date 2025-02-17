import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        //TODO: Conhecer e importat a classe scanner
        //Criando objeto Scanner, para importar informações através de inputs direto do usuário, utilizando convenção US
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Exibir as mensagens para o nosso usuário
        //Obter pela classe scanner os valores digitados
        //Mostrando inputs para o usuário e armazenando os dados das respostas
        System.out.println("Digite o número da sua conta (4 digitos): ");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o número da sua agência (3 digitos e verificador): ");
        String numeroAgencia = scanner.next();

        System.out.println("Digite o seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Digite o seu sobrenome: ");
        String sobrenomeCliente = scanner.next();

        System.out.println("Informe o seu saldo (Decimal separado por ponto): ");
        double valorSaldo = scanner.nextDouble();

        //Exibir a mensagem conta criada
        //Concatenando os inputs para mostrar a mensagem de conta criada
        System.out.println("Olá " + nomeCliente + " "+ sobrenomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é: "
         + numeroAgencia + ", conta: " + numeroConta + " e seu saldo: " + valorSaldo + " já está disponível para saque.");
    }

}