/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.giaolang.mathutil.core;


import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)  //class này chuẩn bị chơi trò
//tách data ra khỏi câu lệnh xanh đỏ cho dễ kiểm soát các test case
//Thư viện JUnit nó sẽ tự generate thêm code phía hậu trường, lúc biên
//dịch để giúp hiện thực hoá ý tưởng DDT
//ví dụ nó sẽ tự biết lấy data ở mảng 2 chiều nào đó nhồi vào hàm
//assertEquals()
//ép ta phải viết code theo cách nào đó định trước mới chạy đc
//thư viện đó đc gọi tên mới: FRAMEWORK
public class MathUtilDDTTest {

    //ta tự tạo ra 1 cái hàm, tên tuỳ ý, trả về mảng 2 chiều
    //chứa danh sách data ta dự định nhồi vào hàm getF() và assertE()
    //phần duyệt mảng để nhồi vào hàm test, FRAMEWORK sẽ tự lo, coder
    //ko cần lo
    
    @Parameterized.Parameters  //bộ data nè
    public static Object[][] initData() {
        //int a[] = {5, 10, 15, 20, 25};
        //mảng có giá trị ngay lúc khai báo, 
        //thì dùng {các phần tử cách nhau dấu ,}        
        //Object arr1[][] = {{1, 0}, {1, 1}, {2, 2}, {6, 3}, {24, 4}, {120, 5}, {720, 6}};        
        return new Integer[][] {
                            {1, 0},
                            {1, 1},
                            {2, 2},
                            {6, 3},
                            {24, 4},
                            {120, 5},
                            {720, 6}
                         };
       
    }
    
    @Parameterized.Parameter(value = 0)
    public long expected; //biến này sẽ lưu giá trị kì vọng khi xài hàm
    //getFactorial() -> expected
    
    @Parameterized.Parameter(value = 1)
    public int n;  //biến này sẽ lưu giá trị đưa cho hàm getF() để check hàm
    //ta sẽ map/ánh xạ 2 biến này ứng với 2 cột của từng dòng 
    //của mảng ở trên!!!
    //ta phải quy ước biến expected map vào cột nào mình muốn
    //thứ tự biến ko quan trọng, thứ tự cột trong mảng ko quan trọng
    //vì ta sẽ cấu hình việc map tương ứng này!!!
    
    //test hoy, test các test cases
    @Test
    public void testFactorialGivenRightArgumentReturnsWell() {
        Assert.assertEquals(expected, MathUtil.getFactorial(n));
    }

}

//DDT: Data Driven Testing, là 1 kĩ thuật viết code 
//kiểm thử dùng trong Unit Test, 
//dùng để viết code test các hàm/class một cách dễ đọc hơn!!!
//bằng cách tách data kiểm thử và câu lệnh test hàm thành 2 
//nơi khác nhau
//ví dụ cách cũ, non-DDT vừa làm xong!!!
//assertEquals(1, getF(0))
//assertEquals(1, getF(1))
//assertEquals(2, getF(2))
//assertEquals(6, getF(3))
//assertEquals(24, getF(4))
//assertEquals(120, getF(5))
//assertEquals(720, getF(6))
//cách này dễ viết nhưng khó kiểm tra đủ hết tập test cases cần
//test, trộn lẫn data đưa vào, và câu lệnh gọi hàm kiểm thử
//KĨ THUẬT TÁCH DATA 00, 11, 22, 63, 244 1205, 7206
//để riêng ra 1 chỗ, sau đó nhồi fill/feed nạp chúng vào 
//EXP   n 
//1   | 0
//1   | 1 
//2   | 2
//6   | 3
//24  | 4
//120 | 5
//729 | 6
//MẢNG 2 CHIỀU
//lệnh gọi hàm assertEquals(?, getF(?))
//giúp code trong sáng dễ hiểu
//kĩ thuật này gọi là: DATA     DRIVEN          TESTING
//                    tách data      hướng về   code kiểm thử           
//THAM SỐ HOÁ DATA - BIẾN DATA RA 1 NƠI, ĐẶT CHO CHÚNG TÊN BIẾN
//LÁT HỒI NHỒI VÀO LỆNH SO SÁNH
//THAM SỐ HOÁ - BIẾN DATA THÀNH BIẾN THAM SỐ - PARAMETERIZED

//JUNIT sẽ tự tách mảng ra thành các test case
//chạy so sánh XANH ĐỎ CỦA TỪNG TEST CASE VÀ ĐƯA RA KẾT LUẬN CHUNG!!!
//XANH KHI TẤT CẢ CÙNG XANH
//CHỈ 1 THẰNG ĐỎ, TẤT CẢ ĐỎ - HÀM Ý HÀM ĐÚNG LÀ PHẢI ĐÚNG HẾT KHI ĐC TEST

//KHI ĐỎ, THÌ CÓ 2 TÌNH HUỐNG
//ĐỎ: DO CÓ SỰ != NHAU GIỮA EXPECTED VÀ ACTUAL
//ĐỎ VÌ EXPECTED != ACTUAL, VẬY KO BẰNG VÌ LÝ DO GÌ?
//1. EXPECTED LÀ GIÁ TRỊ TÍNH TOÁN TRƯỚC, HÀM PHẢI TRẢ VỀ BẰNG ĐC GIÁ
//TRỊ NÀY, VÀ EXPECTED MÌNH TÍNH = TAY KHI CHƯA XÀI APP, PHẢI TÍNH ĐÚNG
//MÀU ĐỎ LÀ DO ACTUAL ÉO GIỐNG, TỨC LÀ CODE SAI, BUG!!!

//2. EXPECTED MÌNH TÍNH BẰNG TAY, VÀ BỊ SAI, KÌ VỌNG ĐÃ SAI TRƯỚC
//KHI ĐÓ HÀM TRẢ VỀ CHO DÙ CÓ ĐÚNG THÌ CŨNG BỊ MÀU ĐỎ
//KÌ VỌNG SAI THÌ KO THỂ KẾT LUẬN ĐC HÀM CÓ BUG HAY KO?!!!!

//BTVN: LÀM VIỆC NHÓM
//Hãy chọn 1 Unit Test Framework nhóm thích
//Java: JUnit (cấm chọn do tao demo rồi), TestNG
//C#  : NUnit, xUnit, MSTest (NuGet)
//search Google "Unit Test Framework for NNLT???" ra tên thư viện
//Thứ 3 của tuần thứ 6 demo, mỗi nhóm 30p
//SẼ QUAY VIDEO ĐƯA LÊN YT
