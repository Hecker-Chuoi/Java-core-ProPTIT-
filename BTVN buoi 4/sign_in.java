import java.util.Scanner;
import java.util.ArrayList;
public class sign_in {
    Scanner sc = new Scanner(System.in);
    public void check(ArrayList list){
        String username, password;
        // enter username
        System.out.print("Tên đăng nhập: ");
        username = sc.nextLine();
        // enter password
        System.out.print("Mật khẩu: ");
        password = sc.nextLine();
        if(username.equals("admin") && password.equals("admin")) {
            System.out.println("Đăng nhập thành công!");
            Admin admin = new Admin();
            admin.adminFunction(list);
        }
        else if(username.equals("guest") && password.equals("")){
            System.out.println("Đăng nhập thành công!");
            Guest guest = new Guest();
            guest.guestFunction(list);
        }
        else{
            System.out.println("Tài khoản hoặc mật khẩu không đúng!");
            System.out.println("Vui lòng thử lại!\n");
        }
    }
}
