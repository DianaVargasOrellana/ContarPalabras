import java.io.File;

public class Main {
    public static void main(String[] args){
        File archivo = new File("Palabras.txt");
        ContarPalabras contarPalabras = new ContarPalabras();
        contarPalabras.contar(archivo);
    }
}

