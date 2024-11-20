import java.util.Scanner;
import java.util.ArrayList;

/*************************************************************
 *  Team 70
 *
 *  Student Name:       MARKOPOULOU GEORGIA
 *  Student ID Number:  3200100
 * 
 *  Student Name:       MOURELATOU SARANTIA
 *  Student ID Number:  3200106
 *
 *  Student Name:       FYTALI PANAGIOTA
 *  Student ID Number:  3200215
 *
 *************************************************************/


public class mainApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        boolean end = false;
        int code=4;
        int code1=6;
        int code2 = 16;
        int type;
        String answer,descr,surname,name, measure,k;
        double max_refund_per_empl,maxrefund,value,quantity;
        String perigrafi = "";
        list_Employees lemp = new list_Employees();
        list_typeExpense ltexp = new list_typeExpense();
        list_Expenses lexp=new list_Expenses();
        list_Moves lmov=new list_Moves(); 
        ArrayList <Double> sumrefunds = new ArrayList<Double>();
        double[] sum_person=new double[ltexp.returnsize()];
        //MEROS B ERGASIAS 
        ReadEmployee readEm = new ReadEmployee();
        readEm.ReadEmp();
        readEm.PrintList();
        lemp = readEm.getListEmp();
        readexpenses readex = new readexpenses();
        readex.ReadExp(lemp);
        readex.PrintList();
        lexp = readex.getListExp();
        ReadTypeExpense readTexp=new ReadTypeExpense();
        readTexp.ReadTexp();
        readTexp.PrintList();
        ltexp=readTexp.getList();
        ReadMoves readMove=new ReadMoves();
        readMove.ReadMov(lemp);
        readMove.PrintList();
        lmov=readMove.getList();
        
        


        //gia thn arxikopoihsh poy zhteitai sto trito erothma
        // System.out.println("Give at least 3 type of expenses 1 (The price of refund)");
        // for (int i = 0; i<3; i++){
        //     System.out.print("The description of the expense ");
        //         descr = in.nextLine();
        //         System.out.print("The maximum monthly refund (per employee) ");
        //         max_refund_per_empl = in.nextDouble();
        //         type=1;
        //         System.out.print("Give the price of refund: ");
        //         double refundPer = in.nextDouble();
        //         System.out.print("Give the measure: ");
        //         k = in.nextLine();
        //         measure = in.nextLine();
                    
        //         ExpensesA ExA=new ExpensesA(descr,max_refund_per_empl,refundPer,measure,code1);
        //         code1++;
        //         ltexp.addTypeExpense(ExA);
        //         System.out.println();
                
        // }
        
        // System.out.println("Give at least 3 type of expenses 2 (The percentage of refund)");
        // for (int i = 0; i<3; i++){
        //     System.out.print("The description of the expense ");
        //         descr = in.nextLine();
        //         System.out.print("The maximum monthly refund (per employee) ");
        //         max_refund_per_empl = in.nextDouble();
        //         type=2;
        //         System.out.print("Give the percentage of refund: ");
        //         double per = in.nextDouble();
        //         ExpensesB ExB = new ExpensesB(descr,max_refund_per_empl,per,code1);
        //         code1++;
        //         ltexp.addTypeExpense(ExB);
        //         System.out.println();
        //         k = in.nextLine();
                
                
        // }
        // System.out.println("Give at least 4 employees");
        // for (int i = 0; i < 4; i++){
        //     System.out.print("\nSurname? ");
        //     surname = in.nextLine();
        //     System.out.print("Name? ");
        //     name = in.nextLine();
        //     System.out.print("Max monthly refund percentage (for all type of expenses)? ");
        //     maxrefund = in.nextDouble();
        //     Employee emp = new Employee(surname,name,maxrefund,code);
        //     lemp.addEmployee(emp);
        //     code=code+1;
        //     System.out.print("Give at least 4 expenses of "+surname);
        //     for (int j = 0; j < 4; j++){
        //         ArrayList <Employee> lemp1=lemp.employees;
        //         Employee person1=emp;
        //         System.out.print("\nAdd a new expense for the employee: "+person1.surname);
        //         ArrayList <TypeExpense> ltexp1=ltexp.texpenses;
        //         int texIndex=ltexp.lookUp();
        //         String x = ltexp1.get(texIndex).getClass().getSimpleName();
        //         if (x.equals("ExpensesA")){
        //             System.out.print("\nGive the quantity of the expense: ");
        //             quantity=in.nextDouble();
        //             value=0.0;
        //             type = 1;
        //             ExpensesA joe = (ExpensesA) ltexp1.get(texIndex);
        //             Dapani dap=new Dapani(person1.maxrefund,person1,value,quantity,ltexp1.get(texIndex).description,type,code2,joe.refundPer);
        //             perigrafi = dap.description;
        //             code2++;
        //             lexp.addExpense(dap);
        //             person1.ADDExpensesEmployee(dap);                    
                    
        //             sum_person = person1.sumRefund(ltexp);
        //             for (int m = 0; m <ltexp.returnsize(); m++){
        //                 if (dap.description.equals(ltexp.texpenses.get(m).description)){
        //                    refund ref1 = new refund(person1,person1.CheckfinalRefund(ltexp)[m],dap);
        //                     person1.ADDmovesEmployee(ref1,perigrafi);
        //                     lmov.addMove(ref1);

        //                 }
        //             }  

        //         } else{
        //             System.out.print("\nGive the value of the expense : ");
        //             value=in.nextDouble();
        //             quantity=0;
        //             type = 2;
        //             ExpensesB joe = (ExpensesB) ltexp1.get(texIndex);
        //             Dapani dap=new Dapani(person1.maxrefund,person1,value,quantity,ltexp1.get(texIndex).description,type,code2,joe.percentage);
        //             perigrafi = dap.description;
        //             code2++;
        //             lexp.addExpense(dap);//Prosthetei tin dapani stin lista dapanwn                  
                   
        //             person1.ADDExpensesEmployee(dap);  
        //             sum_person = person1.sumRefund(ltexp);
        //             for (int a = 0; a <ltexp.returnsize(); a++){
        //                 if (dap.description.equals(ltexp.texpenses.get(a).description)){
                            
        //                     refund ref1 = new refund(person1,person1.CheckfinalRefund(ltexp)[a],dap);
        //                     person1.ADDmovesEmployee(ref1,perigrafi);
        //                     lmov.addMove(ref1);
        //                 }
        //             }
                
                    
        //         }  
        //     System.out.println();      

        //     }
        //     System.out.println();
        //     System.out.println("Give at least one downpayment of the employee "+surname);
        //     Employee person1=emp;
        //     System.out.print("Give amount of downpayment: ");
        //     double downP=in.nextDouble();

        //     advance adv1=new advance(person1,downP);
        //     lmov.addMove(adv1);

        //     advance adv = new advance(person1,lmov.findDownpayment(adv1));
        //     person1.ADDmovesEmployee(adv,perigrafi);
        //     System.out.println();
        //     k = in.nextLine();
                
                

        // }
           
        

        while (end == false ){
            System.out.println("\n1. Add a new type of expense");
            System.out.println("2. Add a new employee");
            System.out.println("3. Add a new expense of an employee");
            System.out.println("4. Add a new downpayment move");
            System.out.println("5. Expenses of employess");
            System.out.println("6. Remove expenses of an employee");
            System.out.println("7. Moves of employees");
            System.out.println("8. Remove expenses of employees");
            System.out.println("9. Final monthly refund of employees");
            System.out.println("0. exit");
            System.out.print(">");
            answer = in.nextLine();
            if (answer.equals("1")){
                System.out.print("The description of the expense ");
                descr = in.nextLine();
                System.out.print("The maximum monthly refund (per employee) ");
                max_refund_per_empl = in.nextDouble();
                System.out.print("Give the type of the expense(1 for expense A/2 for expense B): ");
                type=in.nextInt();
                if (type==1){
                    System.out.print("Give the price of refund: ");
                    double refundPer = in.nextDouble();
                    System.out.print("Give the measure: ");
                    k = in.nextLine();
                    measure = in.nextLine();
                    
                    ExpensesA ExA=new ExpensesA(descr,max_refund_per_empl,refundPer,measure,code1,type);
                    code1++;
                    ltexp.addTypeExpense(ExA);
                }
                else{
                    System.out.print("Give the percentage of refund: ");
                    double per = in.nextDouble();
                    ExpensesB ExB = new ExpensesB(descr,max_refund_per_empl,per,code1,type);
                    code1++;
                    ltexp.addTypeExpense(ExB);
                    k = in.nextLine();
                }
                
                

                
            }
            else if (answer.equals("2")){
                System.out.print("\nSurname? ");
                surname = in.nextLine();
                System.out.print("Name? ");
                name = in.nextLine();
                System.out.print("Max monthly refund percentage (for all type of expenses)? ");
                maxrefund = in.nextDouble();
                Employee emp = new Employee(surname,name,maxrefund,code);
                lemp.addEmployee(emp);
                code=code+1;
                k = in.nextLine();
            }
            else if (answer.equals("3")){
                ArrayList <Employee> lemp1=lemp.employees;
                int index=lemp.lookUp();
                Employee person1=lemp1.get(index);
                System.out.print("\nAdd a new expense for the employee: "+person1.surname);
                ArrayList <TypeExpense> ltexp1=ltexp.texpenses;
                int texIndex=ltexp.lookUp();
                String x = ltexp1.get(texIndex).getClass().getSimpleName();
                if (x.equals("ExpensesA")){
                    System.out.print("\nGive the quantity of the expense: ");
                    quantity=in.nextDouble();
                    value=0.0;
                    type = 1;
                    ExpensesA j = (ExpensesA) ltexp1.get(texIndex);
                    Dapani dap=new Dapani(person1.maxrefund,person1,value,quantity,ltexp1.get(texIndex).description,type,code2,j.refundPer);
                    perigrafi = dap.description;
                    code2++;
                    lexp.addExpense(dap);//Prosthetei tin dapani stin lista dapanwn
                    //oi parakwtw dio entoles sximatizoun tin lista dapanwn ana ergazomeno
                    person1.ADDExpensesEmployee(dap);                    
                    
                    sum_person = person1.sumRefund(ltexp);
                    for (int i = 0; i <ltexp.returnsize(); i++){
                        if (dap.description.equals(ltexp.texpenses.get(i).description)){
                           // System.out.println(sum_person[i]);
                           refund ref1 = new refund(person1,person1.CheckfinalRefund(ltexp)[i],dap);
                            person1.ADDmovesEmployee(ref1,perigrafi);
                            lmov.addMove(ref1);

                        }
                    }
                    

                } else{
                    System.out.print("\nGive the value of the expense : ");
                    value=in.nextDouble();
                    quantity=0;
                    type = 2;
                    ExpensesB j = (ExpensesB) ltexp1.get(texIndex);
                    Dapani dap=new Dapani(person1.maxrefund,person1,value,quantity,ltexp1.get(texIndex).description,type,code2,j.percentage);
                    perigrafi = dap.description;
                    code2++;
                    lexp.addExpense(dap);//Prosthetei tin dapani stin lista dapanwn                  
                   
                    person1.ADDExpensesEmployee(dap);  
                    sum_person = person1.sumRefund(ltexp);
                    for (int i = 0; i <ltexp.returnsize(); i++){
                        if (dap.description.equals(ltexp.texpenses.get(i).description)){
                            
                            refund ref1 = new refund(person1,person1.CheckfinalRefund(ltexp)[i],dap);
                            person1.ADDmovesEmployee(ref1,perigrafi);
                            lmov.addMove(ref1);
                        }
                    }
                    
                }        
                       
                
                k = in.nextLine();
            }
            else if (answer.equals("4")){
                
               
                ArrayList <Employee> lemp1=lemp.employees;
                int index=lemp.lookUp();
                Employee person1=lemp1.get(index);
                System.out.print("Give amount of downpayment: ");
                double downP=in.nextDouble();

                advance adv1=new advance(person1,downP);
                lmov.addMove(adv1);

                advance adv = new advance(person1,lmov.findDownpayment(adv1));
                person1.ADDmovesEmployee(adv,perigrafi);
                
                
                k = in.nextLine();
                
             } else if (answer.equals("5")){
                 System.out.println("--------------------LIST EXPENSES--------------------");
                 lexp.listExpense();

                 System.out.println("\n--------------------PER TYPE EXPENSE--------------------");
                 for (int i = 0; i < lemp.returnsize(); i++){
                    double[] sum_person2 = lemp.employees.get(i).sumRefund(ltexp);
                    for (int j = 0; j < ltexp.returnsize(); j++){
                        if (sum_person2[j] != 0)
                        System.out.println("Employee: "+lemp.employees.get(i).surname+"\t\tType Expense: "+ltexp.texpenses.get(j).description+"\t\t"+
                        sum_person2[j]+"\t\tValue of Refund (After check): "+lemp.employees.get(i).CheckfinalRefund(ltexp)[j]);}
                 }
                   
                }
                // k = in.nextLine();

             else if (answer.equals("6")){
                 //Prostithetai stis kiniseis i kinisi remove
                ArrayList <Employee> lemp1=lemp.employees;
                
                int index=lemp.lookUp();
                Employee person1=lemp1.get(index);
                
                double y1=0;
                difference dif=new difference(person1,y1,ltexp);
                lmov.addMove(dif);
                person1.ADDmovesEmployee(dif,perigrafi);  
                
                for (int i = 0; i <person1.movesEmp.size(); i++){
                    if (person1.movesEmp.get(i).getClass().getSimpleName().equals("advance")){
                        advance x = (advance) person1.movesEmp.get(i);
                        SumOfRefunds sref = new SumOfRefunds(person1, dif.CalcDif(), ltexp,x.amountOfrefund);
                        lmov.addMove(sref);
                        person1.ADDmovesEmployee(sref,perigrafi);
                        sumrefunds.add(i,sref.SumofRefunds());
                        
                    }


                } 
                System.out.println("Do you need the moves to appear? (Type 1 for Yes and 2 for No)");
                int show=in.nextInt();
                if (show==1){
                    WriteMoves wmove=new WriteMoves();
                    wmove.WriteMove(lmov);  
                    readMove.PrintList();

                }
                else{
                person1.ListMovesOfEmp(); } 
                int sizeoflist = lexp.expenses.size();
                int i = 0;
                while (i<sizeoflist){
                    if (lexp.expenses.get(i).em==person1){
                        lexp.expenses.remove(lexp.expenses.get(i));
                        sizeoflist = sizeoflist - 1;
                    }
                    else{
                        i++;
                    }
                }
                sizeoflist = lmov.Move.size();
                int l = 0;
                while (l<sizeoflist){
                    if (lmov.Move.get(l).em==person1){
                        lmov.Move.remove(lmov.Move.get(l));
                        sizeoflist = sizeoflist - 1;
                    }
                    else{
                        l++;
                    }
                }
                person1.movesEmp.clear();
                person1.expensesEmp.clear();
                System.out.println("The expenses have been cleared");    
                k = in.nextLine();            
             }else if (answer.equals("7")){
                ArrayList <Employee> lemp1=lemp.employees;
                int index=lemp.lookUp();
                Employee person1=lemp1.get(index);  
                person1.ListMovesOfEmp();
                
             }
             else if (answer.equals("8")){
                ArrayList <Employee> lemp1=lemp.employees;
                
                 for (int i = 0; i < lemp.returnsize(); i++){
                    double y1=0;
                    Employee person1=lemp1.get(i);
                    difference dif=new difference(person1,y1,ltexp);
                    lmov.addMove(dif);
                    person1.ADDmovesEmployee(dif,perigrafi);
                    for (int j = 0; j <person1.movesEmp.size(); j++){
                        if (person1.movesEmp.get(j).getClass().getSimpleName().equals("advance")){
                            advance x = (advance) person1.movesEmp.get(j);
                            SumOfRefunds sref = new SumOfRefunds(person1, dif.CalcDif(), ltexp,x.amountOfrefund);
                            person1.ADDmovesEmployee(sref,perigrafi);
                            System.out.println();
                            person1.ListMovesOfEmp();
                            sumrefunds.add(i,sref.SumofRefunds());
                            
                        }
                    int sizeoflist = lexp.expenses.size();
                    int g = 0;
                    
                    while (g<sizeoflist){
                        if (lexp.expenses.get(g).em==person1){
                            lexp.expenses.remove(lexp.expenses.get(g));
                            sizeoflist = sizeoflist - 1;
                        }
                        else{
                            g++;
                        }
                    }
                    sizeoflist = lmov.Move.size();
                    int l = 0;
                    while (l<sizeoflist){
                        if (lmov.Move.get(l).em==person1){
                            lmov.Move.remove(lmov.Move.get(l));
                            sizeoflist = sizeoflist - 1;
                        }
                        else{
                            l++;
                        }
                    }
    
                }
                person1.movesEmp.clear();
                person1.expensesEmp.clear();
              } 

                 
            }else if (answer.equals("9")){
                ArrayList <Employee> lemp1=lemp.employees;
                double finalsum = 0;
                for (int i = 0; i < lemp.returnsize(); i++){
                    Employee person1=lemp1.get(i);
                    System.out.println("Surname: " + person1.surname + "\t\tName: " + person1.name + "\t\tFinal Refund: " + sumrefunds.get(i));
                    finalsum = finalsum + sumrefunds.get(i);
                    
                }
                System.out.println("Final sum of refunds: "+finalsum);


            }
            





            else if (answer.equals("0")){
                WriteExpenses wexp = new WriteExpenses();
                wexp.WriteExp(lexp);
                readex.PrintList();
                WriteMoves wmove=new WriteMoves();
                wmove.WriteMove(lmov);  
                readMove.PrintList();

                end=true;              }



        }

    }
}

