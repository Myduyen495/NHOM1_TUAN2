import java.util.Scanner;

public class tinh_Toan {
public static void main(String[] args) {
	//3.	Nhập vào hai số nguyên từ bàn phím. Tính tổng, hiệu, tích, thương và phần dư của hai số đó. In kết quả ra màn hình.
	int a, b, tong, hieu, tich, phanDu;
	float thuong;
	Scanner sc = new Scanner(System.in);
	System.out.println("nhap a: ");
	a = sc.nextInt();
	System.out.println("nhap b: ");
	b = sc.nextInt();
	tong = a + b;
	System.out.println(a + " + " +b + " = "+tong);
	hieu = a - b;
	System.out.println(a + " - " +b + " = "+hieu);
	tich = a*b;
	System.out.println(a + " * " +b + " = "+tich);
	thuong = (float)a/b;
	System.out.println(a + " / " +b + " = "+thuong);
	phanDu = a%b;
	System.out.println(a + " % " +b + " = "+phanDu);
}
}
