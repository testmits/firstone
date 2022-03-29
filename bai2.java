package baiTap;
import java.util.Scanner;
public class bai2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int ChiSoMoi = 0, ChiSoCu = 0;
		System.out.print("Mời bạn nhập chỉ số cũ: ");
		ChiSoCu = scan.nextInt();
		System.out.print("Mời bạn nhập chỉ số mới: ");
		ChiSoMoi = scan.nextInt();
		int DinhMuc = 50;//Định mức sử dụng điện cho mỗi hộ là: 50 KW
		int DonGiaDinhMuc = 230;//Định mức sử dụng điện cho mỗi hộ là: 50 KW với giá 230đ/KW
		int TienThueBaoDienKe = 1000;//Tiền thuê bao điện kế: 1000đ/tháng
		int PhanDinhMuc;
		int LuongDienSuDung = ChiSoMoi - ChiSoCu;
		int PhanVuotDinhMuc;
		if (LuongDienSuDung > DinhMuc)
		{
			PhanDinhMuc = DinhMuc;
			PhanVuotDinhMuc = LuongDienSuDung - DinhMuc;/*Nếu dùng quá định mức thì phần vượt định
		     											mức bằng lượng điện sử dụng trừ đi định mức*/
		}
		else
		{
		    PhanVuotDinhMuc = 0;//Nếu dùng không quá định mức thì phần vượt định mức = 0
		    PhanDinhMuc = LuongDienSuDung;
		}
		int DonGiaVuotDinhMuc = 0;
		int TienVuotDinhMuc =0 ;
        if (PhanVuotDinhMuc <= 50) 
        {
        	DonGiaVuotDinhMuc = 480;
        	TienVuotDinhMuc = DonGiaVuotDinhMuc * PhanVuotDinhMuc;
        } else if (PhanVuotDinhMuc <= 100) 
        {
        	DonGiaVuotDinhMuc = 700;
        	TienVuotDinhMuc = 480*50 + DonGiaVuotDinhMuc * (PhanVuotDinhMuc -50);
        } else 
        {
        	DonGiaVuotDinhMuc = 900;
        	TienVuotDinhMuc = 480*50 + 700*50 + DonGiaVuotDinhMuc * (PhanVuotDinhMuc - 100);
        }
        int TienTraDinhMuc = PhanDinhMuc * DonGiaDinhMuc;
		int TongTienPhaiTra = TienTraDinhMuc + TienVuotDinhMuc + TienThueBaoDienKe;
		System.out.println("--------------");
		System.out.println("Chỉ số cũ: " + ChiSoCu);//In ra màn hình chỉ số cũ
		System.out.println("Chỉ số mới: " + ChiSoMoi);//In ra màn hình chỉ số mới
		System.out.println("Tiền trả định mức: " + TienTraDinhMuc);//In ra màn hình tiền trả định mức
		System.out.println("Tiền trả vượt định mức: " + TienVuotDinhMuc);//In ra màn hình tiền trả vượt định mức
		System.out.println("Tổng tiền phải trả: " + TongTienPhaiTra);
	}

}
