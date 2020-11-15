
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public void login() throws FileNotFoundException {
        Scanner scan = new Scanner(new File("userInfo.txt"));
        Scanner keyboard = new Scanner(System.in);
        String user = scan.nextLine();
        String pass = scan.nextLine(); // looks at selected file in scan

        String inpUser = keyboard.nextLine();
        String inpPass = keyboard.nextLine(); // gets input from user

        if (inpUser.equals(user) && inpPass.equals(pass)) {
            System.out.print("your login message");
        } else {
            System.out.print("your error message");
        }
    }

    public static void register() throws IOException {
        String[] data = {
            "Hello Java!",
            "Good bye!"
        };
        File file = new File("d\\userInfo.txt");
        OutputStream outputStream = new FileOutputStream(file);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);

        for (String item : data) {
            outputStreamWriter.write(item);
            // Dùng để xuống hàng
            outputStreamWriter.write("\n");
        }
        // Đây là phương thức quan trọng!
        // Nó sẽ bắt chương trình chờ ghi dữ liệu xong thì mới kết thúc chương trình.
        outputStreamWriter.flush();
    }

    public static void loginSystem(){
        
    }
    
    public static void main(String[] args) throws IOException, SQLException {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Username: ");
        String user = sc.nextLine();
        System.out.println("Password: ");
        String pass = sc.nextLine();
        try{
            if(user.equals("") || pass.equals("")){
                System.out.println("Vui lòng nhập đủ thông tin!");
            }else{
                String Url = "jdbc:sqlserver://localhost;databaseName=userInfo;user=;password=123";
                Connection conn = DriverManager.getConnection(Url);
                String sql = "SELECT * FROM userInfo WHERE userName = ? AND Password = ?";
                PreparedStatement stm = conn.prepareCall(sql);
                stm.setString(1, user);
                stm.setString(2, pass);
                ResultSet rs = stm.executeQuery();
                if(rs.next()){
                    System.out.println("Dang nhap thanh cong!");
                    
                }else{
                    System.out.println("Dang nhap that bai!");
                }
                
            }
        }catch(Exception e){
            System.out.println("Ket noi that bai!");
        }
    }

}
