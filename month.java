
public class month {
    public static void main(string args []){
        Scanner sc = new Scanner (System.in){
            System.out.print("Enter the number of the month(1-12)");
            int month = scanner.nextInt();
            string month;
            switch (month){
                case 1: System .out.println("January");
                break;
                case 2: System .out.println("Faburary");
                break;
                case 3: System .out.println("March");
                break;
                case 4: System .out.println("April");
                break;
                case 5: System .out.println("may");
                break;
                case 6: System .out.println("june");
                break;
                case 7: System .out.println("July");
                break;
                case 8: System .out.println("August");
                break;
                case 9: System .out.println("September");
                break;
                case 10: System .out.println("October");
                break;
                case 11: System .out.println("November");
                break;
                default: System .out.println("December");
                
            }
        }
    }

}
