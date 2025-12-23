/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wangfong.mathutil.main;

import com.wangfong.mathutil.core.MathUtil;

/**
 *
 * @author qp
 */
public class Main {
    public static void main(String[] args) {
        //thử nghiệm hàm tính giai thừa coi chạy đúng như thiết kế hay ko 
        //ta phải đưa ra các tình huống sử dụng hàm trong thực tế 
        //vd : -5 coi được không 
        //      0 coi tính mấy
        //      1
        //      20
        //      21 
        //TESTCASE : Một tình huống hàm/app/màn hình/tính năng được đưa vào sử dụng 
        //giả lập hành vi xài của ai đó!
        
        // TEST CASE : LÀ 1 TÌNH HUỐNG SỬ DỤNG, XÀI APP (HÀM) MÀ NÓ BAO GỒM:    
        //              INPUT: DATA ĐẦU VÀO CỤ THỂ NÀO ĐÓ 
        //              OUTPUT: ĐẦU RA ỨNG VỚI XỬ LÍ CỦA HÀM/CHỨC NĂNG CỦA APP, 
        //              DĨ NHIÊN DÙNG ĐẦU VÀO ĐỂ XỬ LÍ 
        //              KÌ VỌNG: MONG HÀM SẼ TRẢ VỀ VALUE NÀO ĐÓ ỨNG VỚI INPUT Ở TRÊN 
        //              SO SÁNH ĐỂ XEM KẾT QUẢ CÓ NHƯ KÌ VỌNG HAY KHÔNG 
        
        long excepted = 120 ; //nếu n = 5 
        int n = 5; //input
        System.out.println("5! = 120 (excepted); actual: "+MathUtil.getFactorial(5));
    }
}


//đã sửa file build-impl.xml trong nbproject 
//để khi clean and build sẽ test luôn, test fail sẽ build failed luôn
