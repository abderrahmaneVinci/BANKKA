package bmce

import java.util.Date;

class Client {

	int Num_compte
	String Nom
	String Prenom
	String Adresse
	String Mail
	int Tel
	Date Date_naissance
	int Code_postale
	String Agence
	String Ville
	Float Solde
	
	static constraints = {
		 Num_compte(nullable: true)
		 Nom(nullable: true)
		 Prenom(nullable: true)
		 Adresse(nullable: true)
		 Mail(nullable: true)
		 Tel(nullable: true)
		 Date_naissance(nullable: true)
		 Code_postale(nullable: true)
		 Agence(nullable: true)
		 Ville(nullable: true)
		 Solde(nullable: true)
	}
	
	
	
	
}