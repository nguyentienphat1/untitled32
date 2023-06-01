import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số lượng phần tử");
        n= scanner.nextInt();
        int array[]= new int[n];
        for (int i=0;i<n;i++){
            System.out.println("nhập giá trị phần tử "+i);
            array[i] = scanner.nextInt();
        }
        thucthi(array);
    }
    public  static boolean perfectnumber(int p){
        int shc=0;
        for (int i=1;i<=p;i++){
            if (p%i==0){
                shc=shc+i;
            }
            if (shc==p){
                return true;
            }
        }
        return false;
    }
    public static void thucthi(int array[]){
        int dem=0;
        for (int i=0;i< array.length;i++){
            if (perfectnumber(array[i])){
                dem++;
                System.out.println("các so hoàn chỉnh là : "+array[i]);
            }
        }
        System.out.println("có "+dem+" số hoàn chỉnh");
    }
}