/**
 * Created by HP19 on 11/10/2017.
 */
import java.util.ArrayList;


/**
 * 
 * @author abdou Lexus
 * @version 1.0
 */
public class VectorHelper {
    private ArrayList<Integer> vecteur;
    private int max,min;

    /**
     * Creer un vecteur
     */
    public VectorHelper() {
        this.vecteur = new ArrayList<>();
    }
    /**
     * 
     * @param x ajouter un elemnt au tableau
     */
    public void addVect(int x){
        this.vecteur.add(x);
    }

    /**
     * afficher le min et le max d'un vecteur
     */


    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }

    public ArrayList<Integer> getVecteur() {
        return vecteur;
    }

    public void dispalyVect(){
        System.out.println(vecteur);
        System.out.println(max+" "+min);
    }
    /**
     * 
     * @param x le vecteur a additioner avec celui de la classe 
     * @return le tableau qui contient la somme
     * @throws differentSizeException l'exception genere par les taille differentes
     */
    public ArrayList<Integer> additionVect(ArrayList<Integer> x)throws differentSizeException{
        ArrayList<Integer> additionResult=new ArrayList<>();
      
        int i=0;//un compteur pour parcourir le vecteur
        if(x.size()!=this.vecteur.size())throw new differentSizeException();
        else {
            while(i<this.vecteur.size()) {
                additionResult.add(i, x.get(i) + this.vecteur.get(i));
            	i++;
            }
        }
        return additionResult;
    }
    
    /**
     * Trier le tableau 
     */
    public void sortVect(){

        int temp,i,j,size=vecteur.size();
        for (i=0;i<=size-2;i++){

            j = i;
            while ((j>=0)&& vecteur.get(j) > vecteur.get(j+1)) {
                temp = vecteur.get(j);
                vecteur.set(j, vecteur.get(j+1));
                vecteur.set(j+1, temp);
                j = j - 1;

            }
        }

    }
    /**
     * inverser les elements de tableau
     */
    public void reverseVect(){
        int i,temp,size=vecteur.size();
        for (i=0;i<(size / 2);i++){
            temp = vecteur.get(i);
            vecteur.set(i, vecteur.get(size-i-1));
            vecteur.set(size-i-1, temp);
        }
    }
    /**
     * 
     * @param pow la puissance
     */
    public void powerVect(int pow){
        int i,j,temp,res=1,size=vecteur.size();
        for(i=0;i<size;i++){
            temp=vecteur.get(i);
            for (j=1;j<=pow;j++){
                res=temp*res;
            }
            vecteur.set(i,res);
            res=1;
        }

    }
    /**
     * Trouver le max et le min
     */
    public void minMax(){
        if(this.vecteur.size()==0)
            System.out.println("Le vecteur est vide");
        else{
            max=vecteur.get(0);//Initialisation
            min=vecteur.get(0);//Initialisation
            for(int i=1;i<this.vecteur.size();i++){
                if(max<vecteur.get(i))
                    max=vecteur.get(i);
                if(min>vecteur.get(i))
                    min=vecteur.get(i);
            }
        }

    }

}
