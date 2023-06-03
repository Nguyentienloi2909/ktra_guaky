abstract class abstrac_Nhan_Vien {
   public String maNhanVien = "";
   public String hoTen = "";
   public String gioiTinh = "";
   public String ngaySinh = "";
   public String ngayVaoLam = "";
   public float heSoLuong = 0;
   public boolean chungc_Qly_kNNghe = false;

   public abstrac_Nhan_Vien(String maNhanVien, String hoTen,
                            String gioiTinh, String ngaySinh, String ngayVaoLam,
                            float heSoLuong, boolean chungc_Qly_kNNghe) {
      this.maNhanVien = maNhanVien;
      this.hoTen = hoTen;
      this.gioiTinh = gioiTinh;
      this.ngaySinh = ngaySinh;
      this.ngayVaoLam = ngayVaoLam;
      this.heSoLuong = heSoLuong;
      this.chungc_Qly_kNNghe = chungc_Qly_kNNghe;
   }

   public abstrac_Nhan_Vien() {
   }

   public String getMaNhanVien() {
      return maNhanVien;
   }

   public void setMaNhanVien(String maNhanVien) {
      this.maNhanVien = maNhanVien;
   }

   public String getHoTen() {
      return hoTen;
   }

   public void setHoTen(String hoTen) {
      this.hoTen = hoTen;
   }

   public String getGioiTinh() {
      return gioiTinh;
   }

   public void setGioiTinh(String gioiTinh) {
      this.gioiTinh = gioiTinh;
   }

   public String getNgaySinh() {
      return ngaySinh;
   }

   public void setNgaySinh(String ngaySinh) {
      this.ngaySinh = ngaySinh;
   }

   public String getNgayVaoLam() {
      return ngayVaoLam;
   }

   public void setNgayVaoLam(String ngayVaoLam) {
      this.ngayVaoLam = ngayVaoLam;
   }

   public float getHeSoLuong() {
      return heSoLuong;
   }

   public void setHeSoLuong(float heSoLuong) {
      this.heSoLuong = heSoLuong;
   }

   public boolean isChungc_Qly_kNNghe() {
      return chungc_Qly_kNNghe;
   }

   public void setChungc_Qly_kNNghe(boolean chungc_Qly_kNNghe) {
      this.chungc_Qly_kNNghe = chungc_Qly_kNNghe;
   }

   abstract float tinhTuoi();
   abstract String ngayVeHuu(int tuoi);
   abstract float tinhLuong(float phuCap);
   abstract float tienThuong(float phuCap);
}

