package ConnData;

public class khachHang {
	private int id;
	private String hoVaTen;
	private String queQuan;
	private String ngaySinh;
	private int gioiTinh;
	private String loaiXe;
	private String bienSoXe;
	private float giaTien;
	private String ngayVaoBen;
	private String ngayRaBen;
	public khachHang() {
		
	}
	public khachHang(int id, String hoVaTen, String queQuan, String ngaySinh, int gioiTinh, String loaiXe,
			String bienSoXe, float giaTien, String ngayVaoBen, String ngayRaBen) {
		
		this.id = id;
		this.hoVaTen = hoVaTen;
		this.queQuan = queQuan;
		this.ngaySinh = ngaySinh;
		this.gioiTinh = gioiTinh;
		this.loaiXe = loaiXe;
		this.bienSoXe = bienSoXe;
		this.giaTien = giaTien;
		this.ngayVaoBen = ngayVaoBen;
		this.ngayRaBen = ngayRaBen;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHoVaTen() {
		return hoVaTen;
	}
	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}
	public String getQueQuan() {
		return queQuan;
	}
	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}
	public String getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public int getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(int gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public String getLoaiXe() {
		return loaiXe;
	}
	public void setLoaiXe(String loaiXe) {
		this.loaiXe = loaiXe;
	}
	public String getBienSoXe() {
		return bienSoXe;
	}
	public void setBienSoXe(String bienSoXe) {
		this.bienSoXe = bienSoXe;
	}
	public float getGiaTien() {
		return giaTien;
	}
	public void setGiaTien(float giaTien) {
		this.giaTien = giaTien;
	}
	public String getNgayVaoBen() {
		return ngayVaoBen;
	}
	public void setNgayVaoBen(String ngayVaoBen) {
		this.ngayVaoBen = ngayVaoBen;
	}
	public String getNgayRaBen() {
		return ngayRaBen;
	}
	public void setNgayRaBen(String ngayRaBen) {
		this.ngayRaBen = ngayRaBen;
	}
	
	

}
