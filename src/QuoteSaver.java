import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ben on 9/18/2014.
 *
 * Reads a list of quotes from a text file and save it as an ArrayList in quotes.qu
 */
public class QuoteSaver {

    public static void main(String [] args){
        ArrayList<String> quotesList = new ArrayList<String>();
        try{
            BufferedReader br = new BufferedReader(new FileReader("quotes.txt"));
            FileOutputStream out = new FileOutputStream("Quotes.qu");
            ObjectOutputStream oout = new ObjectOutputStream(out);
            String line;
            while ((line = br.readLine()) != null) {
                line = line.trim();
                if (!line.equals("")){

                    quotesList.add(line);

                }
                else{
                    continue;
                }

                System.out.println(line);

            }

            oout.writeObject(quotesList);
            br.close();
            oout.close();




        }catch(Exception e){
            System.out.println("Error reading quotes file:" + e);
        }


    }


}
