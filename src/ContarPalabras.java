import java.io.*;


public class ContarPalabras {

    public int contar(File path)
    {
      int contador=0;
        try {
            String linea;
            FileReader fr = new FileReader (path);
            BufferedReader br = new BufferedReader(fr);
            int i,j;
            while((linea=br.readLine())!=null) {
                for(i=0;i<linea.length();i++)
                {
                    if(i==0)
                    {
                        if(linea.charAt(i)!=' ')
                        contador++;
                }
                else
                {
                    if(linea.charAt(i-1)==' ')

                        if(linea.charAt(i)!=' ')
                        contador++;

                }
                }
            }

            System.out.println("son "+contador+" palabras");

            fr.close();

        }
        catch(IOException e){
            System.out.println(e);
        }
        return contador;
    }

}