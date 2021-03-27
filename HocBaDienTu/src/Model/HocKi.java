package Model;

public class HocKi {
	int Ma_hk;
	int Ma_namHoc;
	String Ten_HK;
	String Ngay_batDau;
	String Ngay_ketThuc;
	
	HocKi(){}

	public HocKi(int ma_hk, int ma_namHoc, String ten_HK, String ngay_batDau, String ngay_ketThuc) {
		super();
		Ma_hk = ma_hk;
		Ma_namHoc = ma_namHoc;
		Ten_HK = ten_HK;
		Ngay_batDau = ngay_batDau;
		Ngay_ketThuc = ngay_ketThuc;
	}

	public int getMa_hk() {
		return Ma_hk;
	}

	public void setMa_hk(int ma_hk) {
		Ma_hk = ma_hk;
	}

	public int getMa_namHoc() {
		return Ma_namHoc;
	}

	public void setMa_namHoc(int ma_namHoc) {
		Ma_namHoc = ma_namHoc;
	}

	public String getTen_HK() {
		return Ten_HK;
	}

	public void setTen_HK(String ten_HK) {
		Ten_HK = ten_HK;
	}

	public String getNgay_batDau() {
		return Ngay_batDau;
	}

	public void setNgay_batDau(String ngay_batDau) {
		Ngay_batDau = ngay_batDau;
	}

	public String getNgay_ketThuc() {
		return Ngay_ketThuc;
	}

	public void setNgay_ketThuc(String ngay_ketThuc) {
		Ngay_ketThuc = ngay_ketThuc;
	}
	

}
