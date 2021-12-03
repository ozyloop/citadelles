package modele;

public class PlateauDeJeu {

	private Personnage[] listePersonnages;
	private Joueur[] listeJoueurs;
	private Pioche pioche;
	private int nombrePersonnages;
	private int nombreJoueurs;


	public PlateauDeJeu() {
		this.listeJoueurs =new Joueur[9];
                this.pioche = new Pioche();
                listePersonnages=new Personnage[9];
                nombrePersonnages =0;
                nombreJoueurs=0;
        }

//erreur normale le temps d'implementer possible null pour attributs personnage
	public void ajouterPersonnage(Personnage nouveau) {
		if(nombrePersonnages<9){
                    if(nouveau.getNom()!= null && nouveau.getRang()!= -1 && nouveau.getCaracteristiques()!= null){
                    this.listePersonnages[this.nombrePersonnages] = nouveau;
                    this.nombrePersonnages=this.nombrePersonnages +1;
                    }
                }
              nouveau.setPlateau(this);
                
	}


	public Personnage getPersonnage(int i) {
		
        if(i>=0 && i<listeJoueurs.length){	
            return listePersonnages[i];
        }
        else{
        return null;
        }
	}


	public void ajouterJoueur(Joueur nouveau) {
		if(nombreJoueurs<9){
                    if(nouveau.getNom()!= null ){
                    listeJoueurs[nombreJoueurs] = nouveau;
                    this.nombreJoueurs= this.nombreJoueurs + 1;
                    }
                }
	}


	public Joueur getJoueur(int i) {
	if(i>=0 && i<listeJoueurs.length){	
            return listeJoueurs[i];
        }
        else{
        return null;
        }
	}


	public int getNombrePersonnages() {
		return this.nombrePersonnages;
	}

        
	public int getNombreJoueurs() {
		return this.nombreJoueurs;
	}


	public Pioche getPioche() {
		return this.pioche;
	}

}