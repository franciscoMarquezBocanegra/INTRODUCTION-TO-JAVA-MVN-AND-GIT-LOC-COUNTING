/**package edu.escuelaing.arsw;


import java.io.FileReader;
import java.io.IOException;
import edu.escuelaing.arsw.lineCounter;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest 
    extends TestCase
{
    
    public AppTest( String testName )
    {
        super( testName );
    }

    
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    
    public void firstTestFileByCasePhy() throws IOException
    {
        FileReader fr = new FileReader("src/test/java/edu/escuelaing/arsw/prueba.java");
        String extension = "phy";
        lineCounter lc = new lineCounter();
        lc.readFile(extension, fr);
        assertTrue(5 == lc.getNumLineas());
    }

    
    public void secondtTestFileByCasePhy() throws IOException {
        FileReader fr = new FileReader("src/test/java/edu/escuelaing/arsw/prueba1.java");
        String extension = "phy";
        lineCounter lc = new lineCounter();
        lc.readFile(extension, fr);
        System.out.println(lc.getNumLineas());
        assertTrue(12 == lc.getNumLineas());
    }

   
    public void firstTestFileByCaseLoc() throws IOException {
        FileReader fr = new FileReader("src/test/java/edu/escuelaing/arsw/prueba.java");
        String extension = "loc";
        lineCounter lc = new lineCounter();
        lc.readFile(extension, fr);
        System.out.println(lc.getNumLineas());
        assertTrue(4 == lc.getNumLineas());
    }

    
    public void secondTestFileByCaseLoc() throws IOException {
        FileReader fr = new FileReader("src/test/java/edu/escuelaing/arsw/prueba1.java");
        String extension = "loc";
        lineCounter lc = new lineCounter();
        lc.readFile(extension, fr);
        System.out.println(lc.getNumLineas());
        assertTrue(10 == lc.getNumLineas());
    }
    
}*/
