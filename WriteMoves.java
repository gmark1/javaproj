import java.io.FileWriter;
import java.io.IOException;

public class WriteMoves {
    public void WriteMove(list_Moves lmov){
        try{
            String text;
            FileWriter newMove = new FileWriter("TRN_LIST.txt");
            for (int i=0; i< lmov.returnsize(); i++){
                newMove.write("Move \n");
                newMove.write("{ \n");
                newMove.write("moves1 ");
                text = String.valueOf(lmov.Move.get(i).getClass());
                text = text.replace("\"", "");
                newMove.write(text);
                newMove.write("\nEMPLOYEE_CODE ");
                text = String.valueOf(lmov.Move.get(i).em.code);
                text = text.replace("\"", "");
                newMove.write(text);
                newMove.write("\nTYPE  ");
                text = String.valueOf(lmov.Move.get(i).perigrafi);
                text = text.replace("\"", "");
                newMove.write(text);
                newMove.write("\nVAL ");
                text = String.valueOf(lmov.Move.get(i).amountOfrefund);
                text = text.replace("\"", "");
                newMove.write(text);
                newMove.write("\n} \n");
            }
            newMove.close();


        }
        catch (IOException e){
            System.out.println("An error occurred.");
        }
    }
}
    

