import java.util.Scanner;

//classe Jogo
public class Jokenpo {
    // metodo Placar
    private static int placarJogador = 0;
    private static int placarComputador = 0;
    // metodo Player
    private static int escolhaJogador;
    private static int escolhaComputador;

    //*********************** Main principal ***********************
    public static void main(String[] args) {
        int rodadas = 0;
        // Reiniciar o jogo
        int reiniciar = 1;
        // Scanner de entrada de dados
        Scanner input = new Scanner(System.in);
        while (reiniciar == 1) {
            System.out.println("Quer começar um novo jogo?");
            System.out.println("(1)SIM  (0) NÃO");
            reiniciar = input.nextInt();
        }
    }
    //*********************** Metodos ***********************
    // Verifica o resultado
    public static void verificaResultado() {
    }
    // Verifica o placar
    public static void verificaPlacar() {
    }
    // Rótulo para o jogador
    public static void rotuloJogador(){

    }
    // Reiniciar o placar
    public static void resetaPlacar(){

    }
    }

}