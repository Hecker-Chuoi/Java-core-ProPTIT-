import java.util.Scanner;
import java.util.ArrayList;
public class Admin {
    private int displayOption = 2;
    Scanner sc = new Scanner(System.in);
    public void showAllFunction(){
        System.out.println("Các chức năng: ");
        System.out.println("0. Hiển thị menu");
        System.out.println("1. Thêm sản phẩm");
        System.out.println("2. Xóa sản phẩm");
        System.out.println("3. Cập nhật sản phẩm");
        System.out.println("4. Hiển thị danh sách sản phẩm");
        System.out.println("5. Tìm kiếm sản phẩm");
        System.out.println("6. Thay đổi cách hiển thị");
        System.out.println("7. Thoát");
    }

    public void addProduct(ArrayList list){
        System.out.println("1. Sách");
        System.out.println("2. Vở");
        System.out.println("3. Bút");
        System.out.println("4. Bút chì");
        System.out.print("Chọn loại sản phẩm muốn thêm: ");
        int type = sc.nextInt();
        System.out.println();
        System.out.print("Nhập số lượng: ");
        int number = sc.nextInt();
        System.out.println();
        for(int i = 0; i < number; ++i) {
            switch(type){
                case 1:
                    Book book = new Book(); book.getDetails();
                    list.add(book);
                    break;
                case 2:
                    Notebook notebook = new Notebook(); notebook.getDetails();
                    list.add(notebook);
                    break;
                case 3:
                    Pen pen = new Pen();
                    list.add(pen);
                    break;
                case 4:
                    Pencil pencil = new Pencil(); pencil.getDetails();
                    break;
            }
        }
    }
    public void removeProduct(ArrayList list){
        System.out.print("Nhập vị trí cần xóa: ");
        int index = sc.nextInt();
        if(index < 0 || index >= list.size()){
            System.out.println("Vị trí không hợp lệ!");
            return;
        }
        list.remove(index);
    }
    public void updateProduct(ArrayList list){
        System.out.print("Nhập vị trí cần cập nhật: ");
        int index = sc.nextInt();
        if(index <= 0 || index > list.size()){
            System.out.println("Vị trí không hợp lệ!");
            return;
        }
        System.out.println();
        System.out.println("1. Sách");
        System.out.println("2. Vở");
        System.out.println("3. Bút");
        System.out.println("4. Bút chì");
        System.out.print("Chọn loại sản phẩm muốn thêm: ");
        int type = sc.nextInt();
        System.out.println();
        switch(type){
            case 1:
                Book book = new Book(); book.getDetails();
                list.get(index-1) = book;
                break;
            case 2:
                Notebook notebook = new Notebook(); notebook.getDetails();
                list.get(index-1) = notebook;
                break;
            case 3:
                Pen pen = new Pen();
                list.get(index-1) = pen;
                break;
            case 4:
                Pencil pencil = new Pencil(); pencil.getDetails();
                list.get(index-1) = pencil;
                break;
        }
    }
    public void displayAllProducts(ArrayList list){
        if(displayOption == 1){
            // display as table
            char c = (char) 166;
            System.out.printf("+%s+%s+%s+%s+\n", "-".repeat(30), "-".repeat(8), "-".repeat(15), "-".repeat(40));
            System.out.printf("%c%-30s%c%-8s%c%-15s%c%-40s%c\n", c, "Tên sản phẩm", c, "Giá bán", c, "Thương hiệu", c, "Thông tin thêm", c);
            System.out.printf("+%s+%s+%s+%s+\n", "-".repeat(30), "-".repeat(8), "-".repeat(15), "-".repeat(40));
            for(int i = 0; i < list.size(); i++){
                list.get(i).displayAsTable();
            }
        }
        else if(displayOption == 2){
            // display as list
            System.out.println("__________");
            for(int i = 0; i < list.size(); i++){
                list.get(i).displayAsList();
            }
        }
    }
    public void lookForProduct(ArrayList list){
        System.out.print("Chọn loại sản phẩm: ");
        System.out.println("1. Sách");
        System.out.println("2. Vở");
        System.out.println("3. Bút");
        System.out.println("4. Bút chì");
        int type = sc.nextInt();
        String s;
        switch(type){
            case 1:
                s = "Book"; break;
            case 2:
                s = "Notebook"; break;
            case 3:
                s = "Pen"; break;
            case 4:
                s = "Pencil"; break;
        }
        System.out.println();
        for(int i = 0; i < list.size(); ++i){
            if(list.get(i).getTTSP().equals(s))
                list.get(i).displayAsList();
        }
    }
    public void changeDisplayOption(){
        System.out.println("Chọn chế độ hiển thị: ");
        System.out.println("1. Bảng");
        System.out.println("2. Danh sách");
        int n = sc.nextInt();
        if(n == 1){
            displayOption = 1;
        }
        else if(n == 2){
            displayOption = 2;
        }
    }
    public void adminFunction(ArrayList list){
        showAllFunction();
        System.out.println("Chọn một chức năng: ");
        int n = sc.nextInt(); // user's choice
        while(true) {
            switch(n){
                case 0:
                    showAllFunction();
                case 1:
                    addProduct(list);
                    break;
                case 2:
                    removeProduct(list);
                    break;
                case 3:
                    updateProduct(list);
                    break;
                case 4:
                    displayAllProducts(list);
                    break;
                case 5:
                    lookForProduct(list);
                    break;
                case 6:
                    return;
            }
            System.out.print("Chọn một chức năng: ");
            n = sc.nextInt();
            System.out.println();
        }
    }
}
