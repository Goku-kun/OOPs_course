public class UpperCase {
        private static int cnt;
        public int countUppercase(char[] a, int k) {
                int[] i = new int[k];
                for(int j=0; j<k; j++) {
                        i[j] = (int)a[j];
                        if(i[j]>64 && i[j]<91)
                                cnt++;
                }
                return cnt;
        }
        public static void main(String[] args) {
                UpperCase aa = new UpperCase();
                String s1 = "Goku KYun.";
                char[] s = new char[s1.length()];
                for(int i = 0; i < s1.length(); i++)
                        s[i] = s1.charAt(i);
                System.out.println(aa.countUppercase(s,s1.length()));

        }
}
