 public class NumérationRomaine{
        public static String unités(int n){
            String s="";
            if(n==1){
                s="I";
            }
            if(n==2){
                s="II";
            }
            if(n==3){
                s="III";
            }
            if(n==4){
                s="IV";
            }
            if(n==5){
                s="V";
            }
            if(n==6){
                s="VI";
            }
            if(n==7){
                s="VII";
            }
            if(n==8){
                s="VIII";
            }
            if(n==9){
                s="IX";
            }
            return s;
        }
        public static String dizaines(int n){
            String s="";
            if(n==1){
                s="X";
            }
            if(n==2){
                s="XX";
            }
            if(n==3){
                s="XXX";
            }
            if(n==4){
                s="XL";
            }
            if(n==5){
                s="L";
            }
            if(n==6){
                s="LX";
            }
            if(n==7){
                s="LXX";
            }
            if(n==8){
                s="LXXX";
            }
            if(n==9){
                s="XC";
            }
            return s;
        }
        public static String centaines(int n){
            String s="";
            if(n==1){
                s="C";
            }
            if(n==2){
                s="CC";
            }
            if(n==3){
                s="CCC";
            }
            if(n==4){
                s="CD";
            }
            if(n==5){
                s="D";
            }
            if(n==6){
                s="DC";
            }
            if(n==7){
                s="DCC";
            }
            if(n==8){
                s="DCCC";
            }
            if(n==9){
                s="CM";
            }
            return s;
        }
        /**
         * Donnée : un entier n<=999
         1
         * Résultat : affiche n en chiffres Romain, avec un espace entre les chiffres
         */
        public static void afficher(int n){
            int u=n%10;
            int d=(n/10)%10;
            int c=(n/100)%10;
            System.out.print(centaines(c)+dizaines(d)+unités(u));
        }

     public static void main(String[] args) {
            NumérationRomaine.afficher(1999);
     }
}
