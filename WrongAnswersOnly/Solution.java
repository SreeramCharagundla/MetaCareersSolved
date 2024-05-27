package WrongAnswersOnly;

class Solution {
    public static void main(String[] args) {
        String s = "ABA";
        String ans = getWrongAnswers(3,s);

        System.out.println(ans);
    }

    public static String getWrongAnswers(int N, String C) {
        String s="";
        for (int i = 0; i < C.length(); i++){
            char c = C.charAt(i);        
            if(c=='A')
                s=s+'B';
            else
                s=s+'A'; 
        }
        return s;
      }
}

