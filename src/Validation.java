

import java.util.Scanner;


public class Validation {

    Scanner sc = new Scanner(System.in);
    public int getChoice() {
        int number = 0;
        System.out.print("Enter your choice: ");
        do {
            try {
                number = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.print("Please input valid number: ");
                continue;
            }
            break;
        } while (true);
        return number;
    }
    public double getDouble(String txt) {
        double number = 0;
        System.out.print(txt);
        do {
            try {
                number = Double.parseDouble(sc.nextLine());
            } catch (Exception e) {
                System.out.print("Please input valid double: ");
                continue;
            }
            break;
        } while (true);
        return number;
    }
    public String getString(String txt) {
        String str = "";
        System.out.print(txt);
        do {
             str = sc.nextLine();
             if(str.trim()==""){
                 System.out.println("Please input valid string");
             }else{
                 break;
             }
        } while (true);
        return str;
    }
//    public boolean checkYN() {
//        String str = "";
//        System.out.print("Are you want to edit profile");
//        do {
//             str = sc.nextLine();
//             if(str.trim()==""){
//                 System.out.println("Please input valid string");
//             }else{
//                 break;
//             }
//        } while (true);
//        return str;
//    }
}
