package practice;

public class practice {

    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("2[r]3[e]");
        stringDecoding(s);
    }
    public static void stringDecoding(StringBuilder s){
        StringBuilder r = new StringBuilder();
        int sum = 0;
        for(int i =0; i< s.length(); i++)
        {
            char c= s.charAt(0);
            if(c>='0' && c <='9' )
            {
                sum = (int) c;
            }
            else if (c == '[')
            {
                char e = s.charAt(i++);
                int j = i;
                for(++i;;i++)
                {
                    continue;
                }
            }

        }
        }



    }

