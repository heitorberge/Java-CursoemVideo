package cursoemvideo.calculandoaidade;
import java.util.Scanner;
public class CalculandoAidade {
    public static void main(String[] args) {
        System.out.println("_________________________________________________________________");
        System.out.println("PENSADOR DE IDADES | O ADIVINHADOR DE IDADES");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ola!Eu sou o pensador de Idades!");
        System.out.println("Eu sou o Genio Da Idade!");
        System.out.println("Eu posso adivnhar sua Idade Apenas com Apenas Algumas perguntas!");
        System.out.println("Deseja Participar?");
        System.out.println("[1]SIM");
        System.out.println("[2]NAO");
        int resposta = teclado.nextInt();
        if (resposta == 1 ) {
            System.out.println("Eba Vamos Brincar!!!");
        } else {
            System.out.println("To nem ai, Voce vai participar Mesmo Assim");
        }
        System.out.println("Primeira Pergunta, Oque voce e?Qual o seu Sexo?");
        String Sexo = teclado.next();
        System.out.println("INTERESSANTE!Voce e UM/UMA " + Sexo + "!");
        System.out.println("Segunda Pergunta Em que ano voce Nasceu?");
        int nasc = teclado.nextInt();
        System.out.println("INTERESSANTE!Voce Nasceu em " + nasc);
        System.out.println("EITA!Eu Esqueci meu Calendario!Em que Ano Estamos??");
        int AnoAt = teclado.nextInt();
        int Idade = Math.abs(nasc - AnoAt);
        System.out.println("Entao voce e Um/Uma " + Sexo + " Com " + Idade + " Anos Ne?");
        System.out.println("Acertei?");
        System.out.println("[1]Sim");
        System.out.println("[2]Nao");
        resposta = teclado.nextInt();
        if (resposta == 1) {
            System.out.println("SABIA!Meus Dados nunca Falham");
            if (Idade >= 18) {
                System.out.println("Voce Trabalha?Voce tem mais de 18 anos.");
                System.out.println("[1] Sim");
                System.out.println("[2] Nao");
                resposta = teclado.nextInt();
                if (resposta == 1) {
                    System.out.println("Voce e Uma Pessoa Responsavel!");
                } else {
                    System.out.println("Pensando Bem... Acho que voce ta Na Idade de Procurar Trabalho.");
                }
            } else if (Idade < 18 && Idade >= 1) {
                System.out.println("Entao voce e Uma Crianca ou Adolescente?Eu so sei que voce Tem Menos de 18 Anos.");
                System.out.println("[1]Sou uma Crianca!");
                System.out.println("[2]Sou um Adolescente.");
                resposta = teclado.nextInt();
                if (resposta == 1) {
                        System.out.println("E Bom ser Crianca ne?");
                        System.out.println("Voce Quer ser oque Quando Crescer?");
                        String EmpregoC = teclado.next();
                        System.out.println("SERIO!Nao Sabia que voce queria ser Um/Uma " + EmpregoC);
                } else {
                    System.out.println("Acho que voce ta1 Na Idade de Saber oque voce quer ser quando Crescer.Oque voce quer ser Quando for Adulto?");
                    String EmpregoA = teclado.next();
                    System.out.println("QUE LEGAL!Nao Sabia que voce queria ser Um/Uma " + EmpregoA);
                }
            } else if (Idade >= 50) {
               System.out.println("O Senhor Ou Senhora Deve ter passado por Bastantes Aventuras Quando Crianca!");
            } else if (Idade >= 100) { 
                System.out.println("Uau, você já viveu mais que um dinossauro!");
            } else if (Idade >= 1000) {
                System.out.println("Você Acha Que eu Vou Acreditar que você Tem Mais De 1000 Anos?");
            } else if (Idade <= 0) {
                System.out.println("PERAI!Nunca conheci um bebe Moderno que sabe digitar!");
            }
        } else {
            System.out.println("OPA!Voce Deve Ter Respondido Errado Alguma Pergunta");
        }
        System.out.println("_________________________________________________________________");
        System.out.println("INFORMACOES DO JOGADOR | NUMERO DE PONTOS POR TER JOGADO");
        System.out.println("NOME DO JOGADOR:");
        String Nome = teclado.next();
        System.out.println("IDADE DO JOGADOR:" + Idade);
        int Pontos = (int) (Math.random() * 1000) + 1;
        if (Idade < 18 && Idade > 0) {
            Pontos = Pontos / Idade;
        } else if (Idade <= 0) {
            Pontos = 999;
        } else if (Idade >= 100) {
            Pontos = 100 * resposta;
        } else if (Pontos < 100 && Pontos > 50) {
            Pontos = Pontos * 15;
        } else {
             Pontos = Pontos / Pontos;    
        }
        System.out.println("QUANTIDADE DE PONTOS POR TER JOGADO :" + Pontos);
        System.out.println("_________________________________________________________________");
    }
}