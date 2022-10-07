/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.giaolang.mathutil.main;

import com.giaolang.mathutil.core.MathUtil;

/**
 *
 * @author giao.lang
 */
public class Main {

    public static void main(String[] args) {
        
        //Test case #1: n = 0 -> expected getF(0) -> trả về 1
        long expected = 1;
        long actual = MathUtil.getFactorial(0);
        System.out.println("0! status: expected = " + expected
                                   + " | actual = " + actual);
        
        //Test case #2: n = 1 -> expected getF(1) -> trả về 1 luôn
        System.out.println("1! status: expected = 1"
                                   + " | actual = " + MathUtil.getFactorial(1));
        
        //Test case #3: n = 5 -> expected getF(5) -> trả về 120
        System.out.println("5! status: expected = 120"
                                   + " | actual = " + MathUtil.getFactorial(5));
        
        //Test case #4: n = -5 -> expected getF(-5) -> NHẬN CÁI CHỬI/CÚ TÁT; ĐƯA N
        //                                             CÀ CHỚN 
        
//        System.out.println("-5! status: expected = EXCEPTION"
//                                   + " | actual = " + MathUtil.getFactorial(-5));

        System.out.println("-5! status: expected = EXCEPTION"
                                   + " | actual = ");
        //MathUtil.getFactorial(-5);
        
        //NẾU CÓ EXCEPTION XẢY RA, MỪNG RƠI NƯỚC MẮT
        //VÌ HÀM CHẠY NHƯ THIẾT KẾ VỚI -5
        
    }
    
}

//VIỆC CHẠY BỘ TEST/ XEM TỪNG DÒNG KẾT QUẢ ĐƯỢC IN RA, ĐỂ SUY LUẬN
//SO SÁNH, ĐỂ K/L HÀM ĐÚNG SAI -> VỤ NÀY MẤT SỨC, 
//VÌ PHẢI DÙNG MẮT + SUY LUẬN -> MANUAL TEST, RẤT CẢM GIÁC THỦ CÔNG

//KO HIỆU QUẢ NẾU CODE ĐC CHỈNH SỬA, TA LẠI PHẢI LUẬN LẠI KẾT
//QUẢ BẰNG THỦ CÔNG: MẮT QUÉT QUA CÁC KẾT QUẢ, TỰ SO SÁNH, TỰ KL

//KĨ THUẬT THỨ 2 XUẤT HIỆN: TEST AUTOMATION
//TỨC LÀ VẬN CHẠY BỘ TEST NHƯ MANUAL, NHƯNG KO CẦN MẮT NHÌN
//TỪNG KẾT QUẢ ĐỂ SO SÁNH, ĐỂ KẾT LUẬN, MÁY DƯ SỨC SO SÁNH
//MÁY KẾT LUẬN GIÙM LUÔN, TA CHỈ NHÌN 2 THỨ DUY NHẤT SAU KHI 
//CHẠY QUA 1 ĐÁM TEST CASE: ĐÚNG SAI/XANH ĐỎ/ĐÚNG: XANH, SAI: ĐỎ

