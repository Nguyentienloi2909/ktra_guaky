import java.io.*;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) throws IOException {
      FileWriter fw = new FileWriter("D:/HoTenSV/DanhSachNV.txt");
      FileWriter fw1 = new FileWriter("D:/HoTenSV/DSTren10nam.txt");
      Scanner sc = new Scanner(System.in);
      System.out.print("Nhap so luong nhan vien kỹ sư: ");
      int m = sc.nextInt();
      System.out.print("Nhap so luong nhan vien Công nhân: ");
      int n = sc.nextInt();

      System.out.format("%-8s | %-18s | %-18s | %-8s | %-8s | %-18s | %-18s | %-18s \n\n", "MaNV", "Ho ten", "Ngay sinh", "GT", "Tuoi", "NgayVaoLàm", "Ngàynghỉhưu", "TH công tác");
      fw.write(String.format("%-8s | %-18s | %-18s | %-8s | %-8s | %-18s | %-18s | %-18s \n\n", "MaNV", "Ho ten", "Ngay sinh", "GT", "Tuoi", "NgayVaoLàm", "Ngàynghỉhưu", "TH công tác"));
      for (int i = 0; i< m; i++){
         Ky_Su a = new Ky_Su();
         a.inPut();
         String tuCuoi = a.ouPut().substring(a.ouPut().length() - 18).trim();
         if (Integer.parseInt(tuCuoi) >= 10){
            fw1.write(a.ouPut() +"\r\n");
         }
         fw.write(a.ouPut()+"\r\n");
         System.out.println(a.ouPut());
      }

      for (int j = 0; j< n; j++){
         Cong_Nhan b = new Cong_Nhan();
         b.inPut();
         String tuCuoi = b.ouPut().substring(b.ouPut().length()-18).trim();
         if (Integer.parseInt(tuCuoi) >= 10){
            fw1.write(b.ouPut() +"\r\n");
         }
         fw.write(b.ouPut() + "\r\n");
         System.out.println(b.ouPut());
      }
      fw.close();
      fw1.close();

//      tìm kiếm
      System.out.print("Nhập mã sinh viên hoặc họ tên bạn muốn tìm: ");
      Scanner sc1 = new Scanner(System.in);
      String msv_Ten = sc1.nextLine();
      try{
         FileInputStream hienThi = new FileInputStream("D:/HoTenSV/DanhSachNV.txt");
         InputStreamReader fileIn = new InputStreamReader(hienThi);
         BufferedReader fr = new BufferedReader(fileIn);
         String line = fr.readLine();

         while (line != null){
            if (line.contains(msv_Ten)){
               System.out.println(line);
            }
            line = fr.readLine();
            if (line.isEmpty() == true){
               line = fr.readLine();
            }
         }
      }catch (Exception e){
         System.out.println("");
      }

   }
}