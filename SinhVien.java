package TH3;
class SinhVien {
	private String hoTen;
	private Diem dm1, dm2;
	
	public SinhVien(String ten, Diem dm1, Diem dm2) {
		hoTen= ten;
		this.dm1= dm1;
		this.dm2= dm2;
	}
	
	public double tinhDTB() {
		return (dm1.tinhDiem()+dm2.tinhDiem())/2;
	}
	
	public String toString() {
		return "Ten là: "+hoTen +", D1: "+dm1.tinhDiem()
		+", D2: "+dm2.tinhDiem()+", DTB: "+ tinhDTB();
	}
}