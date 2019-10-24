package TH3;
class Diem {
	private String tenHocPhan;
	private int soTinChi;
	private double chuyenCan, giuaKy, cuoiKy;
	
	public Diem(String tenHP, int soTC, double cc, double gKy, double cKy) {
		tenHocPhan= tenHP;
		soTinChi= soTC;
		chuyenCan= cc;
		giuaKy= gKy;
		cuoiKy= cKy;
	}
	
	public double tinhDiem() {
		return (chuyenCan *0.1) +(giuaKy*0.2) +(cuoiKy*0.7);
	}
	
	public String toString() {
		return "Hoc phan: "+tenHocPhan +", "+"co "+ soTinChi+ " tin chi";
	}
}
