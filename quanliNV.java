package lab06;
public class quanliNV {
	public String ten;
	public long luong;
	private String loainhanvien;
	public nhanvien() {
	this.ten="";
	this.luong=0;
	}
	public nhanvien(String ten, long luong) {
	this.ten=ten;
	this.luong=luong;
	}
	public String getten() {
	return ten;
	}
	public long getluong() {
	return luong;
	}
	public void tinhluong(int b) {
	}
	public void xuatthongtin() {
	this.xuatthongtin();
	}
	public void setloainhanvien(String string) {
	this.loainhanvien=loainhanvien;
	}
	public String toString() {
	return "Nhanvien[ten="+ ten+", luong="+ luong+"]";
	}
	public void tinhluong() {
	}
}
public class nhanvienfulltime extends nhanvien {
	Scanner input = new Scanner(System.in);
	public int loaichucvu;
	public int ngayLamthem;
	public nhanvienfulltime() {
	this.loaichucvu=0;
	this.ngayLamthem=0;
	}
	public nhanvienfulltime(int loaiphucvu, int ngayLamThem) {
	super();
	this.loaichucvu=loaichucvu;
	this.ngayLamthem=ngayLamthem;
	}
	public int getloaichucvu(){
	return loaichucvu;
	}
	public int getngayLamthem() {
	return ngayLamthem;
	}
	public void setloaichucvu(int loaichucvu) {
	this.loaichucvu=loaichucvu;
	}
	public void setngayLamthem(int ngayLamthem) {
	this.ngayLamthem=ngayLamthem;
	}
	public String getloainhanvien() {
	return getloainhanvien();
	}
	public void setngayLamthem() {
	this.ngayLamthem=ngayLamthem;
	}
	@Override
	public void tinhluong(int b) {
	System.out.println("loai chuc vu");
	setloaichucvu(input.nextInt());
	System.out.println("nhap so ngay");
	setngayLamthem(input.nextInt());
	int luongLamThem = ngayLamthem * 200000;
	b += luongLamThem;
	System.out.println("Muc luong fulltime: " + b);
	}
	}
public class nhanvienparttime extends nhanvien {
	Scanner input=new Scanner(System.in);
	public int giolamviec;
	public String loainhanvien;
	public nhanvienparttime() {
	super();
	this.giolamviec=4;
	this.loainhanvien="";
	}
	public void setgiolamviec() {
	this.giolamviec=giolamviec;
	}
	@Override
	public void tinhluong(int b) {
	System.out.println(" loai nhan vien");
	setloainhanvien(input.nextLine());
	System.out.println(" chi lam 4 tieng ");
	int tinhluong=giolamviec*30000;
	b+=tinhluong;
	System.out.println(" muc luong parttime" +b);
	}
	}
public class main {
	public static void main(String[] args ) {
	nhanvienfulltime nvf=new nhanvienfulltime();
	nvf.tinhluong(0);
	nhanvienparttime nvp=new nhanvienparttime();
	nvp.tinhluong(0);
	}
}