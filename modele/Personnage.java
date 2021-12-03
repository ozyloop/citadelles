package modele;

import modele.PlateauDeJeu;
public abstract class Personnage {

	private String nom;
	private int rang;
	private String caracteristiques;
	private Joueur joueur;
	private boolean assassine;
	private boolean vole;
	private PlateauDeJeu plateau;




	public Personnage(String nom, int rang, String caracteristiques) {
		joueur=null;
                assassine=false;
                vole=false;
                this.nom=nom;
                this.rang=rang;
                this.caracteristiques=caracteristiques;
	}
        public Personnage(){
            	joueur=null;
                assassine=false;
                vole=false;
                nom=null;
                rang=-1;
                caracteristiques=null;
        }
        
        public String getNom(){
            return this.nom;
        }
        public int getRang(){
            return this.rang;
        }
        public String getCaracteristiques(){
            return this.caracteristiques;
        }
        public Joueur getJoueur(){
            return this.joueur;
        }
        public boolean getAssassine(){
            return this.assassine;
        }
        public boolean getVole(){
            return this.vole;
        }
        public void setJoueur(Joueur j){
            this.joueur =j;
        }
        public void setVole(){
            this.vole=true;
        }
        public void setAssassine(){
            this.assassine=true;
        }
        
	public void ajouterPieces() {
            if(joueur==null){
	}
            else{
                if(assassine==false){
                    joueur.ajouterPieces(2);
                }
            }
        }
 

	public void ajouterQuartier(Quartier nouveau) {
            if(joueur==null){
	}
            else{
                if(assassine==false){
                    joueur.ajouterQuartierDansMain(nouveau);
                }
            }
        }

        public void construire(Quartier nouveau) {
            if(joueur==null){
	}
            else{
                if(assassine==false){
                    joueur.ajouterQuartierDansCite(nouveau);
                }
            }
        }



	public void reinitialiser() {
		this.joueur=null;
                this.assassine=false;
                this.vole=false;
	}

	public void percevoirRessourcesSpecifiques() {	
            if(joueur==null){
	}
            else{
                if(assassine==false){
                    System.out.println("aucune ressource spécifique");
                }
            }
        }
	

       
	public void setPlateau(PlateauDeJeu nouveau) {
		this.plateau=nouveau;
	}

     
	public PlateauDeJeu getPlateau() {
                return this.plateau;
	}
        public abstract void utiliserPouvoir();
}