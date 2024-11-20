import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

class ReadEmployee{
    public list_Employees lemp = new list_Employees();

    public void ReadEmp(){
        BufferedReader reader = null;
        Employee empl = null;
        String line;

        System.out.println("\n >>>>>>> Adding Objects (Employee) from File to List ...");

        try{
            reader = new BufferedReader(new FileReader(new File("Employee_LIST.txt")));
            line = reader.readLine();
            while (line != null) {
                if (line.trim().equals("Employee")) {
                    empl = new Employee();
                    line = reader.readLine();
                    if (line.trim().equals("{")) {
                        line = reader.readLine();
                        if (line.trim().toLowerCase().startsWith("surname "))                           
                            empl.setSurname(line.substring(11).trim());
                        line = reader.readLine();
                        if (line.trim().toLowerCase().startsWith("name"))
                            empl.setName(line.substring(9).trim());   
                        line = reader.readLine();
                        if (line.trim().toLowerCase().startsWith("maxrefund"))
                            empl.setMaxRef(Double.parseDouble(line.substring(13).trim()));
                        line = reader.readLine();
                        if (line.trim().toLowerCase().startsWith("code"))
                            empl.setCode(Integer.parseInt(line.substring(9).trim()));
                        line = reader.readLine();
                    }
                    if (line.trim().equals("}"))
                        lemp.addEmployee(empl);
                }
                line = reader.readLine();
            }
            reader.close();
        }
        catch (IOException e) {
            System.out.println	("Error reading line ...");
		}
    }//ReadEmp

    public void PrintList (){
		System.out.println("\n >>>>>>> Printing List... \n");
		for (Employee emp:lemp.employees)
			System.out.println(emp);
	} 

    public list_Employees getListEmp(){
        return lemp;
    }

}//ReadEmployee

