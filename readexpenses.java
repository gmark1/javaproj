import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileReader;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.lang.model.util.ElementScanner14;

class readexpenses {

	public list_Expenses lexp = new list_Expenses();

	public void ReadExp(list_Employees lemp){
		
		BufferedReader reader = null;
		Dapani expense = null;
        String line;
		//Employee emp1 = null;
		System.out.println("\n >>>>>>> Adding Objects (Dapani) from File to List ...");
        try {
			reader = new BufferedReader(new FileReader(new File("expenses.txt")));
            line = reader.readLine();
			Employee emp1 = null;
            while (line != null) {
				//if (line != null){
				if (line.trim().toLowerCase().equals("dapani")) {
					expense = new Dapani();
					line = reader.readLine();
					if (line.trim().equals("{")) {
						line = reader.readLine();
						if (line.trim().toLowerCase().startsWith("code1 ")){
							emp1 = lemp.employees.get(Integer.parseInt(line.substring(5).trim()));
							expense.setem(emp1);
							expense.em.setCode(Integer.parseInt(line.substring(5).trim()));
						}
						line = reader.readLine();
						if (line.trim().toLowerCase().startsWith("type"))
							expense.settype(Integer.parseInt(line.substring(5).trim()));
						line = reader.readLine();
						if (line.trim().toLowerCase().startsWith("code"))
							expense.setcode(Integer.parseInt(line.substring(5).trim()));
						line = reader.readLine();
						if (line.trim().toLowerCase().startsWith("quantity"))
							expense.setquantity(Double.parseDouble(line.substring(9).trim()));
						line = reader.readLine();
						if (line.trim().toLowerCase().startsWith("value"))
							expense.setvalue(Double.parseDouble(line.substring(6).trim()));
						line = reader.readLine();
						if (line.trim().toLowerCase().startsWith("maxrefund"))
							expense.setmaxrefund(Double.parseDouble(line.substring(10).trim()));
						line = reader.readLine();
						if (line.trim().toLowerCase().startsWith("description"))
							expense.setdescription(line.substring(12).trim());
						line = reader.readLine();
						if (line.trim().toLowerCase().startsWith("refundper"))
							expense.setrefundper(Double.parseDouble(line.substring(10).trim()));
						line = reader.readLine();
						
					}
					if (line.trim().equals("}"))
                        lexp.addExpense(expense);
						emp1.expensesEmp.add(expense);
				
				}
				line = reader.readLine();
			
			}
			reader.close();
		
		
            
		//line = reader.readLine();
		
		}
	
                

		catch (IOException e) {
            System.out.println	("Error reading line ...");
		}
	
	} 
	public void PrintList (){
		System.out.println("\n >>>>>>> Printing List... \n");
		for (Dapani expense:lexp.expenses)
			System.out.println(expense);
	} 

    public list_Expenses getListExp(){
        return lexp;
    }
}