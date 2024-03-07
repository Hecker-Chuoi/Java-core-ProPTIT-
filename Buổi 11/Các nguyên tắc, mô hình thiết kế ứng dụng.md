# Các nguyên tắc, mô hình thiết kế ứng dụng

## I. SOLID là gì?
SOLID là viết tắt của 5 chữ cái đầu trong 5 nguyên tắc thiết kế hướng đối tượng. SOLID hướng đến việc viết code một cách dễ đọc, dễ hiểu, dễ maintain.

5 nguyên tắc bao gồm:
+ `S`ingle responsibility principle (**SRP**)
+ `O`open/Closed principle (**OCP**)
+ `L`iskov substitution principle (**LSP**)
+ `I`nterface segreration principle (**ISP**)
+ `D`ependency inversion principle (**DIP**)

### 1, Single responsibility principle
![alt text](image.png)

Nguyên lý đầu tiên ứng với chữ `S` trong SOLID.  
Nội dung:  
>Mỗi class chỉ nên làm một nhiệm vụ duy nhất.

Một class có quá nhiều chức năng sẽ trở nên cồng kềnh và trở nên khó đọc, khó maintain. Mà đối với ngành IT việc requirement thay đổi, cần thêm sửa chức năng là rất bình thường, nên việc code trong sáng, dễ đọc dễ hiểu là rất cần thiết.

<!--Thêm ví dụ-->

### 2, Open/Closed principle
![alt text](image-1.png)

Nguyên lý thứ 2 ứng với chữ `O` trong SOLID.  
Nội dung:  
>Không được sửa đổi một class có sẵn, nhưng có thể mở rộng bằng kế thừa.

<!--Thêm ví dụ-->

### 3, Liskov substitution principle
![alt text](image-2.png)  

Nguyên tắc thứ 3 ứng với chữ `L` trong SOLID.
Nội dung:  
>Bất cứ instance nào của class cha cũng có thể được thay thế bởi instance của class con của nó mà không làm thay đổi tính đúng đắn của chương trình.

### 4, Interface segregation principle
![alt text](image-3.png)

Nguyên tắc thứ 4 ứng với chữ `I` trong SOLID.
Nội dung:  
>Thay vì dùng 1 interface lớn, ta nên tách thành nhiều interface nhỏ, với nhiều mục đích cụ thể.  
Client không nên phụ thuộc vào interface mà nó không sử dụng.

### 5, Dependency inversion principle

Nguyên tắc thứ 5 ứng với chữ `D` trong SOLID.  
Nội dung:  
>1. Các module cấp cao không nên phụ thuộc vào các module cấp thấp, cả hai nên phụ thuộc vào Abstraction  
2. Interface (abstraction) không nên phụ thuộc vào chi tiết, mà ngược lại (Các class giao tiếp với nhau thông qua interface (abstraction), không phải thông qua implementation).

**Tại sao cần áp dụng nguyên tắc SOLID trong thiết kế code**  
+ `Rõ ràng, dễ hiểu`
  Giúp code dễ hiểu, tường minh để có thể làm việc nhóm tốt hơn.
+ `Dễ thay đổi`
  Giúp tạo ra các module, class rõ ràng, mạch lạc, mang tính độc lập cao. Khi cần thay đổi, mở rộng thì không tốn quá nhiều công sức.
+ `Tái sử dụng`
  Giúp code trở nên mạch lạc, dễ hiểu, dễ sử dụng.

## II. Kiss, DRY, YAGNI


## III. Mô hình MVC
![alt text](image-4.png)