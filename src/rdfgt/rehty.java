package rdfgt;


import java.util.Scanner;

public class rehty {

	private static Scanner mi_scanner;
	private static Scanner mi_scanner2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("1");
        System.out.print("3");
        System.out.print("4");
        System.out.print("5");
        System.out.print("6");
        mi_scanner2 = new Scanner(System.in);
          int mi_variable=mi_scanner2.nextInt();
         System.out.print(mi_variable*2);

              if(mi_variable ==10){
                 System.out.print("es un 10");
 }
             System.out.print("fin del programa");
 }

	public static Scanner getMi_scanner() {
		return mi_scanner;
	}

	public static void setMi_scanner(Scanner mi_scanner) {
		mi_scanner = mi_scanner;
	}

}
