import java.util.*;



import java.io.*;
public class ReadMoves {
    list_Moves lmov=new list_Moves();
    ReadEmployee readEmp=new ReadEmployee();
    list_Employees emplist=readEmp.getListEmp();


    
    public void ReadMov(list_Employees lemp){
        BufferedReader reader = null;
        String line;
        Employee emp1 = null;
		System.out.println("\n >>>>>>> Adding Objects (Moves) from File to List ...");
        try{
            reader = new BufferedReader(new FileReader("TRN_LIST.txt"));
            line = reader.readLine();
            while (line != null) {
                if (line.trim().equals("Move")) {
                    line = reader.readLine();
                    if (line.trim().equals("{")) {
                        line = reader.readLine();
                        if (line.trim().toLowerCase().startsWith("moves1")) {
                            if (line.trim().substring(7).trim().equals("advance")) {
                                advance adv=new advance();
                                line = reader.readLine();
                                if (line.trim().toLowerCase().startsWith("employee_code"))
                                    emp1 = lemp.employees.get(Integer.parseInt(line.substring(13).trim()));
							        adv.setem(emp1);
							        adv.em.setCode(Integer.parseInt(line.substring(13).trim()));
                                line = reader.readLine();
                                if (line.trim().toLowerCase().startsWith("type"))                           
                                    adv.setType(line.substring(5).trim());
                                line = reader.readLine();    
                                if (line.trim().toLowerCase().startsWith("val"))
                                    adv.setValue(Double.parseDouble(line.substring(4).trim()));
                                line = reader.readLine();
                                if (line.trim().equals("}"))
                                    lmov.addMove(adv);  
                                    emp1.movesEmp.add(adv);  
                            }
                            else if (line.trim().substring(7).trim().equals("refund")) {
                                refund ref=new refund();
                                line = reader.readLine();
                                if (line.trim().toLowerCase().startsWith("employee_code"))
                                    emp1 = lemp.employees.get(Integer.parseInt(line.substring(13).trim()));
							        ref.setem(emp1);
							        ref.em.setCode(Integer.parseInt(line.substring(13).trim()));
                                line = reader.readLine();
                                if (line.trim().toLowerCase().startsWith("type"))                           
                                    ref.setType(line.substring(5).trim());
                                line = reader.readLine();    
                                if (line.trim().toLowerCase().startsWith("val"))
                                    ref.setValue(Double.parseDouble(line.substring(4).trim()));
                                line = reader.readLine();
                                if (line.trim().equals("}"))
                                    lmov.addMove(ref); 
                                    emp1.movesEmp.add(ref);    
                            }
                            else if (line.trim().substring(7).trim().toLowerCase().equals("difference")) {
                                difference dif=new difference();
                                line = reader.readLine();
                                if (line.trim().toLowerCase().startsWith("employee_code"))
                                    emp1 = lemp.employees.get(Integer.parseInt(line.substring(13).trim()));
                                    dif.setem(emp1);
                                    dif.em.setCode(Integer.parseInt(line.substring(13).trim()));
                                line = reader.readLine();
                                if (line.trim().toLowerCase().startsWith("type"))                           
                                    dif.setType(line.substring(5).trim());
                                line = reader.readLine();    
                                if (line.trim().toLowerCase().startsWith("val"))
                                    dif.setValue(Double.parseDouble(line.substring(4).trim()));
                                line = reader.readLine();
                                if (line.trim().equals("}"))
                                    lmov.addMove(dif);
                                    emp1.movesEmp.add(dif);     
                            }        
                        }
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
		for (moves1 move:lmov.Move)
			System.out.println(move);
	}

    public list_Moves getList(){
        return lmov;
    }
    
}

    

