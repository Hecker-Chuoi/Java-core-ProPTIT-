# Interface, abstract class và tính trừu tượng trong Java

## 1. Interface là gì
Interface trong Java là bản vẽ của lớp, được thiết kế để đạt được sự trừu tượng hoàn toàn. Interface chỉ chứa các phương thức trừu tượng và các trường hằng. Khi nhìn vào phần khai báo của một Interface, ta có thể nhìn thấy một cấu trúc tổng quan các phương thức của các class triển khai interface đó.

Các phương thức trừu tượng chỉ có phần khai báo (chứa tên và các tham số) và không có phần thân. Các phương thức trong interface có access modifier dưới dạng public và abstract, tương tự các trường của interface được khai báo dưới dạng hằng với public, static và final. Một class triển khai interface cần phải định nghĩa lại tất cả các phương thức chứa trong đó.

### Syntax khai báo Interface

```java
interface <name>{
    // declare constant fields, implicity public, static and final.
    // declare methods, implicity public and abstract
}
```

***Ví dụ***
```java
interface Vehicle{
    final int abc = 10;
    final String s = "abc";

    void run();
    void stop();
    void turnLeft();
    void turnRight();
}
```

### Mối quan hệ giữa class và interface
![Alt text](image.png)

Một class muốn triển khai interface cần khai báo kèm từ khóa `implements`. Ngoài ra ở trong java, interface hỗ trợ đa kế thừa, một class có thể implement nhiều interface.

```java
import java.io.*;

interface In1 {

    final int a = 10;

    void display();
}

class TestClass implements In1 {
   
    public void display(){ 
      System.out.println("ABC"); 
    }

    public static void main(String[] args)
    {
        TestClass t = new TestClass();
        t.display();
        System.out.println(a);
    }
}
```

**Output**
>ABC
>10

### Một số tính năng mới cho interface kể từ JDK 8
1. Default method
Default method là một phương thức không cần phải ghi đè và có thể sử dụng trong các đối tượng thuộc class con. Việc này có ý nghĩa khi ta muốn cập nhật thêm 1 function nào đó, sử dụng default function thì ta không cần phải viết lại hay chỉnh sửa nhiều.

```java
interface In1
{
    final int a = 10;
    default void display()
    {
        System.out.println("New function");
    }
}

class TestClass implements In1
{
    // Driver Code
    public static void main (String[] args)
    {
        TestClass t = new TestClass();
        t.display();
    }
}
```
**Output**
>New function

2. Cho phép khai báo static method
Static method là phương thức có thể gọi và sử dụng một cách độc lập mà không cần phải thông qua đối tượng của lớp đó.

```java
interface In1
{
    final int a = 10;
    static void display()
    {
        System.out.println("Static method");
    }
}

class TestClass implements In1
{
    public static void main (String[] args)
    {
        In1.display();
    }
}
```
**Output**
>Static method

### Kế thừa interface
Một interface có thể kế thừa một interface khác sử dụng từ khóa `extends`. Khi một class triển khai interface con thì nó phải định nghĩa các phương thức thuộc cả interface cha con.

```java
interface A {
    void method1();
    void method2();
}

interface B extends A {
    void method3();
}

class abc implements B {
    public void method1()
    {
        System.out.println("Method 1");
    }
    public void method2()
    {
        System.out.println("Method 2");
    }
    public void method3()
    {
        System.out.println("Method 3");
    }
}
```

## 2. Abstract class
Abstract class trong Java được khai báo với từ khóa `abstract`, có thể chứa cả `abstract methods` và `non-abstract methods`.

Ta không thể tạo 1 đối tượng thuộc lớp abstract, ta cần phải kế thừa lớp này và tạo đối tượng thuộc lớp con thì mới có thể sử dụng các thuộc tính và phương thức của nó.

***Dưới đây là một số đặc điểm quan trọng của abstract-class***
1. Không thể tạo đối tượng thuộc abstract class
2. Có thể có constructor
3. Có thể khai báo `final method` bên trong abstract class nhưng một abstract class không thể để ở dạng final, bởi vì các abstract method cần phải được ghi đè ở class con, việc khai báo method là `final` sẽ ngăn điều này gây ra xung đột:
> Illegal combination of modifiers: abstract and final
4. Một abstract class có thể không chứa 1 abstract method nào
5. Có thể khai báo `static methods` bên trong abstract class
6. Nếu 1 class chứa ít nhất 1 abstract method thì phải để class ấy cũng là abstract

***Ví dụ***
```java
import java.io.*;

abstract class Subject {
	Subject() { 
	System.out.println("Learning Subject"); 
	}

	abstract void syllabus();

	void Learn(){
		System.out.println("Preparing Right Now!");
	}
}

class IT extends Subject {
void syllabus(){
	System.out.println("C , Java , C++");
}
}

class GFG {
	public static void main(String[] args) {
		Subject x=new IT();
	
		x.syllabus();
		x.Learn();
	}
}
```

**Output**
>Learning Subject
>C, Java, C++
>Preparing Right Now!

## 3. So sánh Interface và Abstract class

|*Interface*|*Abstract class*   |
|:---:|:---:|
|Chỉ có thể chứa abstract method|Có thể chứa cả abstract method và non-abstract method |
|Hỗ trợ đa kế thừa, kế thừa hỗn hợp, một class có thể kế thừa nhiều interface|Không hỗ trợ đa kế thừa, mỗi class chỉ có thể kế thừa 1 abstract class|
|Các thuộc tính mặc định ở dạng public static final, còn các method mặc định ở dạng public abstract|Access modifiers không bị ràng buộc, một abstract class có thể không chứa abstract method nào|
|Sử dụng từ khóa `implements`|Sử dụng từ khóa `extends`|