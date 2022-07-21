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

    public static int sumaCifrePare(int numar) {
        int suma = 0;
        while (numar != 0) {
            int cifre = numar % 10;
            if (cifre % 2 == 0) {
                suma = suma + cifre;
            }
            numar = numar / 10;
        }
        return suma;
    }

    public static int sumaCifreImpare(int numar) {
        int suma = 0;
        while (numar != 0) {
            int cifraImpara = numar % 10;
            if (cifraImpara % 2 != 0) {
                suma = suma + cifraImpara;
            }
            numar = numar / 10;
        }
        return suma;
    }

    public static int numereIntregiSiOperator(int a, int b, char c) {
        switch (c) {
            case '+':
                return a + b;
            case 's':
                return a - b;
            case 'p':
                return a * b;
            case 'i':
                return a / b;
            case '%':
                return a % b;
            default:
                return -1;
        }
    }

    public static int sumaCifre(int numar){
        return sumaCifreImpare(numar)+sumaCifrePare(numar);
    }
    public static int produsCifre(int numar){
        return sumaCifrePare(numar)*sumaCifreImpare(numar);
    }
    public static int scadereCifre(int numar){
        return sumaCifrePare(numar)-sumaCifreImpare(numar);
    }
    public static int impartireCifre(int numar){
        return sumaCifreImpare(numar)/sumaCifrePare(numar);
    }
    public static void Solutie(int numar){
        String mesaj = "Numarul este : "+numar + "\n";
        mesaj+="Inversarea numarului este : " + algoritmInversare(numar) + "\n";
        mesaj+="Cifra maxima a numarului este : " +cifraMax(numar)+ "\n";
        mesaj+="Cifra minima a numarului este : " +cifraMin(numar)+ "\n";
        mesaj +="Cifra para maxima a numarului este : " +cifraParaMax(numar)+ "\n";
        mesaj+="Cifra para minima a numarului este : " +cifraParaMin(numar)+ "\n";
        mesaj+="Cifra impara maxima a numarului este : "+cifraImparaMax(numar)+"\n";
        mesaj+="Cifra impara minica a numarului este : "+cifraImparaMin(numar)+"\n";
        mesaj+="Numarul total de cifre ale numarului este : "+contorCifre(numar)+"\n";
        mesaj+="Numarul total de cifre pare ale numarului este : "+contorCifrePare(numar)+"\n";
        mesaj+="Numarul total de cifre impare ale numarului este : "+contorCifreImpare(numar)+"\n";
        mesaj+="Suma cifrelor pare din numar este : "+sumaCifrePare(numar)+"\n";
        mesaj+="Suma cifrelor impare din numar este : "+sumaCifreImpare(numar)+"\n";
        mesaj+="Suma cifrelor numarului este : "+sumaCifre(numar)+"\n";
        mesaj+="Produsul cifrelor numarului este : "+produsCifre(numar)+"\n";
        mesaj+="Scaderea cifrelor numarului este : "+scadereCifre(numar)+"\n";
        mesaj+="Impartirea cifrelor numarului este : "+impartireCifre(numar)+"\n";
        mesaj+="Numere intregi si operator : " +numereIntregiSiOperator(5,3,'a')+"\n";
        System.out.println(mesaj);


    }
}



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







