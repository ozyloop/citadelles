package modele;


import modele.Personnage;
import modele.Joueur;
import modele.Caracteristiques;
import modele.Quartier;

public class Roi extends Personnage {
  
   
    public Roi(){
       
        super("Roi",4,Caracteristiques.ROI);
    }

    public void utiliserPouvoir(){
        // ne trouve pas la fonction PossedeCouronne(boolean b)
        if(getJoueur()!=null){
        System.out.println("Je prends la couronne");
        getJoueur().setPossedeCouronne(true);
        }
    }

    
    public void percevoirRessourcesSpecifiques(){
        int nbPiece = 0;
        
        if(getJoueur()!=null){
            if(getAssassine()==false){
        for(int i=0;i<8;i++){
            //cette condition pose une erreur dans le test//

           
            if(getJoueur().getCite(i).getType().equals("NOBLE")){
                nbPiece =nbPiece +1;
     
            }
    }
       
        System.out.println(" Vous avez reçu "+ nbPiece +" piece(s)");
        getJoueur().ajouterPieces(nbPiece);
        }
        }
    }
 
}
