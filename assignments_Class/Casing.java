public class Casing {
        public String printTypeofChar(int i) {
                if((i < 65 && i > 122) || (i>91 && i < 96)) {
                        return "Symbol";
                }
                else if(64 < i && i < 91) {
                        return "Upper-Casing.";
                }
                else if(i > 96 && i < 123) {
                        return "Lower-Casing";
                }
                else {
                        return null;
                }
        }
        public static void main(String[] args) {
                char a = 'a';
                int i = (int) a;
                System.out.println(i);
                Casing sym = new Casing();
                System.out.println(sym.printTypeofChar(i));
        }
}
