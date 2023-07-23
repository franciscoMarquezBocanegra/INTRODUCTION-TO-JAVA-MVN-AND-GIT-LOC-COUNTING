package edu.escuelaing.arsw;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
* Clase que lee el archivo y cuenta las lineas de este mismo.
*
*/
public class lineCounter {

    private long lNumeroLineas = 0;
    
    /*
    * Metodo para leer el archivo y realizar la validacion correspondiente
    * @param extension que puede ser "phy" o "loc"
    * @param file que es el archivo en ceustion
    */
    public void readFile(String extension, FileReader file) throws IOException {
        String sCadena = null;
        BufferedReader bf = new BufferedReader(file);
        while ((sCadena = bf.readLine()) != null) {
            if (extension.equals("phy")) {
                count(sCadena);
            }
            if (extension.equals("loc") && (!commentLine(sCadena))) {
                count(sCadena);
            }
        }
    }

    /*
     * Metodo para aumentar la variable al contar las lineas
     * @param scadena es las lineas de codigo del archivo
     */
    public void count(String scadena) {
        lNumeroLineas++;
    }

    /*
     * Metodo que retorna el numero de lineas
     * @return lNumeriLineas que es la variable en donde se guarda el total de lineas
     */
    public long getNumLineas() {
        return lNumeroLineas;
    }

    /*
     * Metodo para verificar si la linea es un comentario o esta vacia
     * @param scadena es las lineas de codigo del archivo
     * @return false en caso de que no sea comentario o este vacio o true en caso contrario
     */
    public boolean commentLine(String scadena){
        boolean comment = false;
        if (scadena.contains("/*") || scadena.contains("/**") || scadena.contains("*/") || scadena.contains("//") || scadena.isBlank()) {
            comment = true;
        }
        return comment;
    }
}