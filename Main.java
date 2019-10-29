package th3;


import th3.Diem;

class Main {
	public static void main(String[] args) {
		Diem d1= new Diem("Lap trinh Java", 4, 8, 7 ,8);
		Diem d2= new Diem("Lap trinh c", 5, 9, 9, 8);
		SinhVien s1= new SinhVien("Lê Thị Như Trâm",d1, d2);
		System.out.println(d1);
		System.out.println(s1);
	}
}

