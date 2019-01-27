package PhoneList.pak;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        Scanner _in = new Scanner(System.in);
        System.out.println("+++++");
        String _str=_in.nextLine();

        PhoneNumber _Ph = new PhoneNumber(_str);
        System.out.println();
        System.out.println(_Ph.get_Number());
        System.out.println(_Ph.get_formattedNumber());

    /*
    Scanner  _Sc = new Scanner(System.in);

    System.out.println(_Sc.radix());
    int r;
    do{
     r=System.in.read();
     System.out.println((char)r);
    }while(true);
    */
    }
}
