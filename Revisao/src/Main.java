import java.util.Scanner;
//https://www.inf.pucrs.br/~pinho/LaproI/Exercicios/SeqDecisao/lista1.htm

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

    }
    public static void dois_Pontos() {
        //Construa um algoritmo que, tendo como dados de entrada
        // dois pontos quaisquer no plano, P(x1,y1) e P(x2,y2),
        float x1 = 1, x2 = 1, y1 = 1, y2 = 1, d;

        System.out.println("Digite o ponto x1:");
        x1 = scanner.nextFloat();
        System.out.println("Digite o ponto y1:");
        y1 = scanner.nextFloat();
        System.out.println("Digite o ponto x2:");
        x2 = scanner.nextFloat();
        System.out.println("Digite o ponto y2:");
        y2 = scanner.nextFloat();

        d = (float) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("A distancia entre os pontos é: " + d);
    } //Exercicio 1
    public  static void vendedor (){
        //Um vendedor necessita de um algoritmo
        // que calcule o preço total devido por um cliente.
        // O algoritmo deve receber o código de um produto
        // e a quantidade comprada e calcular o preço total,
        // usando a tabela abaixo:
        //Código do Produto	Preço unitário
        //1001	5,32
        //1324	6,45
        //6548	2,37
        //0987	5,32
        //7623	6,45

        int [] cod = {1001,1324,6548,987,7623};
        float [] valor = {5.32f,6.45f,2.37f,5.32f,6.45f};
        int qtd, codigoEntrada ; float total=0;

        System.out.println("Qual item comprou?(digite o cod):");
        codigoEntrada = scanner.nextInt();
        System.out.println("Qual a quantidade comprada? (digite):");
        qtd = scanner.nextInt();

        boolean encotrado = false;
        for (int i = 0; i < cod.length; i++ ){
            if (cod[i] == codigoEntrada) {
                total = qtd * valor[i];
                encotrado = true;
                break;
            }
        }
        if(encotrado) {
            System.out.println("O preço total do produto é "+ total);
        }else {
            System.out.println("Não encotrado");
        }

    }


}