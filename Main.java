import java.lang.Math;
import  java.util.Scanner; // класс над потоком ввода для забора данных

public class Main {
    public static int xx; // поле класса (значение по умолчанию)
    public static void main(String[] args) {
        int x;
        double f;
        String s;
        char c;
        var y=45;
        final int Limit=6; // константа

        x=0b10001001; // цифра в бинарном формате
        x=0xFFF; // шестнадцатиричный формат
        x=0755; // восьмиричная система
        f=3.14;
        s="hello word"; // строка
        s= """
                fhdajhfdsiufhudhcuuisa
                fhdsaiufhduisfhishfh
                hfdsaiudfhoiafhduoa
                """; // текстовый блок
        c='h'; // символ
        c='\t'; // управляющие последовательности воспринимаются как один символ
        c='\u0421'; // код символа в юникод
        // null можно записать в любую переменную объектного типа
        Number t = null;
        long l=785;
        int i=(int)l; // явное преобразование типов
        double d = 27.876;
        i = (int)Math.round(d); // округление с помощью библиотеки Math

        String str = (i > 15) ? "больше" : "меньше";

        int j=0;
        while (j<5){
            System.out.println(j);
            j++;
        }

        do{
            System.out.println(j);
            j--;
        }while (j>=0);

        for (char r=0; r<5; r++){
            System.out.println(r);
        }

        //int a[];
        //int[] a;
        //int[] a = new int[] {2, 4, 0, 3, 9, 5};
        //int[] a = new int[6];
        int[] a = {2, 4, 0, 3, 9, 5};
        System.out.println(a[3]);
        System.out.println(a.length);

        int[][] m = {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}}; // многомерный массив-матрица
        System.out.println(m[1][0]);

        for(int el : a){
            System.out.println(el);
        }

        Scanner input = new Scanner(System.in); // В сканер заворачиваем поток ввода (тип string), чтобы не парсить строки
        System.out.println("Введите число");
        long n = input.nextInt(); // Берёт из потока ввода числа
        if(n%2 == 0){
            System.out.println("Число чётное");
        }
        else {
            System.out.println("Число нечётное");
        }
        byte x1 = 50;
        x1=(byte) (x1*2);

        Integer x2 = new Integer(5) + new Integer(2); // Объект, который после инициализации уже не изменить

        String str1 = "495";
        int integ = Integer.parseInt(str1);
        System.out.println(integ);

        String binary = Integer.toBinaryString(integ);
        System.out.println(binary);

        Integer ii2 = 2; // работает режим автобоксигна, который 2 преобразует в объектный тип
        int i2 = ii2; // работает автобоксинг, который под капотом преобразует объектный тип в простой

        
    }
}