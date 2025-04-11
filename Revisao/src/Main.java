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

    public static void vendedor() {
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

        int[] cod = {1001, 1324, 6548, 987, 7623};
        float[] valor = {5.32f, 6.45f, 2.37f, 5.32f, 6.45f};
        int qtd, codigoEntrada;
        float total = 0;

        System.out.println("Qual item comprou?(digite o cod):");
        codigoEntrada = scanner.nextInt();
        System.out.println("Qual a quantidade comprada? (digite):");
        qtd = scanner.nextInt();

        boolean encotrado = false;
        for (int i = 0; i < cod.length; i++) {
            if (cod[i] == codigoEntrada) {
                total = qtd * valor[i];
                encotrado = true;
                break;
            }
        }
        if (encotrado) {
            System.out.println("O preço total do produto é " + total);
        } else {
            System.out.println("Não encotrado");
        }

    } //Exercicio 2

    public static void piloto() {
        //Link do exercicio:
        //https://olimpiada.ic.unicamp.br/pratique/pj/2020/f1/piloto/

//        Piloto Automático
//        Uma grande fábrica de carros elétricos está realizando melhorias no sistema
//        de piloto automático e precisa da sua ajuda para implementar um programa que decida
//        se um carro B, que está trafegando no meio de dois carros A e C, precisa acelerar, desacelerar ou manter
//        a velocidade atual. Os carros são iguais e os sensores do piloto automático vão fornecer, como entrada, a
//        posição atual da traseira dos três carros. Veja um exemplo na figura.
//
//                O carro B precisa ser acelerado se a distância da sua traseira para a traseira do carro A for menor
//                do que a distância da sua traseira para a traseira do carro C. Se for maior, ele precisa ser desacelerado.
//                Se for igual, precisa manter a velocidade atual. Quer dizer,
//                o carro B precisa ser acelerado se (B-A) < (C-B), desacelerado se (B-A) > (C-B) e manter a velocidade se (B-A) for igual a (C-B).
//
//                Entrada
//        A primeira linha da entrada contém um inteiro A. A segunda linha da entrada contém um inteiro B.
//        A terceira linha da entrada contém um inteiro C. Os três inteiros representam as posições atuais das traseiras dos carros A, B e C, respectivamente.
//
//        Saída
//        Seu programa deve imprimir uma linha contendo um inteiro: 1 se o carro B precisa acelerar; -1 se precisa desacelerar; ou 0 se precisa manter a velocidade atual.
//
//        Restrições
//        0 ≤ A < B < C ≤ 500

        int a, b, c; // represetam posição do carro
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        if ((b - a) < (c - b)) {
            System.out.println(1);
        } else if ((b - a) > (c - b)) {
            System.out.println(-1);
        } else {
            System.out.println(0);
        }
    }

    public static void cifraDaNlogônia() {
        //link: https://olimpiada.ic.unicamp.br/pratique/p2/2021/f1/cifra/
        String consoante = "bcdfghjklmnpqrstvz";
        String vogal_mais_prox = "aaeeeiiiiooooouuuuu";
        String prox_consoante = "cdfghjklmnpqrstvxzz";
        //Fiz na mao pq ia complicar muito fazer um milhao de if pra isso

        String palavra, cifra;
        cifra = "";
        palavra = scanner.next();
        for (String letra in palavra){

        }

    }
}
