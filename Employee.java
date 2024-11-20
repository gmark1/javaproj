import java.util.ArrayList;
public class Employee{
    String surname, name; 
    double maxrefund,sum;
    int code;
    ArrayList <Dapani> expensesEmp = new ArrayList<Dapani>();
    ArrayList <moves1> movesEmp = new ArrayList<moves1>();

    //gia to merosB
    public Employee(){
        
    }
    
    //to poso apozimiwseis logika to klhronomei
    public Employee(String surn, String n, double maxrefund,int code){
        this.surname = surn;
        this.name = n;
        this.maxrefund = maxrefund;
        this.code=code;       

    }

    public void ADDExpensesEmployee(Dapani dapEmpl){
        expensesEmp.add(dapEmpl);
        
    }

    public double[] sumRefund(list_typeExpense ltexp){   
        double [] sum = new double[ltexp.returnsize()];
        for (int i = 0; i <  ltexp.returnsize(); i++){
            sum [i] = 0;
            for (int j = 0; j < expensesEmp.size(); j++){
                
                if (expensesEmp.get(j).description.equals(ltexp.texpenses.get(i).description))            
                    sum[i] = sum[i] + expensesEmp.get(j).RefundCalc();}
        }
        
        return sum;        
    }   

    public double [] CheckfinalRefund(list_typeExpense ltexp){
        double [] chfinref = new double[ltexp.returnsize()];
        double [] sum=sumRefund(ltexp);
        int k = 0;
        for (int i=0; i<ltexp.returnsize(); i++){
            if (sum[k]>ltexp.texpenses.get(i).maxRefund){
                chfinref[k]=ltexp.texpenses.get(i).maxRefund;
                
            }else{
                chfinref[k]=sum[k];
                
            }
            k += 1;
        }
        return chfinref;

    }


    public void ADDmovesEmployee(moves1 M, String perigrafi){
        movesEmp.add(M);
        if (M.getClass().getSimpleName().equals("refund")){
            String NameOfTEXP = perigrafi; 
            for (int i = 0; i <movesEmp.size()-1; i++){
                String k = movesEmp.get(i).perigrafi;
                if (NameOfTEXP.equals(k)){
                    movesEmp.remove(i);
                }
            }
        }
        else if (M.getClass().getSimpleName().equals("advance")){
            for (int i = 0; i <movesEmp.size()-1; i++){
                if (movesEmp.get(i).getClass().getSimpleName().equals("advance")){
                    movesEmp.remove(i);
                }
            }

            

        }
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setMaxRef(double maxrefund){
        this.maxrefund = maxrefund;
    }

    public void setCode(int code){
        this.code = code;
    }

    public void ListMovesOfEmp(){
        for (int i = 0; i < movesEmp.size(); i++){
            System.out.println(movesEmp.get(i));
        }
    }
    
    public String toString(){
        return "Employee's code: "+code+"\t\tSurname: "+ surname + "\t\tName: "+ name+ "\t\tMax monthly refund: "+ maxrefund;
    }
}




