package TH2;

class PS {

    protected int tu;
    protected int mau;

    public PS(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
        rutGon();
    }

    public PS(int n) {
        tu = n;
        mau = 1;
    }

    public void PS(int t, int m) {
        tu = t;
        mau = m;
    }

    public PS(PS p) {
        tu = p.layTu();
        mau = p.layMau();
    }

    public void ganTu(int t) {
        tu = t;
    }

    public int layTu() {
        return tu;
    }

    public void ganMau(int m) {
        mau = m;
    }

    public int layMau() {
        return mau;
    }

    public void hienThi() {
        System.out.println(tu+ "/"+ mau);
    }
    
    public int timUSCLN(int a, int b) {
        while (a != b) {
            if (a > b) 
                a -= b;
            else
                b -= a;
        }
        return a;
    }
  
    private void rutGon() {
        int i = timUSCLN(this.layTu(), this.layMau());
        this.ganTu(this.layTu() / i);
        this.ganMau(this.layMau() / i);  
    }

    public void tang(int n) {
    	PS p= new PS(tu, mau);
    	p.ganTu(n*p.layMau()-p.layTu());
    }
    
    public void gap(int n) {
    	PS p= new PS(tu, mau);
    	p.ganTu(n*p.layMau());
    }
    
    public PS cong(int n) {
    	PS p= new PS(tu, mau);
    	p.ganTu(n*p.layMau()+p.layTu());
    	p.rutGon();
    	return p;
    }
    
    public PS cong(PS p) {
    	PS x= new PS(tu, mau);
    	x.ganTu(x.layTu()*p.layMau()+p.layTu()*x.layMau());
    	x.ganMau(x.layMau()*p.layMau());
    	x.rutGon();
    	return x;
    }
    
    public PS tru(int n) {
    	PS p= new PS(tu, mau);
    	p.ganTu(n*p.layMau()-p.layTu());
    	p.rutGon();
    	return p;
    }
    
    public PS tru(PS p) {
    	PS x= new PS(tu, mau);
    	x.ganTu(x.layTu()*p.layMau()-p.layTu()*x.layMau());
    	x.ganMau(x.layMau()*p.layMau());
    	x.rutGon();
    	return x;
    }
    
    public PS nhan(int n) {
    	PS p= new PS(tu, mau);
    	p.ganTu(n*p.layMau());
    	return p;
    }
    
    public PS nhan(PS p) {
    	PS x= new PS(tu, mau);
    	x.ganTu(x.layTu()*x.layTu());
    	x.ganMau(p.layMau()*p.layMau());
    	return x;
    }
    
    public PS chia(int n) {
    	PS p= new PS(tu, mau);
    	p.ganTu(n*p.layMau());
    	return p;
    }
    
    public PS chia(PS p) {
    	PS x= new PS(tu, mau);
    	x.ganTu(x.layTu()*p.layTu());
    	x.ganMau(x.layMau()*p.layTu());
    	return x;
    }
    
    public String toString() {
    	return tu + "/" + mau;
    }
    
    public int SoSanh(PS p) {
    	PS x= new PS(tu, mau);
    	x.ganTu(x.layTu()*p.layMau()+p.layTu()*x.layMau());
    	x.ganMau(x.layMau()*p.layMau());
    	int i=0;
    	if (x.layTu() < i)
    		i= x.layTu();
    	return x.layTu();
    }

    public static void main(String[] args) {
        PS p = new PS(1, 2);
        System.out.println("p= "+ p);
        PS q= new PS(5, 7);
        System.out.println("q= "+ q);
        PS r= p.cong(q);
        System.out.println("r= "+ r);
        PS t= (p.nhan(2).tru(p.chia(q)));
        System.out.println("t= "+t);
        p.SoSanh(q);
    }
}


