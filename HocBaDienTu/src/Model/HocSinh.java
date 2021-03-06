package Model;

public class HocSinh {
	int Ma_hs ;
	int Ma_school;
	String Ho;
	String Ten ;
	String GioiTinh;
	String NgaySinh;
	String DiaChi;
	String Sdt;
	String CMND ;
	
	HocSinh(){
		
	}

	public HocSinh(int ma_hs, String ho, String ten, String gioiTinh, String ngaySinh, String diaChi, String sdt,
			String CMND) {
		this.Ma_hs = ma_hs;
		this.Ho = ho;
		this.Ten = ten;
		this.GioiTinh = gioiTinh;
		this.NgaySinh = ngaySinh;
		this.DiaChi = diaChi;
		this.Sdt = sdt;
		this.CMND = CMND;
	}

	public HocSinh(int ma_hs, int ma_school, String ho, String ten, String gioiTinh, String ngaySinh, String diaChi,
			String sdt, String cMND) {
		super();
		Ma_hs = ma_hs;
		Ma_school = ma_school;
		Ho = ho;
		Ten = ten;
		GioiTinh = gioiTinh;
		NgaySinh = ngaySinh;
		DiaChi = diaChi;
		Sdt = sdt;
		CMND = cMND;
	}

	public int getMa_hs() {
		return Ma_hs;
	}

	public void setMa_hs(int ma_hs) {
		Ma_hs = ma_hs;
	}

	public int getMa_school() {
		return Ma_school;
	}

	public void setMa_school(int ma_school) {
		Ma_school = ma_school;
	}

	public String getHo() {
		return Ho;
	}

	public void setHo(String ho) {
		Ho = ho;
	}

	public String getTen() {
		return Ten;
	}

	public void setTen(String ten) {
		Ten = ten;
	}

	public String getGioiTinh() {
		return GioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		GioiTinh = gioiTinh;
	}

	public String getNgaySinh() {
		return NgaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		NgaySinh = ngaySinh;
	}

	public String getDiaChi() {
		return DiaChi;
	}

	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}

	public String getSdt() {
		return Sdt;
	}

	public void setSdt(String sdt) {
		Sdt = sdt;
	}

	public String getCMND() {
		return CMND;
	}

	public void setCMND(String cMND) {
		CMND = cMND;
	}
	

}
