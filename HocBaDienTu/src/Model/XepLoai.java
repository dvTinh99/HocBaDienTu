package Model;

public class XepLoai {
	int Ma_hs;
	int Ma_hk;
	float TB_Mon;
	String Hoc_luc;
	String Hanh_kiem;
	int Xet_len_lop;
	
	XepLoai(){}

	public XepLoai(int ma_hs, int ma_hk, float tB_Mon, String hoc_luc, String hanh_kiem, int xet_len_lop) {
		super();
		Ma_hs = ma_hs;
		Ma_hk = ma_hk;
		TB_Mon = tB_Mon;
		Hoc_luc = hoc_luc;
		Hanh_kiem = hanh_kiem;
		Xet_len_lop = xet_len_lop;
	}

	public int getMa_hs() {
		return Ma_hs;
	}

	public void setMa_hs(int ma_hs) {
		Ma_hs = ma_hs;
	}

	public int getMa_hk() {
		return Ma_hk;
	}

	public void setMa_hk(int ma_hk) {
		Ma_hk = ma_hk;
	}

	public float getTB_Mon() {
		return TB_Mon;
	}

	public void setTB_Mon(float tB_Mon) {
		TB_Mon = tB_Mon;
	}

	public String getHoc_luc() {
		return Hoc_luc;
	}

	public void setHoc_luc(String hoc_luc) {
		Hoc_luc = hoc_luc;
	}

	public String getHanh_kiem() {
		return Hanh_kiem;
	}

	public void setHanh_kiem(String hanh_kiem) {
		Hanh_kiem = hanh_kiem;
	}

	public int getXet_len_lop() {
		return Xet_len_lop;
	}

	public void setXet_len_lop(int xet_len_lop) {
		Xet_len_lop = xet_len_lop;
	}
	

}
