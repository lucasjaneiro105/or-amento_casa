package projetos_java;


import java.text.DecimalFormat;
import java.util.Scanner;

public class contas {

    public static void main(String[] args) {
        // variaveis 
        double gastos, renda, mediaGastos;
        
        // objetos 
        Scanner teclado = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("#0.00");
        
        // entrada 
        System.out.println("Controle de Orçamento Doméstico");
        System.out.print("Renda Mensal:");
        renda = teclado.nextDouble();
        System.out.print("Total de Gastos Mensais:");
        gastos = teclado.nextDouble();
        
        //processamento 
        mediaGastos = gastos / 30; // assume-se que um mês tem 30 dias
        
        //saida 
        System.out.println("Média de Gastos Diários: " + formatador.format(mediaGastos));
        if (mediaGastos <= renda * 0.3) {
            System.out.println("Situação Financeira: Estável");
        } else if (mediaGastos <= renda * 0.5) {
            System.out.println("Situação Financeira: Alerta");
        } else {
            System.out.println("Situação Financeira: Crítica");
        }
        
        teclado.close(); 
    }

}
