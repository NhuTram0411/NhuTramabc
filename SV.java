package th4;
import java.util.*;

public class SV {
	private String hoTen;
	private Date ngaySinh;
	private double dtb;

	public SV(String hoTen, Date ngaySinh, double dtb) {
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.dtb = dtb;
	}

	public String layHoTen() {
		return hoTen;
	}

	public void ganHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public Date layNgaySinh() {
		return ngaySinh;
	}

	public void ganNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public double layDTB() {
		return dtb;
	}

	public void ganDTB(double dtb) {
		this.dtb = dtb;
	}

	public void hienThi() {
		System.out.println("hoTen=" + hoTen + ", ngaySinh=" + ngaySinh.getDate() + "/" + ngaySinh.getMonth() + "/"
				+ ngaySinh.getYear() + ", dtb=" + dtb);
	}

	public String layHo() {
		String a = this.layHoTen();
		return a.split(" ")[0];

	}

	public String layDem() {
		StringTokenizer a = new StringTokenizer(this.layHoTen());
		int dem = a.countTokens() - 1;
		String s = " ";
		for (int i = 1; i < dem; i++) {
			s = s.concat(this.layHoTen().split(" ")[i]);
			if (i != dem - 1) {
				s = s.concat(" ");
			}
		}
		return s;
	}

	public String layTen() {
		StringTokenizer a = new StringTokenizer(this.layHoTen());
		return this.layHoTen().split(" ")[a.countTokens() - 1];
	}

	public int layTuoi() {
		Date nowday = new Date();
		return (nowday.getYear() + 1900) - this.ngaySinh.getYear();
	}

	public String layXepLoai() {
		if (dtb < 5) {
			return "Yeu";
		} else {
			if (dtb < 7 & dtb >= 5) {
				return "Trung Binh";
			} else {
				if (dtb >= 7 & dtb < 8) {
					return "Kha";
				} else {
					return "Gioi";
				}
			}

		}
	}
}
