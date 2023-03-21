import javax.swing.JOptionPane;

class CreditCard{
   public static void main(String[] args){
      double salary; 
      int creditRating;
      String input; 
      input = JOptionPane.showInputDialog("What is \n your anual salary? ");
      salary = Double.parseDouble(input);
      
      input = JOptionPane.showInputDialog("On a scale of \n 1 through 10, what is your credit rating? \n (10 = excelent, 1 = very bad) ");
      creditRating = Integer.parseInt(input);
      
      if (salary >= 2000 && creditRating >= 7){
          qualify();
      } else {
          noQualify();
      }
      System.exit(0);
   }
    public static void qualify(){
         JOptionPane.showMessageDialog(null, "Congratulations! you qualify for credit card.");
      }
      
    public static void noQualify(){
         JOptionPane.showMessageDialog(null, "I'm sorry. You \n do not qualiry for credit card.");
    }
}