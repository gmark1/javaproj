import java.util.ArrayList;
import java.util.Scanner;

public class lists {
        
}

class list_typeExpense extends lists{
  ArrayList<TypeExpense> texpenses = new ArrayList<TypeExpense>();
  
  public int lookUp(){
    Scanner in=new Scanner(System.in);
    System.out.println("\nChoose the type of expense: ");
    listTypeExpenses();
    System.out.print("Give the code of the Type of expense: ");
    int index = in.nextInt();
    return index;


  }
  public void addTypeExpense(TypeExpense texp){
    texpenses.add(texp);
  }
  public int returnsize(){
    return texpenses.size();
  }
  public void listTypeExpenses(){
    for (TypeExpense texp: texpenses)
      System.out.println(texp);
    }
  }

  
  

class list_Employees extends lists{

    ArrayList<Employee> employees = new ArrayList<Employee>();
    
    public void addEmployee(Employee em){
        employees.add(em);
        

    }

    public void listEmployees(){
        for (Employee em: employees)
            System.out.println(em);
    }

    public int returnsize(){
      return employees.size();
    }

    public int lookUp(){
      Scanner in=new Scanner(System.in);
      System.out.println("Choose the employee you want :");
      listEmployees();
      System.out.print("Give the code of the Employee: ");
      int index = in.nextInt();
      return index;


  }

}

class list_Expenses extends lists{
  
  ArrayList<Dapani> expenses = new ArrayList<Dapani>();
  
  public void addExpense(Dapani exp){
    expenses.add(exp);
  }
  
  
  public void listExpense(){
    for (Dapani exp: expenses)
      System.out.println(exp);
  }

  public int returnsize(){
    return expenses.size();
  }

  public int lookUp(Dapani expense1){
    int index = expenses.indexOf(expense1);
    return index;

  }

}


class list_Moves extends lists{
  
  
  ArrayList<moves1> Move = new ArrayList<moves1>();
  
  public void addMove(moves1 mov){
    Move.add(mov);
  }

  public int returnsize(){
    return Move.size();
  }

  public double findDownpayment(moves1 adv1){
      advance adv = (advance) adv1;
      double sumadv=0;
      for (int i = 0; i < Move.size(); i++){
        if (Move.get(i).getClass().getSimpleName().equals("advance")){
          if (adv.em.surname.equals(Move.get(i).em.surname))
            sumadv=sumadv+Move.get(i).amountOfrefund;

      }
    }
      return sumadv;

  }

  
  
  public void listMoves(){
    for (moves1 mov : Move)
      System.out.println(mov);}

}



  
