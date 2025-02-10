
package OOP;
import java.util.Scanner;
import java.util.ArrayList;
public class processor {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        ArrayList<CAR> xehoi=new ArrayList<>();
        System.out.println("Nhap so luong xe hoi: ");
        int n = nhap.nextInt();
        nhap.nextLine();
        for(int i=0;i<n;i++){
            System.out.println("Nhap hang xe: ");
            String model = nhap.nextLine();
            System.out.println("Nhap nam san xuat: ");
            int year = nhap.nextInt();
            nhap.nextLine();
            CAR myCar = new CAR(model,year);
            xehoi.add(myCar);
        }
        for(int i=0;i<n;i++){
            xehoi.get(i).displayDetails(); 
        }
    }
}
