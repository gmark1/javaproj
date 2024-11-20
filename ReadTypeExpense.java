import java.util.*;
import java.io.*;
public class ReadTypeExpense {
    list_typeExpense ltexp = new list_typeExpense();

    public void ReadTexp(){
        BufferedReader reader = null;
        String line;
		System.out.println("\n >>>>>>> Adding Objects (Types Of Expenses) from File to List ...");
        try{
            reader = new BufferedReader(new FileReader(new File("EXPENSE_TYPE_LIST.txt")));
            line = reader.readLine();
            while (line != null) {
                if (line.trim().toLowerCase().equals("typeexpense")) {
                    line = reader.readLine();
                    if (line.trim().equals("{")) {
                        line = reader.readLine();
                        if (line.trim().toLowerCase().substring(5).trim().equals("1")){
                            ExpensesA texp1=new ExpensesA();
                            if (line.trim().toLowerCase().startsWith("type"))                           
                                texp1.setType(Integer.parseInt(line.substring(5).trim()));
                            line = reader.readLine();
                            if (line.trim().toLowerCase().startsWith("code"))
                                texp1.setCode(Integer.parseInt(line.substring(5).trim()));   
                            line = reader.readLine();
                            if (line.trim().toLowerCase().startsWith("description"))
                                texp1.setDescription(line.substring(12).trim());
                            line = reader.readLine();
                            if (line.trim().toLowerCase().startsWith("value of refund per measure"))
                                texp1.setRefundPer(Double.parseDouble(line.substring(28).trim()));
                            line = reader.readLine();
                            if (line.trim().toLowerCase().startsWith("measure"))
                                texp1.setMeasure(line.substring(8).trim());
                            line = reader.readLine();
                            if (line.trim().toLowerCase().startsWith("maxrefund"))
                                texp1.setMaxrefund(Double.parseDouble(line.substring(10).trim()));
                            line = reader.readLine();
                        
                            if (line.trim().equals("}"))
                                ltexp.addTypeExpense(texp1);}
                        else
                           {ExpensesB texp2=new ExpensesB();
                            if (line.trim().toLowerCase().startsWith("type"))                           
                                texp2.setType(Integer.parseInt(line.substring(5).trim()));
                            line = reader.readLine();
                            if (line.trim().toLowerCase().startsWith("code"))
                                texp2.setCode(Integer.parseInt(line.substring(5).trim()));   
                            line = reader.readLine();
                            if (line.trim().toLowerCase().startsWith("description"))
                                texp2.setDescription(line.substring(12).trim());
                            line = reader.readLine();
                            if (line.trim().toLowerCase().startsWith("refund percentage"))
                                texp2.setPercentage(Double.parseDouble(line.substring(18).trim()));
                            line = reader.readLine();
                            if (line.trim().toLowerCase().startsWith("maxrefund"))
                                texp2.setMaxrefund(Double.parseDouble(line.substring(10).trim()));
                            line = reader.readLine();
                        
                            if (line.trim().equals("}"))
                                ltexp.addTypeExpense(texp2);}

                        
                        
                    }   
                }
                line = reader.readLine();
            }
            reader.close();
        }
        catch (IOException e) {
            System.out.println	("Error reading line ...");
		}
    }
    public void PrintList (){
		System.out.println("\n >>>>>>> Printing List... \n");
		for (TypeExpense texp:ltexp.texpenses){
			System.out.println(texp);}
	}

    public list_typeExpense getList(){
        return ltexp;
    }
    
}
