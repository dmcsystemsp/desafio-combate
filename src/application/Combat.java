package application;

import java.util.Scanner;

import entities.Champion;

public class Combat {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite os dados do primeiro campeão: ");
		System.out.print("Nome: ");
		String name = sc.nextLine();

		System.out.print("Vida inicial: ");
		int life = sc.nextInt();
		sc.nextLine();

		System.out.print("Ataque: ");
		int attack = sc.nextInt();
		sc.nextLine();

		System.out.print("Armadura: ");
		int armor = sc.nextInt();
		sc.nextLine();

		Champion cA = new Champion(name, life, attack, armor);
		cA.champion(name, life, attack, armor);
		
		System.out.println();
		System.out.println("Digite os dados do segundo campeão: ");
		System.out.print("Nome: ");
		name = sc.nextLine();

		System.out.print("Vida inicial: ");
		life = sc.nextInt();
		sc.nextLine();

		System.out.print("Ataque: ");
		attack = sc.nextInt();
		sc.nextLine();

		System.out.print("Armadura: ");
		armor = sc.nextInt();
		sc.nextLine();
		Champion cB = new Champion(name, life, attack, armor);
		cB.champion(name, life, attack, armor);
		
		System.out.println();
		System.out.print("Quantos turnos você deseja executar? ");
		int bout = sc.nextInt();
		
		for(int i=1; i<=bout; i++) {
			System.out.println();
			System.out.println("Resultado do turno "+i+":");
			cA.takeDemage(cB);
			System.out.println(cA.status());
			cB.takeDemage(cA);
			System.out.println(cB.status());
			if(cA.getLife() == 0) {
				break;
			}
			if(cB.getLife() == 0) {
				break;
			}
		}
		System.out.println();
		System.out.println("FIM DE COMBATE");
		
		

		sc.close();

	}

}
