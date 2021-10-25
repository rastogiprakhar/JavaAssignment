package Advance.AdvQues5;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file=new File("/home/knoldus/IdeaProjects/Assignment/src/AQues5/test.txt");
        BufferedReader br=new BufferedReader(new FileReader(file));
        String st;
        int lines=0,words=0,characters=0;
        while((st=br.readLine())!=null)
        {
            characters+=st.length();
            String[] word=st.split("\\s");
            words+=word.length;
            lines++;
        }
        System.out.println("Line = "+lines+"\nWords = "+words+"\nCharacters = "+characters);
    }
}
