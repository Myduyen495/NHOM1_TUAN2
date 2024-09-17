package bai4;

import java.util.Scanner;

public class laiNganHang {
	//4.	Tính toán lãi suất ngân hàng:
//	•	Nhập vào số tiền gửi, lãi suất hàng năm và số tháng gửi.
//	•	Tính số tiền lãi và số tiền gốc cuối kỳ.
//	•	In kết quả ra màn hình.
	public static void main(String[] args) {
		float tienGui, laiSuat, tienLai, tienGoc;
		int soThangGui;
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap so tien gui: ");
		tienGui = sc.nextFloat();
		System.out.println("nhap so thang ban gui: ");
		soThangGui = sc.nextInt();
		System.out.println("Lai suat ngan hang: ");
		laiSuat = sc.nextFloat();
		tienLai = tienGui*soThangGui*laiSuat;
		System.out.println("tien lai sau "+soThangGui+" thang: "+tienLai);
		tienGoc = tienGui + tienLai;
		System.out.println("tien goc cuoi ky: "+tienGoc);
	}
}
