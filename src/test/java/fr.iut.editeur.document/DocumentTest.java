package fr.iut.editeur.document;

import junit.framework.TestCase;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class DocumentTest extends TestCase {
    @Test
    private void testRemplacer() {
        Document doc = new Document();
        doc.setTexteDocument("abcdef");
        doc.remplacer(2,3, "X");
        assertTrue( doc.getTexteDocument().equals("aXcdef") );
    }

}