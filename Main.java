package TH3;
class Main {
	public static void main(String[] args) {
		Diem d1= new Diem("Lap trinh Java", 5, 6, 7, 6);
		Diem d2= new Diem("Lap trinh c", 7, 7, 6, 9);
		SinhVien s1= new SinhVien("Lê Thị Như Trâm",d1, d2);
		System.out.println(d1);
		System.out.println(s1);
	}
}

