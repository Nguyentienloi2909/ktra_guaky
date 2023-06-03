import java.util.Random;

public class Cong_Nhan extends  Nhan_Vien{
   private int bacNghe = 0;
   public Cong_Nhan(int bacNghe) {
      this.bacNghe = bacNghe;
   }
   public Cong_Nhan() {
   }

   public int getBacNghe() {
      return bacNghe;
   }

   public void setBacNghe(int bacNghe) {
      this.bacNghe = bacNghe;
   }

   public int taoBacNghe(){
      Random rd = new Random();
      int a = rd.nextInt(1,7);
      return a;
   }

   public float tinhHeSoPhuCap(){
      int a = taoBacNghe();
      float phuCap = 0;
      if (a == 1){
         phuCap = 5;
      }else if(a == 2){
         phuCap = 7;
      }else if(a == 3){
         phuCap = 10;
      }
      else if(a == 4){
         phuCap = 15;
      }
      else if(a == 5){
         phuCap = 19;
      }
      else{
         phuCap = 22;
      }
      return phuCap;
   }

   public String veHuu(){
      String a = "";
      if (super.gioiTinh == "Nam"){
         a = super.ngayVeHuu(57);
      }else  {
         a = super.ngayVeHuu(52);
      }
      return a;
   }

   public void inPut(){
      super.inPut();
      float heSoPC = tinhHeSoPhuCap();
      super.tinhLuong(heSoPC);
      super.tienThuong(heSoPC);
   }

   public String ouPut(){
      String a = super.ouput();
      return a + String.format("%-18s %-18d", veHuu(), super.thoiGianCongTac());
   }
}
