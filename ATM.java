package th2;

class ATM {
	private String soTK;
	private double soDu;

	public ATM(String stk, double sd) {
		soTK = stk;
		soDu = sd;
	}

	public String laySTK() {
		return soTK;
	}

	public double laySoDu() {
		return soDu;
	}

	public String toString() {
		return "soDu: " + soDu + "\nsoTK: " + soTK;
	}

	public void napTien(double st) {
		soDu += st;
	}

	public boolean rutTien(double st) {
		if (st <= soDu - 50) {
			soDu -= st;
			return true;
		}
		return false;
	}

	public boolean chuyenTien(ATM tk, double st) {
		if (st <= soDu - 50) {
			soDu -= st;
			tk.napTien(st);
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		ATM a, b;
		a = new ATM("1111111", 10000);
		b = new ATM("2222222", 50000);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println("---------");

		a.napTien(1000);
		System.out.println(a);
		System.out.println("---------");

		
		a.chuyenTien(b, 500);
		System.out.println(a);
		System.out.println(b);
		System.out.println("---------");

		
		b.rutTien(200);
		System.out.println(b);
		System.out.println("---------");
		
		double tong;
		tong= a.laySoDu() +b.laySoDu();
		System.out.println("Tong la: "+ tong);
				
	}

}


