package Functii;
public class Functii {

    public static int algoritmInversare(int numar) {

        int i = 0;
        while (numar != 0) {
            int cifra = numar % 10;
            i = (i * 10) + cifra;
            numar = numar / 10;
        }
        return i;
    }
    public static int cifraMax(int numar) {
        int max = -1;
        while (numar != 0) {
            int cifra = numar % 10;
            if (cifra > max) {
                max = cifra;
            }
            numar = numar / 10;
        }
        return max;
    }
    public static int cifraMin(int numar) {
        int min = 10;
        while (numar != 0) {
            int cifra = numar % 10;
            if (cifra < min) {
                min = cifra;
            }
            numar = numar / 10;
        }
        return min;
    }
    public static int cifraParaMax(int numar) {
        int c = 0;
        while (numar != 0) {
            int cifra = numar % 10;
            if (cifra % 2 == 0 && cifra > c) {
                c = cifra;
            }
            numar = numar / 10;
        }
        return c;
    }
    public static int cifraParaMin(int numar) {
        int c = 10;
        while (numar != 0) {
            int cifra = numar % 10;
            if (cifra % 2 == 0 && cifra < c) {
                c = cifra;
            }
            numar = numar / 10;
        }
        return c;
    }
    public static int cifraImparaMax(int numar) {
        int c = -1;
        while (numar != 0) {
            int cifra = numar % 10;
            if (cifra % 2 != 0 && cifra > c) {
                c = cifra;
            }
            numar = numar / 10;
        }
        return c;
    }
    public static int cifraImparaMin(int numar) {
        int c = 10;
        while (numar != 0) {
            int cifra = numar % 10;
            if (cifra % 2 != 0 && cifra < c) {
                c = cifra;
            }
            numar = numar / 10;
        }
        return c;
    }
    public static int contorCifre(int numar) {
        int contor = 0;
        while (numar != 0) {
            int cifre = numar % 10;
            contor++;
            numar = numar / 10;
        }
        return contor;
    }
    public static int contorCifrePare(int numar) {
        int contor = 0;
        while (numar != 0) {
            int cifraPara = numar % 10;
            if (cifraPara % 2 == 0) {
                cifraPara = contor;
                contor++;
            }
            numar = numar / 10;
        }
        return contor;
    }
    public static int contorCifreImpare(int numar) {
        return contorCifre(numar) - contorCifrePare(numar);
    }

    }













//
//    public static int maxim(int a, int b) {
//
//        if (a > b) {
//            return a;
//        } else {
//
//            return b;
//        }
//    }
//
//    //todo: functie ce primeste ca parametru 2 numere intregi si un operator("
//    //si returneaza rezultatul
//
//    public static int numereIntregi(int x, int z, char i) {
//
//        switch (i) {
//            case '+':
//                return x + z;
//            case '-':
//                return x - z;
//            case '*':
//                return x * z;
//            case '/':
//                return x / z;
//            case '%':
//                return x % z;
//            default:
//                return -1;
//
//        }
//
//    }
//
//
//    //todo:functie ce  primeste ca parametru un nmar si returneaza numarul de cifre
//
//
//    public static int contorCifre(int a) {
//
//        int contor = 0;
//
//        while (a != 0) {
//            contor++;
//            a = a / 10;
//        }
//
//        return contor;
//    }
//
//
//    //todo:functie ce returneaza numarul de cifre pare
//    //234234
//    public static int contorCifrePare(int a) {
//
//        int contor = 0;
//        while (a != 0) {
//            int cifra = a % 10;
//            if (cifra % 2 == 0) {
//                contor++;
//
//            }
//            a = a / 10;
//        }
//
//        return contor;
//    }
//
//    public static int contorCifreImpare(int numar) {
//        return contorCifre(numar) - contorCifrePare(numar);
//    }
//
//
//    public static void solutie(int numar) {
//        String text = "Numarul este  " + numar + "\n";
//        text += "Total cifre : " + contorCifre(numar) + "\n";
//        text += "Total cifre pare : " + contorCifrePare(numar) + "\n";
//        text += "Total cifre impare : " + contorCifreImpare(numar) + "\n";
//        System.out.println(text);
//
//    }
//
//    //solutie  sa rezulte cifra maxima si cifra minima dintr-un numar
//
//    public static int cifraMax(int numar) {
//
//        int a = 0;
//        while (numar != 0) {
//            int cifra = numar % 10;
//            if (cifra > a) {
//                a = cifra;
//            }
//            numar = numar / 10;
//        }
//        return a;
//    }
//
//    public static int cifraMin(int numar) {
//
//        int a = 10;
//        while (numar != 0) {
//            int cifra = numar % 10;
//            if (cifra <= a) {
//                a = cifra;
//            }
//            numar = numar / 10;
//        }
//        return a;
//    }
//
//    public static void solutie2(int numar2) {
//        String text = "Numarul este : " + numar2 + "\n";
//        text += "Cea mai mare cifra din numar este : " + cifraMax(numar2) + "\n";
//        text += "Cea mai mica cifra din numar este : " + cifraMin(numar2) + "\n";
//        System.out.println(text);
//    }
//
//    //todo:solutie frecventa fiecare cifre in numar
//    //ex:1123455
//
//    //todo functie ce primeste ca parametru un numar si o cifra =>numarul de aparitii a cifrei
//
//    public static int frecventa(int numar, int cifra) {
//        int contor = 0;
//        while (numar != 0) {
//            int a = numar % 10;
//            if (a == cifra) {
//                contor++;
//            }
//            numar = numar / 10;
//
//        }
//        return contor;
//    }
//
//
//    public static void solutie3(int numar) {
//
//        String text = "Numarul " + numar + " contine" + "\n";
//        for (int i = 0; i <= 9; i++) {
//            int f = frecventa(numar, i);
//            if (f != 0) {
//                text += "Cifra " + i + " apare de " + f + " ori, " + "\n";
//            }
//        }
//        System.out.println(text);
//    }







