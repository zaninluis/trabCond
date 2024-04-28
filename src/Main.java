import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        var nome = sc.nextLine();
        System.out.println("Digite o seu peso: ");
        float peso = sc.nextFloat();
        System.out.println("Digite a sua altura: ");
        float altura = sc.nextFloat();
        sc.nextLine(); // só pra zerar
        System.out.println("Digite seu sexo: ");
        char sexo = sc.nextLine().charAt(0);

        float imc = calculaIMC(peso, altura);
        obterStatus(sexo, imc);

    }

    public static float calculaIMC(float peso, float altura) {
        float imc = peso / (altura * altura);
        return imc;
    }

    public static void obterStatus(char sexo,float imc){
        if(sexo == 'm'){
            if(imc >= 40){
                System.out.println("Obesidade morbida " + imc);
            }
            if(imc >= 30 && imc < 39.9){
                System.out.println("Obesidade moderada " + imc);
            }
            if(imc >= 25 && imc < 29.9){
                System.out.println("Obesidade leve " + imc);
            }
            if(imc >= 20 && imc < 24.9){
                System.out.println("Saudável " + imc);
            }
            if(imc <= 20){
                System.out.println("Magreza " + imc);
            }
        } else if(sexo == 'f'){
            if(imc >= 39){
                System.out.println("Obesidade morbida " + imc);
            }
            if(imc >= 29 && imc < 38.9){
                System.out.println("Obesidade moderada " + imc);
            }
            if(imc >= 24 && imc < 28.9){
                System.out.println("Obesidade leve " + imc);
            }
            if(imc >= 19 && imc < 23.9){
                System.out.println("Saudável " + imc);
            }
            if(imc <= 19){
                System.out.println("Magreza " + imc);
            }
        }
    }
}