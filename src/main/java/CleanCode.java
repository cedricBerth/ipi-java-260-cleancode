import java.io.UnsupportedEncodingException;
import java.util.List;

public class CleanCode {
	
	// Exemple 1 : Problème sur les noms
	
	
	public int sommeDeuxNombres(int i, int j) {
		int a = i + j; 
		return a;
	}
	
	public int sommeDeuxNombres1(int nombre1, int nombre2) {
		int sommeDeuxNombres = nombre1 + nombre2; 
		return sommeDeuxNombres;
	}
	
	// Exemple 2 : Problème de factorisation sur la fonction
	
	public int convert(String value){
      if(value == "0"){
            return 0;
      } else if (value == "1"){
            return 1;
      } else if (value == "2"){
            return 2; 
      } // jusqu'à 25 !
      else {
            return -1;
      }
     }
      
      // Toute la fonction précédente aurait pu être factorisé 
      public int convert1(String value) {
    	  if (value.equals("") || value == null) {
    		  return -1; 
    	  }
    	  return Integer.parseInt(value);
      }
      
      // Exemple 3 : Problème avec les commentaires
      
      int calcPTU(int p1, int p2, double p3) throws UnsupportedEncodingException {
    		int v2 = p2 + 7;
//    		if (v2 < 9) {
//    			v2 = 9;
//    		}

    		double v1 = p1*4.12d + p3;
    		String v3 = "" + v2;
    		byte[] v4 = v3.getBytes("UTF-8");
    	// TODO: Si p1 vaut 7, alors la fonction ne retourne pas le
    	// bon résultat, il faudrait corriger ça dans une prochaine version.
    		return 1 + v4.length;
    	}
      
      int calcPTU1(int p1, int p2, double p3) throws UnsupportedEncodingException {
    		Double unNombre = 4.12d; 
    		double v1 = p1 * unNombre + p3;
    	  	int v2 = p2 + 7;
    		String v3 = String.valueOf(v2); 
    		byte[] v4 = v3.getBytes("UTF-8");
    		return 1 + v4.length;
    	}
      
      // Exemple 4 : ne pas indenter son code 
      public String enleveLesAccents(String chaine) {
      String resultat = "";
      char[] tabChar = chaine.toCharArray(); 
      for (int i = 0; i < tabChar.length; i++) {
      char caractere = tabChar[i]; 
      if (caractere == 'é' || caractere == 'è' || caractere == 'ê') {
      caractere = 'e';
      } else if (caractere == 'à') {
      caractere = 'a';
      }
      resultat += caractere;
      }
      return resultat;
      }
      
      public String enleveLesAccents1(String chaine) {
    	  String resultat = "";
    	  char[] tabChar = chaine.toCharArray(); 
    	  for (int i = 0; i < tabChar.length; i++) {
    		  char caractere = tabChar[i]; 
    		  if (caractere == 'é' || caractere == 'è' || caractere == 'ê') {
    			  caractere = 'e';
    		  } else if (caractere == 'à') {
    			  caractere = 'a';
    		  }
    		  resultat += caractere;
    	  }
    	  return resultat;
      }
      
      	

}
