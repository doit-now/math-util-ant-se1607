/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.giaolang.mathutil.core;

/**
 *
 * @author giao.lang
 */
public class MathUtil {
    
    //trong class này ta sẽ viết các hàm tiện ích/dùng chung 
    //cho nhiều class khác. Cái gì mà chung cho các class khác
    //thì thường sẽ THIẾT KẾ LÀ STATIC
    
    //hàm này tính n! = 1.2.3.4...n
    //Quy ước: ko có giai thừa âm
    //         0! = 1! = 1
    //         chỉ tính n từ 0..20, vì
    //         21! vượt 18 con số 0, vượt long 
    
    //viết hàm tính giai thừa theo style đệ quy!!! RECURSION
    //n! = 1.2.3.4.5...n
    //5! = 1.2.3.4.5
    //5! = 4! x 5 = 5 x 4!
    //4! = 1.2.3.4 = 3! x 4 = 4 x 3!
    //3! = 3 x 2!
    //2! = 2 x 1!
    //1! = 1 
    //n! = n x (n - 1)!
    //LẶP LẠI CHÍNH MÌNH VỚI 1 QUY MÔ NHỎ HƠN
    //n! = ~~~ RETURN N X (N - 1)!
    //CHỮ GIAI THỪA XUẤT HIỆN 2 LẦN 
    
    
    public static long getFactorial(int n) {
        
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid n. N must be between 0..20");
        
//        if (n == 0 || n == 1)
//            return 1;  //CHỐT DỪNG ĐỆ QUY!!!
        
        //từ 2! trở đi là đoạn code dưới đây!!!
        return n * getFactorial(n - 1);
        //mình = mình x quy mô nhỏ hơn
        
    }
    
//    public static long getFactorial(int n) {
//        
//        if (n < 0 || n > 20)
//            throw new IllegalArgumentException("Invalid n. N must be between 0..20");
//        
//        if (n == 0 || n == 1)
//            return 1;
//        
//        long product = 1; //biến tích luỹ acc/accumulation
//        for (int i = 2; i <= n; i++) 
//            product *= i;  //product = product * i;
//        
//        return product;
//    }
    
}

//Học kĩ thuật viết code đc gọi là TDD - TEST DRIVEN DEVELOPMENT
//Là kĩ thuật ngay khi viết code, ngay khi thiết kế ra tên hàm/class
//đã phải chuẩn bị luôn bộ kiểm thử - chuẩn bị luôn các TEST CASE
//chuẩn bị luôn các tình huống (case) sẽ xài hàm này như thế nào
//chuẩn bị luôn các tình huống test các hàm để xác định hàm đúng/sai
//viết code hướng về đảm bảo các bài kiểm thử đặt ra
//Các test cases - các tình huống xài hàm 1 khi hàm viết xong

//Case #1: n = 0; getFactorial(0) -> expected hy vọng hàm trả ra: 1
//Case #2: n = 1; getFactorial(1) -> expected value == 1
//Case #3: n = 5; getFactorial(5) -> expected value == 120

//Case #4: n = -5; getFactorial(-5) -> expected value: CHỬI, KO HỢP LỆ N
//Case #5: n = 21; getFactorial(21) -> expected value: CHỬI, KO HỢP LỆ N
//                                                     VALIDATOR/VALIDATION

//TEST CASE: LÀ 1 tình huống kiểm thử app/màn hình/tính năng
//           xem nó chạy đúng hay ko? 
//           bằng cách đưa data cụ thể nào đó, xem nó outputra có đúng
//           như dự kiến trước đó hay ko, tức là 
//           đưa data, chờ app xử lí, và so sánh kết quả (actual) với
//                                                        expected