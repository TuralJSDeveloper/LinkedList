package baglilist;

/**
 *
 * @author Tural
 */
public class BagliList {

    public static void main(String[] args) {
        Sinif A = new Sinif(); //Yaddaşda node yaradılır
        Sinif B = new Sinif();
        Sinif C = new Sinif();

        A.a = 15; // Node-a dəyər verilir
        B.a = 25;
        C.a = 35;
        System.out.println(A.a);
        System.out.println(B.a);
        System.out.println(C.a);

        A.next = B;
        B.next = C;
        C.next = null;

        Sinif temp = A;

        while (temp != null) {// Travers əməliyyatı
            System.out.println(temp.a);
            temp = temp.next;

        }

    }

}
