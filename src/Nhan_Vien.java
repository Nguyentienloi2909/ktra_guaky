import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Nhan_Vien extends abstrac_Nhan_Vien{

   DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
   LocalDate now = LocalDate.now();
   Random rd = new Random();

   String taoMNV(){
      String a = "";
      for(int i = 0; i< 5; i++){
         a = a+ (char) rd.nextInt(65, 91);
      }
      return a;
   }
   public String taoTen() {
      String[] ho = {"Thị", "Tiến", "Đức", "Thu", "Chí", "Lê", "Nguyễn", "Phạm", "Dương", "Trần", "Mai"};
      String[] Ten = {"Truyền", "Lợi", "Hoài", "Tuấn", "Nhung", "Diễn", "Linh", "Cao", "Công", "Phương", "Đức", "Khoa"};
      int ho1 = rd.nextInt(0, 5);
      int ten1 = rd.nextInt(0, 5);

      return ho[ho1] +" "+ Ten[ten1];
   }
   public String taoNgay(String ngay1, String ngay2) {
      LocalDate n1 = LocalDate.parse(ngay1, df);
      LocalDate n2 = LocalDate.parse(ngay2, df);
      long soNgay = n2.toEpochDay() - n1.toEpochDay();
      long n = rd.nextLong(0, soNgay);
//      return n1.plusDays(n).format(df);
      String ngay =String.valueOf(n1.plusDays(n));

      return String.format(ngay, df);

   }
   public String taoGioiTinh(){
      int a = rd.nextInt(0,2);
      String gt = a == 0? "Nu" : "Nam";
      return gt;
   }

   public float taoHeSoLuong(){
      float a = rd.nextFloat(2, (float)9.001);
      return a;
   }

   public boolean taoChungChi(){
      int a = rd.nextInt(0,2);
      boolean chungChi = a==0? false : true;
      return chungChi;
   }
   public int thoiGianCongTac(){
      LocalDate now = LocalDate.now();
      LocalDate ns = LocalDate.parse(super.ngayVaoLam, df);
      Period diff = Period.between(ns, now);
      return diff.getYears();
   }
   float tinhTuoi(){
      LocalDate ns = LocalDate.parse(super.ngaySinh,df);
      Period diff = Period.between(ns, now);
      return (float ) (diff.getYears() + (float) diff.getMonths()/12);
   }

   String ngayVeHuu(int tuoi){
      LocalDate ns = LocalDate.parse(super.ngaySinh, df);
      LocalDate veHuu = ns.plusYears(tuoi);
      return String.valueOf(veHuu.getDayOfMonth()) +"/"+ String.valueOf(veHuu.getMonthValue()) +"/"+ String.valueOf(veHuu.getYear());
   }

   float tinhLuong(float heSoPhuCap) {
      float luongCoBan = super.heSoLuong * 1490000;
      float luong =  luongCoBan + (heSoPhuCap /100) * luongCoBan;
      return (float) luong;
   }

   float tienThuong(float phuCap){
      return tinhLuong(phuCap) * 5;
   };

   public void inPut(){
      super.maNhanVien = taoMNV();
      super.hoTen = taoTen();
      super.gioiTinh = taoGioiTinh();
      super.ngaySinh = taoNgay("01/05/2003", "30/05/2003");
      super.ngayVaoLam = taoNgay("01/08/2010", "31/08/2010");
      super.heSoLuong = taoHeSoLuong();
      super.chungc_Qly_kNNghe = taoChungChi();
   }

   public String ouput(){
      return String.format("%-8s | %-18s | %-18s | %-8s | %-8.2f | %-18s | ", super.maNhanVien, super.hoTen, super.ngaySinh, super.gioiTinh,
                                                                              tinhTuoi(),super.ngayVaoLam);
   }
}
