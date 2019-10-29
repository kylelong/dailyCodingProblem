public class Encode{
    public static void main(String [] args){
        String s = "AAAABBBCCDAA"; //4A3B2C1D2A
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < s.length(); i++){
            char c = s.charAt(i - 1);
            int count = 1;
            while(i < s.length() && s.charAt(i) == c){
                count++;
                i++;


            }
            sb.append(count);
            sb.append(c);
        }
        System.out.println(sb.toString());
    }
}