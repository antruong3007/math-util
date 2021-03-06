/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thienan;

/**
 *
 * @author HP
 */
public class MathUtility {
    // đây là class mô phỏng lại class Math, chứa các hàm xài chung 
    // hàm xài chung, không lưu lại điều gì -> static 
    public static final double PI = 3.1415;
    
    // hàm tính n!
    // n! tăng rất nhanh về giá trị
    // 21! tràn kiểulong, hơn 18 số 0
    // bài này là ta tính từ 0..20!. Âm khg tính đc, 0! = 1! = 1
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) 
            throw new IllegalArgumentException("n must be between 0....20");
        
        // sống sót đến đây thì n = 0, 1, ... 20
        if (n == 0 || n == 1)
            return 1;
        long result = 0;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        
        return result;
    }
}
