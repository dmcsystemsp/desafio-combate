package entities;

public class Champion {

	private String name;
	private int life;
	private int attack;
	private int armor;

	public Champion(String name, int life, int attack, int armor) {
		this.name = name;
		this.life = life;
		this.attack = attack;
		this.armor = armor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public int getAttack() {
		return attack;
	}

	public String toString() {
		return name;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}
	
	public void champion(String name, int life, int damage, int armor) {
		this.name = name;
		this.life = life;
		this.attack = damage;
		this.armor = armor;
	}
	
	public void takeDemage(Champion other) {
		if(this.armor >= other.attack) {
			this.life -=1;
		}else {
			this.life = getLife() - (other.attack - getArmor());
		}
		if(this.life < 0) {
			this.life = 0;
		}
	}
	
	public String status() {
		String nome = this.name;
		int idade = this.life;
		if(life > 0) {
			return nome
					+ " : "
					+ idade
					+ " de vida";
		}else {
			return nome
					+ " : "
					+ idade
					+ " de vida (morreu)";
		}
		
	}
}
