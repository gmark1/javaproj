

class TypeExpense{
    public String description;
    public double maxRefund;
    int code;
    int type;
    public TypeExpense(){

    }
    public TypeExpense(String des,double mref, int code,int type){
        this.code=code;
        this.description=des;
        this.maxRefund=mref;
        this.type=type;
    
    }

    public void setType(int type){
        this.type=type;
    }

    public void setCode(int code){
        this.code=code;
    }

    public void setDescription(String description){
        this.description=description;
    }
    
    public void setMaxrefund(double mref){
        this.maxRefund=mref;
    }

    public int numberOfcode(){
        return code;
    }

    public String toString(){
        return "Type: "+ type + "\t\tCode:"+code +"\t\tDescription: "+ description ; 
    }
    
        
}

class ExpensesA extends TypeExpense{
    private int type=1;
    double refundPer,refValue;
    String measure;

    public ExpensesA(){

    }
    
    public ExpensesA(String des,double mref,double refundPer, String measure, int code,int type){
        super(des,mref,code,type);
        this.refundPer=refundPer;
        this.measure=measure;
        
    }
    
    public void setRefundPer(double refundper){
        this.refundPer=refundper;
    }

    public void setMeasure(String measure){
        this.measure=measure;
    }

    
    public String toString(){
        return "Code: "+ numberOfcode() + "\t\tDescription: "+ description + "\t\tPrice of refund: "+ refundPer +" euro/" + measure + "\t\tMax monthly refund per employee: "+ maxRefund; 
    }

}

class ExpensesB extends TypeExpense{
    private int type=2;
    public double percentage;
    public ExpensesB(){
        
    }
    public ExpensesB(String des,double mref,double perc, int code,int type){
        super(des,mref,code,type);
        this.percentage=perc;

    }

    public void setPercentage(double percentage){
        this.percentage=percentage;
    }

    public String toString(){
        return "Code: "+ numberOfcode() + "\t\tDescription: "+ description+ "\t\tPercentage of refund: "+percentage +"\t\tMax monthly refund per employee: "+ maxRefund;
    }
    
}

class Dapani extends TypeExpense{
    Employee em;
    int type;
    double value,refValue;
    double quantity,x;
    String measure;

    public Dapani(){

    }

    public Dapani(double mref,Employee em,double value,double quant,String des,int type, int code,double x){
        super(des,mref,code,type);
        this.em=em;
        this.value=value;
        this.type=type;
        this.quantity=quant;
        this.x = x;
    
  
    }

    public void setem(Employee em){
        this.em = em;
    } 

    public void settype(int type){
        this.type = type;
    }

    public void setcode(int code){
        this.code = code;
    }

    public void setquantity(double quantity){
        this.quantity = quantity;
    }

    public void setvalue(double value){
        this.value = value;
    }

    public void setmaxrefund(double maxRefund){
        this.maxRefund = maxRefund;
    }

    public void setdescription(String description){
        this.description = description;
    }

    public void setrefundper(double refundPer){
        this.x = refundPer;
    }



    public double RefundCalc(){
        if (this.type==1){

            this.refValue=this.quantity*x;
            
        } else {
            
            this.refValue=this.value*x/100;
    }
        return this.refValue;

}
    public String toString(){
        if(type==1){
        return "Code: "+ numberOfcode() + "\t\tEmployee "+em.surname + "\t\tDescription: "+ description+ "\t\tQuantity "+quantity+ "\t\tValue of refund "+RefundCalc();}
        else{
            return "Code: "+ numberOfcode() + "\t\tEmployee "+em.surname+ "\t\tDescription: "+ description+ "\t\tValue "+ value+"\t\tValue of refund "+RefundCalc();
        }
    }
}