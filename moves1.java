

public class moves1 {

    Employee em;
    double amountOfrefund;
    String perigrafi;
    public moves1(){

    }
    public moves1(Employee em,double amountOfrefund){
        this.em = em;
        this.amountOfrefund = amountOfrefund; 
        perigrafi = "";    
    }

    public void setem(Employee em){
        this.em = em;
    }


    public void setType(String type){
        this.perigrafi=type;
    }

    public void setValue(double val){
        this.amountOfrefund=val;
    }
    
}

class refund extends moves1{
    String des;
    Dapani dap;
    String perigrafi;
    public refund(){
        
    }
    public refund(Employee em,double amountOfrefund,Dapani dap){
        super(em,amountOfrefund);
        this.dap = dap;
        super.perigrafi = dap.description;
    }

    

    public String toString(){
        return "Type of Move: Refund"+"\t\tEmployee: "+em.surname+"\t\tType Of Expense: "+ dap.description+"\t\tAmount of refund: "+amountOfrefund;
    }
}

class advance extends moves1{
    public advance(){

    }
    public advance(Employee em,double amountOfrefund){
        super(em,amountOfrefund);
    }

    public String toString(){
        return "Type of Move: downpayment"+"\t\t Employee: "+em.surname+"\t\t\t"+"\t\tPrice of downpayment: "+amountOfrefund;
    }


}

class difference extends moves1{
    public difference(){

    }
    list_typeExpense ltexp;
    public difference(Employee em,double amountOfrefund,list_typeExpense ltexp){
        super(em, amountOfrefund);
        this.ltexp = ltexp;
    }
   
    public double CalcDif(){
        
        double y=amountOfrefund;
        
        for (int j = 0; j <ltexp.returnsize(); j++)
            y = y + em.CheckfinalRefund(ltexp)[j];
        
        double diafora=0;
        if(y>em.maxrefund){
            diafora=y-em.maxrefund;
        }
        return diafora;
    }

    public String toString(){
        return "Type of Move: difference"+"\t\t Employee: "+em.surname+"\t\t\t"+"\t\tPrice of difference: "+CalcDif();
    }
}

class SumOfRefunds extends moves1{
    list_typeExpense ltexp;
    double downP;
    public SumOfRefunds(Employee em, double amountOfrefund,list_typeExpense ltexp,double downP){
        super(em,amountOfrefund);
        this.ltexp = ltexp;
        this.downP = downP;
    }

    public double SumofRefunds(){
        double y=0;
        double sum = 0;
        for (int j = 0; j <ltexp.returnsize(); j++)
            y = y + em.CheckfinalRefund(ltexp)[j];
        sum = y - amountOfrefund - downP;

        return sum;
    }


    public String toString(){
        return "Type of Move: Final refund \t\tEmployee: "+em.surname+"\t\t\t\tAmount of refund: "+SumofRefunds();
    }


}

