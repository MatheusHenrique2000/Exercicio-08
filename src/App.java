import java.util.Scanner;

public class App {
    public static void main(String args []) {
        // Requisito 1 Perguntar quanto você ganha por horas e o numero de horas trabalhadas no mês
        Scanner sc = new Scanner(System.in);
        // pedir em metros
        System.out.print("Entre com o seu valor hora: ");
        int valor_hora = sc.nextInt();
        System.out.println("");
        System.out.print("Entre com a qtd de horas mês: ");
        int horas_mes = sc.nextInt();
        sc.close();

        //Requisito 2 calcular a area do quadrado
        int salario_mes = valor_hora * horas_mes;
        System.out.println("valor do seu salario mês R$: " + salario_mes);
        
    }
}