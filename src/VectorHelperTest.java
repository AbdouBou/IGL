import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.*;
/**
 * Created by HP19 on 17/10/2017.
 */
class VectorHelperTest {
    @Test
    void addVect() {
        VectorHelper test=new VectorHelper();
        test.addVect(5);
        assertTrue("Element n'est pas ajouté",test.getVecteur().get(0) == 5);
    }

    @Test
    void additionVect() {
        VectorHelper test=new VectorHelper();
        test.addVect(5);
        test.addVect(10);
        test.addVect(15);
        test.addVect(20);
        ArrayList<Integer> test1=new ArrayList<>();
        test1.add(1);test1.add(2);test1.add(3);test1.add(4);
        ArrayList<Integer> test2=new ArrayList<>();
        test2.add(1);test2.add(2);test2.add(3);test2.add(4);test2.add(5);
        ArrayList<Integer> res=new ArrayList<>();
        res.add(6);res.add(12);res.add(18);res.add(24);
        ArrayList<Integer> tem=new ArrayList<>();
        try {
            assertEquals("l'addition de meme taille a echoué", true, test.additionVect(test1).equals(res));
        } catch (differentSizeException e) {
            fail();
        }
        try {
            test.additionVect(test2);
        } catch (differentSizeException e) {
        }
    }

    @Test
    void sortVect() {
        VectorHelper test = new VectorHelper();
        test.addVect(5);
        test.addVect(-1);
        test.addVect(0);
        test.addVect(99);
        test.addVect(-30);
        test.addVect(2);
        test.addVect(6);
        ArrayList<Integer> res = new ArrayList<>();
        res.add(-30);
        res.add(-1);
        res.add(0);
        res.add(2);
        res.add(5);
        res.add(6);
        res.add(99);
        test.sortVect();
        assertEquals("Le tri du tableau a echoué", true, test.getVecteur().equals(res));
    }

    @Test
    void reverseVect() {
        VectorHelper test=new VectorHelper();
        test.addVect(5);
        test.addVect(10);
        test.addVect(15);
        test.addVect(20);
        ArrayList<Integer> res = new ArrayList<>();
        res.add(20);
        res.add(15);
        res.add(10);
        res.add(5);
        test.reverseVect();
        assertEquals("Le reverse du tableau a echoué", true, test.getVecteur().equals(res));
    }

    @Test
    void powerVect() {
        VectorHelper test=new VectorHelper();
        test.addVect(5);
        test.addVect(-3);
        test.addVect(8);
        test.addVect(1);
        ArrayList<Integer> res = new ArrayList<>();
        res.add(25);
        res.add(9);
        res.add(64);
        res.add(1);
        test.powerVect(2);
        assertEquals("La puissance du tableau a echoué", true, test.getVecteur().equals(res));
    }

    @Test
    void minMax() {
        VectorHelper test = new VectorHelper();
        test.addVect(5);
        test.addVect(-1);
        test.addVect(0);
        test.addVect(99);
        test.addVect(-30);
        test.addVect(2);
        test.addVect(6);
        test.minMax();
        assertTrue("faux min",test.getMin()==-30);
        assertTrue("faux max",test.getMax()==99);
    }

}