package Model;

public class LopHoc {
	int Ma_class;
	int Ma_KH;
	int Ma_namHoc;
	int Ma_gv;
	String Ten_lop;
	String GVCN;
	
	LopHoc(){}

	public LopHoc(int ma_class, int ma_KH, int ma_namHoc, int ma_gv) {
		super();
		Ma_class = ma_class;
		Ma_KH = ma_KH;
		Ma_namHoc = ma_namHoc;
		Ma_gv = ma_gv;
	}
	public LopHoc(int ma_class,String Ten_lop, int Ma_KH,String GVCN) {
		this.Ma_class = ma_class;
		this.Ten_lop = Ten_lop;
		this.Ma_KH = Ma_KH;
		this.GVCN = GVCN;
	}

	public String getTen_lop() {
		return Ten_lop;
	}

	public void setTen_lop(String ten_lop) {
		Ten_lop = ten_lop;
	}

	public String getGVCN() {
		return GVCN;
	}

	public void setGVCN(String gVCN) {
		GVCN = gVCN;
	}

	public int getMa_class() {
		return Ma_class;
	}

	public void setMa_class(int ma_class) {
		Ma_class = ma_class;
	}

	public int getMa_KH() {
		return Ma_KH;
	}

	public void setMa_KH(int ma_KH) {
		Ma_KH = ma_KH;
	}

	public int getMa_namHoc() {
		return Ma_namHoc;
	}

	public void setMa_namHoc(int ma_namHoc) {
		Ma_namHoc = ma_namHoc;
	}

	public int getMa_gv() {
		return Ma_gv;
	}

	public void setMa_gv(int ma_gv) {
		Ma_gv = ma_gv;
	}
	

}
