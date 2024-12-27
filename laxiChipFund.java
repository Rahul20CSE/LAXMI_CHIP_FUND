import java.util.*;
public class laxiChipFund{
    static String username;
    static long mobile;
    static String pan;
    static long adhar; 
    static String address;
    static int pin;
    static double balance;
    final static long accountNO =123412341234l;
    final static String ifCode = "LCF1234";
    static ArrayList<String> statement = new ArrayList<>(0);
    public static void main(String []arg){
        
        welcome();

    }

    public static void welcome(){
        for( ; ; ){
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("              ----------- WELL COME TO LAXI CHIP FUND  ------------------             ");
        System.out.println();
        System.out.println();
        System.out.println(" 1. LOING ");
        System.out.println(" 2  CREAT YOUR BANK  ACCOUTNT !");
        System.out.print("Enter the option : ");
        int op = sc.nextInt();

        switch (op) {
            case 1 :login(sc) ;break;
            case 2 :creatingAccount(sc) ;break;
            default : System.out.println( " You have enter Wrong option ");break;
        }

      }
    }
    
    public static void login(Scanner sc){
        if(username!= null){
            for(int i=1;i<=3;i++){
            System.out.println();
            System.out.println("     ********  LOGIN MODULE    ********       ");
            System.out.println();
            System.out.print("Enter the mobile number :");
            long mobile1 =sc.nextLong();
            System.out.print("Enter the pin :");
            int pin1 = sc.nextInt();

            if((mobile1==mobile)&& (pin1==pin)){
               homePage(sc);

            }else{
                System.out.println();
                System.out.println(" You hava enter the wrong credential !");
                System.out.println();
            }
            
            }
            System.exit(0);

           }else{
            System.out.println();
            System.out.println("Create account first ");
            System.out.println();
           }
        
    

    }


    public static void creatingAccount(Scanner sc){
        System.out.println();
        System.out.println("    **********    Accounting Creating Module   **********       ");
        System.out.println();
        System.out.print("Enter username  :");
         username = sc.nextLine();
         sc.nextLine();
        System.out.print("mobile  :");
        mobile = sc.nextLong();
        System.out.print("adhar  :");
        adhar = sc.nextLong();
        System.out.print("Address :");
        address = sc.nextLine();
        sc.nextLine();
        System.out.print("PanCard :");
        pan = sc.nextLine();
        System.out.print("pin :");
        pin = sc.nextInt();
        System.out.print("Enter the amount to depost : ");
        balance = sc.nextDouble();
        statement.add("Deposit :"+ balance);

        System.out.println();
        System.out.println(" Accounyt is Created susscessfully   !");
        System.out.println();

    }

    public static void homePage(Scanner sc){
        for( ; ; ){
             System.out.println();
             System.out.println("   ^^^^^^^^******   WELL COME TO HOME PAGE   *******^^^^^^^^^     ");
             System.out.println();
             System.out.println(" 1. Deposit Accout");
             System.out.println(" 2. Withdraw Amont");
            System.out.println( " 3. Check Balance ");
            System.out.println(" 4. Statement ");
            System.out.println(" 5. Edit Profile");
            System.out.println(" 6.logout ");
            System.out.println();
            System.out.print("Enter the option :");
            int op = sc.nextInt();

            switch (op) {
                case 1 : deposit(sc); break;
                case 2 : withdraw(sc); break;
                case 3 : checkBalance(sc); break;
                case 4 : statement(); break;
                case 5 : editProfile(sc); break;
                case 6 : System.exit(0); 
            
            
            
            
                default : System.out.println("You have enter wrong option");break;
            }

        }
    }

    public static void deposit(Scanner sc){
        System.out.print("Enter the Deposit amount :");
        double deposit = sc.nextDouble();
        balance += deposit;
        statement.add("deopsit"+deposit);
        System.out.println("you have susscessfully deposit amount ");


    }

    public static void withdraw(Scanner sc){
        System.out.println();
        System.out.print("Enter  Withdraw  ammout : ");
        double withdrawAmount = sc.nextDouble();
        System.out.println();
        System.out.println("Enter pin :");
        int pin1= sc.nextInt();

        if((pin1==pin)){
            if(balance>=withdrawAmount){
                balance-=withdrawAmount;
                statement.add("withdraw :"+withdrawAmount);
                System.out.println("You have susscessfully withdraw amount"+ withdrawAmount +"your Balance is"+ balance);
                
            }else{
                System.out.println("withdraw amont is greater than balance");
            }
            return;
        }else{
            System.out.println("You have enter wrong pin");
        }



    }

    public static void checkBalance(Scanner sc){
        for(int i=1;i<=3;i++){
            System.out.println("   ********  CHECK BALANCE  ********    ");
            System.out.println("Enter yout pin :");
            int pin1 = sc.nextInt();

            if(pin1==pin){
                System.out.println();
                System.out.println("Account Balance is :"+ balance +"rs");
                return;
            }else{
                System.out.println();
                System.out.println("you have enter wrong pin");
            }
        }
        System.out.println();
        System.out.println("Your account has been deactivated for 24 hours");
        System.exit(0);

    }

    public static void statement(){
        System.out.println("   --------Statement --------");
        System.out.println();
        for(String transaction :statement){
            System.out.println(transaction);
        }

    }

    public static void editProfile(Scanner sc){
        System.out.println(     "********  Edit your Profile   *********    ");
        System.out.println("  Do you want to Edit yout Profile :");
        System.out.println("1. Yes ");
        System.out.println("2. No ");
        System.out.println("Enter your option");
        int opt = sc.nextInt();
        
        switch (opt) {
            case 1: edit(sc);break;
            case 2: login(sc);;break;
        
            default:  System.out.println("You hava Enter the worng opt ") ;break;
        }
        
       
    
    }
    public static void edit(Scanner sc){
        System.out.println("enter the pin");
        int pin1 =sc.nextInt();
        if(pin1==pin){
            System.out.println("Which option you want to Update !");
            System.out.println("1 .username");
            System.out.println("2 .mobile");
            System.out.println("3 .pin");
            System.out.println("Enter the option");
            int opt2 =sc.nextInt();

            switch (opt2) {
                case 1: System.out.print("Enter new user name :");
                        username= sc.nextLine();
                        sc.nextLine();
                        System.out.println("your name is Updated *");
                        
                    return;
                case 2:System.out.print("Enter new user mobile :");
                      mobile= sc.nextLong();
                      System.out.println("Your mobile Number is Updated !");
                      return;
                 
                    case 3:System.out.print("Enter new user pin");
                       pin= sc.nextInt();
                       System.out.println("your pin is Updated *");
                        return; 
            
                default: System.out.println("You have Enter the Wrong Option ");
                    break;
            }

        login(sc);
        }

    }
}