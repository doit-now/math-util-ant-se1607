/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.giaolang.mathutil.core;

import org.junit.Assert;
import org.junit.Test;

public class MathUtilTest {
    
    //Framework ép dev phải viết code theo 1 khung dựng sẵn nào đó
    //thường khung dùng kí hiệu = @..., 
    //annotation - flag đánh dấu 1 điều gì đó sẽ diễn ra 
    //lúc biên dịch, runtime
    
    @Test  //test thử hàm so sánh 2 giá trị expected và actual
    //máy tự so sánh giùm luôn, ko nhìn = mắt để tự so sánh
    //như bên hàm main() dùng sout()
    //mà FW JUnit tự generate ra code so sánh giá trị, tự
    //dùng bảng màu XANH ĐỎ mang ý nghĩa PASSED FAILED
    public void tryAssert() {
        Assert.assertEquals(100, 100);
    }
    
    //test hàm getFactorial() nhà mình, như bên main() nhưng
    //chơi kiểu xanh đỏ
    
    @Test  //quy tắc đặt tên hàm dành cho kiểm thử
           //tên hàm bao hàm ngữ nghĩa của việc kiểm thử
           //test này kiểm tra tính gt với tham số tử tế 0..20
    public void testFactorialGivenRightArgumentReturnsWell() {
        
        //Test case #1: n = 0, 0! hy vọng trả về 1, thực tế
        //              hàm trả về mấy, chạy mới biết
        long expected = 1;
        long actual = MathUtil.getFactorial(0);
        
        Assert.assertEquals(expected, actual);
        
        //Test case #2: n = 1, 1! hy vọng trả về 1, thực tế?
        Assert.assertEquals(1, MathUtil.getFactorial(1));
        
        //Test case #3: n = 2, 2! hy vọng trả về 2, thực tế?
        Assert.assertEquals(2, MathUtil.getFactorial(2));
    }
    
    @Test
    public void testFactorialGivenRightArgumentReturnsWell2() {

        //Test case #4: n = 3, 3! hy vọng trả về 6, thực tế?
        Assert.assertEquals(6, MathUtil.getFactorial(3));
        
        //Test case #5: n = 4, 4! hy vọng trả về 24, thực tế?
        Assert.assertEquals(24, MathUtil.getFactorial(4));
    }
    
    //KIỂM THỬ NGOẠI LỆ KHI ĐƯA DATA CÀ CHỚN!!!
    //n < 0, ko tính giai thừa âm
    //n > 20, ko tính gia thừa tràn kiểu long
    //hàm đc thiết kế: NÉM RA NGOẠI LỆ TÊN LÀ Illegal-Argument-Exception
    //THAY VÌ NHẬN VỀ 1 GIÁ TRỊ LONG, BẠN NHẬN VỀ 1 CÂU CHỬI
    //TA ĐO LƯỜNG CÓ CÂU CHỬI XUẤT HIỆN HAY KO KHI N = -5
    //THẤY NGOẠI LỆ MỪNG RƠI NƯỚC MẮT
    
    //NẾU -5 mà app ném ra ngoại lệ IllegalArgumentException
    //nghĩa là HÀM ỔN, CHẠY NHƯ THIẾT KẾ, NHƯ KÌ VỌNG
    //VẬY NGHĨA LÀ HÀM PASSED MÀU XANH!!!
    //ĐÚNG KÌ VỌNG ~~~ MÀU XANH
    
    @Test(expected = Exception.class)
    public void testFactorialGivenWrongArgumentThrowsException() {
        MathUtil.getFactorial(-5);
        
        //Test case #6: n = -5, expected: hy vọng thấy ngoại lệ
        //tên là IllegalArgumentException
    }
    
}

//@Test: là 1 kí hiệu annotation báo với JUnit và JVM
//để generate cái hàm tryAssert() thành main() truyền thống
//và gửi cho JVM để chạy. App chạy từ main()
//thiếu @Test tương đương app thiếu main() no-runable

//CHỐT DEAL XANH ĐỎ:
//NẾU TẤT CẢ CÁC TEST CASES, @TEST ĐỀU MÀU XANH -> KẾT LUẬN HÀM
//ĐÚNG CHO NHỮNG THỨ MÌNH ĐÃ TEST, XANH CUỐI CÙNG KHI TẤT
//CẢ @TEST PHẢI XANH
//1. XANH KHI TẤT CẢ CÙNG XANH

//NẾU TRONG CÁC @TEST CÓ ÍT NHẤT 1 THẰNG ĐỎ/XEM NHƯ TẤT CẢ
//LÀ ĐỎ, Ý NGHĨA LÀ HÀM ĐÚNG THÌ PHẢI ĐÚNG HẾT, CÓ 1 THẰNG SAI
//HÀM KO ỔN ĐỊNH VỀ KẾT QUẢ -> PHẢI GỌI LÀ HÀM SAI

//2. ĐỎ KHI CÓ ÍT NHẤT 1 THẰNG ĐỎ
//ĐỎ ĐẾN TỪ 1 TRONG TÌNH HUỐNG
//EXPECTED đã tính đúng, ACTUAL trả về sai -> BUG CỦA HÀM
//EXPECTED đã tính/gõ sai, ACTUAL sai đúng 