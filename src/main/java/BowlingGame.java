
public class BowlingGame {
	
	// Instanciation d'un tableau de lancers
	private int[] rolls;  
	private int score = 0;
	private int currentRoll = 0; 
	
	// Ajout du nombre de quilles par tour
	public void roll(int numberOfPins) {
		rolls[currentRoll++] = numberOfPins; 
	}
	
	// retourne le tableau 
	public BowlingGame() {
		rolls = new int[21]; 
	} 
	
	public int score() {
		
		int frame = 0; 
		
		// 10 parties
		for (int i = 0; i < 10; i++) {
			
			// Si c'est un spare 
			if (rolls[frame] + rolls[frame+1] == 10) {
				// Bonus du troisième lancer
				score += 10 + rolls[frame+2];
				// J'avance de deux lancers
				frame += 2;
			// Si c'est un strike
			} else if (rolls[frame] == 10) {
				// Bonus du second et du troisième lancer
				score += 10 + rolls[frame+1] + rolls[frame+2];
				// J'avance d'un lancer
				frame++; 
			} else {
				score += rolls[frame] + rolls[frame+1];
				// J'avance de deux lancers
				frame += 2; 
			}
			
		}
		return score; 
		
			
	}
	
	
	
	

}
