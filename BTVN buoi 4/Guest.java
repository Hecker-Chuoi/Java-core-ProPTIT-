import java.util.Scanner;
import java.util.ArrayList;
public class Guest {
    Scanner sc = new Scanner(System.in);
    public void showAllFunction(){
        System.out.println("Chọn một chức năng:");
        System.out.println("0. Hiển thị menu");
        System.out.println("1. Hiển thị danh sách sản phẩm");
        System.out.println("2. Tìm kiếm sản phẩm");
        System.out.println("3. Thoát");
    }
    public void displayAllProducts(ArrayList list){
        System.out.println("Hiển thị dưới dạng: ");
        System.out.println("1. Bảng");
        System.out.println("2. Danh sách");
        int n = sc.nextInt();
        if(n == 1){
            // display as table
            char c = (char) 166;
            System.out.printf("+%s+%s+%s+%s+\n", "-".repeat(30), "-".repeat(8), "-".repeat(15), "-".repeat(40));
            System.out.printf("%c%-30s%c%-8s%c%-15s%c%-40s%c\n", c, "Tên sản phẩm", c, "Giá bán", c, "Thương hiệu", c, "Thông tin thêm", c);
            System.out.printf("+%s+%s+%s+%s+\n", "-".repeat(30), "-".repeat(8), "-".repeat(15), "-".repeat(40));
            for(int i = 0; i < list.size(); i++){
                ((Book)list.get(i)).displayAsTable();
            }
        }
        else if(n == 2){
            // display as list
            System.out.println("__________");
            for(int i = 0; i < list.size(); i++){
                ((Book)list.get(i)).displayAsList();
            }
        }
    }
    public void lookForProduct(ArrayList list){

    }
    public void guestFunction(ArrayList list){
        showAllFunction();
        System.out.println("Chọn một chức năng: ");
        int n = sc.nextInt(); // user's choice
        while(true) {
            switch(n){
                case 0:
                    showAllFunction();
                    break;
                case 1:
                    displayAllProducts(list);
                    break;
                case 2:
                    lookForProduct(list);
                    break;
                case 3:
                    return;
            }
            System.out.println("Chọn một chức năng: ");
            n = sc.nextInt();
        }
    }
}
