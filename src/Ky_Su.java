import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Ky_Su extends Nhan_Vien{

   public float tinhHeSoPhuCap(){
      int a = super.thoiGianCongTac();
      float phuCap = 0;
      if (a < 5){
         phuCap = 5;
      }else if(a < 10){
         phuCap = 8;
      }else if(a < 15){
         phuCap = 12;
      }else{
         phuCap = 20;
      }
      return phuCap;
   }

   public String veHuu(){
      String a = "";
      if (super.gioiTinh == "Nam"){
         a = super.ngayVeHuu(60);
      }else  {
         a = super.ngayVeHuu(55);
      }
      return a;
   }

   public void inPut(){
      super.inPut();
      float heSopC = tinhHeSoPhuCap();
      super.tinhLuong(heSopC);
      super.tienThuong(heSopC);
   }

   public String ouPut(){
      String a = super.ouput();
      return a + String.format("%-18s %-18d", veHuu(), super.thoiGianCongTac());
   }
}
