package br.com.vainaweb.introducao;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class desafiosVnw {

	public static void main(String[] args) {
		
		
		//DIA 13/11 - MEGA-SENA

		System.out.println("MEGA-SENA DO VAI NA WEB");
		System.out.println("Escolha sete números entre 0 a 100");
		System.out.println("Mas lembre-se: apenas números inteiros!");

		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int numeros[] = { 0, 0, 0, 0, 0, 0, 0 };
		int numerosSort[] = { 0, 0, 0, 0, 0, 0,0 };
		int pontuacao = 0;
		int max = 100;

		for (int i = 0; i < 7; i++) {
			numeros[i] = sc.nextInt();
			numerosSort[i] = rand.nextInt(max); 
				if (numeros[i] == numerosSort[i]) {
					pontuacao += 1;
			}
		}
		switch (pontuacao) {
		case 5:
			System.out.println("Parabéns, você ganhou 10 mil reais!");
			break;
		case 6:
			System.out.println("Parabéns, você ganhou 50 mil reais!");
			break;
		case 7:
			System.out.println("Parabéns, você ganhou 200 mil reais!");
			break;
		default:
			System.err.println("Que pena! Você não conseguiu acertar números suficientes. Os números sorteados foram "
					+ Arrays.toString(numerosSort));
		}

	}

}
