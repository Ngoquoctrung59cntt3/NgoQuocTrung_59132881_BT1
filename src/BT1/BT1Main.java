/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1;
import BT1.CaNhan;
/**
 *
 * @author Trung_PC
 */
public class BT1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LopHoc Lhoc = new LopHoc();
        HocSinh hocSinh1 = new HocSinh("59CNTT3", "Ca Hát", "Ngô Quốc Trung", 21, "Tam Quan", "034199771");
        HocSinh hocSinh2 = new HocSinh("59CNOT2", "Ngoại Ngữ", "Nguyễn Viết Hưng", 21, "Phú Yên", "0963653013");
        GiaoVien giaoVien1 = new GiaoVien("Tâm lý học đại cương", "Khoa học xã hội và nhân văn", "Ngô Thế Lâm", 30, "Nha Trang", "0123456789");
        GiaoVien giaoVien2 = new GiaoVien("Mẫu thiết kế", "Công nghệ phần mềm", "Huỳnh Tuấn Anh", 32, "Nha Trang", "0123456789");
        
        Lhoc.themHocSinh(hocSinh1);
        Lhoc.themHocSinh(hocSinh2);
        Lhoc.themGVGD(giaoVien1);
        Lhoc.themGVGD(giaoVien2);
        
        Lhoc.inDSHS();
        Lhoc.inDSGVGD();
    }
    
}
