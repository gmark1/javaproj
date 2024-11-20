import java.io.FileWriter;
import java.io.IOException;


public class WriteExpenses {
    
    public void WriteExp(list_Expenses lexp){
        try{
            String text;
            FileWriter myExp = new FileWriter("expenses.txt");
            for (int i=0; i< lexp.returnsize(); i++){
                myExp.write("Dapani \n");
                myExp.write("{ \n");
                myExp.write("code1 ");
                text = String.valueOf(lexp.expenses.get(i).em.code);
                text = text.replace("\"", "");
                myExp.write(text);
                myExp.write("\ntype ");
                text = String.valueOf(lexp.expenses.get(i).type);
                text = text.replace("\"", "");
                myExp.write(text);
                myExp.write("\ncode ");
                text = String.valueOf(lexp.expenses.get(i).code);
                text = text.replace("\"", "");
                myExp.write(text);
                myExp.write("\nquantity ");
                text = String.valueOf(lexp.expenses.get(i).quantity);
                text = text.replace("\"", "");
                myExp.write(text);
                myExp.write("\nvalue ");
                text = String.valueOf(lexp.expenses.get(i).value);
                text = text.replace("\"","" );
                myExp.write(text);
                myExp.write("\nmaxRefund ");
                text = String.valueOf(lexp.expenses.get(i).maxRefund);
                text = text.replace("\"","" );
                myExp.write(text);
                myExp.write("\ndescription ");
                text = lexp.expenses.get(i).description;
                text = text.replace("\"","" );
                myExp.write(text);
                myExp.write("\nRefundPer ");
                text = String.valueOf(lexp.expenses.get(i).x);
                text = text.replace("\"","" );
                myExp.write(text);
                myExp.write("\n} \n");
            }
            myExp.close();


        }
        catch (IOException e){
            System.out.println("An error occurred.");
        }
    }
}
