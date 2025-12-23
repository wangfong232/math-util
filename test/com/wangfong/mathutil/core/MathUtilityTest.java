/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.wangfong.mathutil.core;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author qp
 */
public class MathUtilityTest {

    //đây là class sẽ dùng các hàm của thư viện /framework JUnit
    //để kiểm tra code chính - hàm tính Giai thừa bên class core.MathUtil
    //viết code để test code 
    //có nhiều quy tắc đặt tên hàm kiểm thử 
    //nhưng thường sẽ là nói lên mục đích của các case/tình huống kiểm thử
    //tình huống xài hàm theo kiểu thành công và thất bại !!!
    //hàm dưới đây là tình huống test hàm chạy thành công, trả về ngon 
    //ta sẽ xài hàm theo kiểu well - đưa 5!
    //@Test JUnit sẽ phối hợp với JVM để chạy hàm này 
    //@Test phía hậu trường chính là public static void main() 
    //có nhiều @Test ứng với nhiều case khác nhau để kiểm thử cái hàm tính giai thừa 
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell() {
        int n = 0;  //test thử tình huống tử tế đầu vào , mày phải chạy đúng 
        long excepted = 1;  //hy vọng 0! = 1

//        long actual = ;     //gọi hàm cần test bên core/app chính  / code chính
        long actual = MathUtil.getFactorial(0);
        Assert.assertEquals(excepted, actual);

        //hàm giúp so sánh 2 giá trị nào đó có giống nhau không 
        //nếu giống nhau -> thảy màu xanh
        //nếu ko giống   ->          đỏ         => hàm ý excepted và actual ko giống nhau 
//gộp thêm vài case thành công/đưa đầu vào ngon!! hàm phải tính ngon 
        Assert.assertEquals(1, MathUtil.getFactorial(1));
        Assert.assertEquals(2, MathUtil.getFactorial(2));
        Assert.assertEquals(6, MathUtil.getFactorial(3));
        Assert.assertEquals(24, MathUtil.getFactorial(4));
        Assert.assertEquals(120, MathUtil.getFactorial(5));
        Assert.assertEquals(720, MathUtil.getFactorial(6));

    }

    //hàm getF() ta thiết kế có 2 tình huống xử lí 
    //1. đưa data 0..20 -> tính đúng được n! - done
    //2. đưa data vào cà chớn, âm, > 20; THIẾT KẾ CỦA HÀM LÀ NÉM RA NGOẠI LỆ  
    //TAO KÌ VỌNG NGOẠI LỆ SẼ XUẤT HIỆN KHI N<0 || N>20
    //rất mong ngoại lệ xuất hiện với n cà chớn này  
    //nếu hàm nhận đúng vào n<20 >20 và ném ra ngoại lệ 
    //hàm chạy đúng như thiết kế 
    //Test case: 
    //input : -5
    //expected : IllegalArgumentException xuất hiện 
    //tình huống bất thường, ngoại lê, ngoài dự tính, dự liệu 
    //là những thứ không thể đo lường so sánh theo kiểu value 
    //mà chỉ có thể đo lường - cách chúng có xuất hiện hay ko 
    //assertEquals() ko dùng để so sánh 2 ngoại lệ 
    //      equals() là bằng nhau hay ko trên value!!!
    //
    //Màu đỏ đó em , DO HÀM ĐÚNG LÀ NÉM RA NGOẠI LỆ THỰC SỰ 
    //               NHƯNG KO PHẢI NGOẠI LỆ NHƯ KÌ VỌNG - THỰC SỰ KÌ VỌNG SAI 
    //               KO PHẢI HÀM NÉM SAI 
//     @Test(expected = NumberFormatException.class )
//    public void testGetFactorialGivenWrongArgumentThrowException() {
//        MathUtil.getFactorial(-5);      //hàm @Test chạy , hay hàm getF() chạy 
//                                        // sẽ ném về ngoại lệ NumberFormat 
//    }
    @Test(expected = IllegalArgumentException.class)
    public void testGetFactorialGivenWrongArgumentThrowException() {
        MathUtil.getFactorial(-5);      //hàm @Test chạy , hay hàm getF() chạy 
        // sẽ ném về ngoại lệ NumberFormat 
    }

    //cách khác để bắt ngoại lệ xuất hiện, viết tự nhiên hơn !!!
    @Test
    public void testGetFactorialGivenWrongArgumentThrowException_Lambda() {
//         Assert.assertThrows(tham số 1 : loại ngoại lệ muốn so sánh,
//                             tham số 2 : đoạn code văng ra ngoại runnable);

            Assert.assertThrows(IllegalArgumentException.class , 
                                () -> MathUtil.getFactorial(-5)
                    );
    }

    @Test
    public void testGetFactorialGivenWrongArgumentThrowException_TryCatch() {
        //chủ động kiểm soát ngoại lệ 
        try{
            MathUtil.getFactorial(-5);
        }catch(Exception e){
            //bắt try-catch là JUnit sẽ ra màu xanh do đã chủ động kiểm soát ngoại lệ 
            //nhưng ko chắc ngoại lệ mình cần có xuất hiên hay ko
            //có đoạn kiểm soát đúng ngoại lệ
            Assert.assertEquals("Invalid argument. N must be between 0..20", e.getMessage());
        }
    }
}
