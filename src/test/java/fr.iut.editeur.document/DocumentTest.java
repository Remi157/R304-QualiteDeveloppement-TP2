package fr.iut.editeur.document;

import junit.framework.TestCase;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class DocumentTest extends TestCase {
    @Test
    public final void testRemplacer() {
        Document doc = new Document();
        doc.setTexteDocument("abcdef");
        doc.remplacer(2,3, "X");
        assertEquals(doc.getTexteDocument(), "abXdef");
    }

    @Test
    public final void testAdd() {
        int a, b, res;
        a = 5;
        b = 5;
        res = a + b;
        assertTrue("a et b positif", 5+5 == res);
    }
}