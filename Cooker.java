package KTGK;
class Cooker extends ElectricalDevice{
    protected boolean cooking;
    public Cooker(String a,int b,String c,boolean d,boolean cook){
        super(a,b,c,d);
        cooking=cook;
    }
    public boolean layCooking(){
        return cooking;
    }
    public void ganCooking(boolean x){
        cooking=x;
    }
    public void cook(){
        cooking=true;
    }
    public void warm(){
        cooking=false;
    }
    public void update(){
        
    }
}