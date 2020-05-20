package newenum;

public class Enum {
    public enum Enumeration {
        LEFT("yes"),
        RIGHT("No"),
        LENGTH(3);
        private int length;
        private String dir ;
        Enumeration(int length) {
            this.length = length;
        }
        Enumeration(String dir) {
            this.dir =dir;
        }
        public String strVal() {
            return dir;
        }
        public int intVal(){
            return length;
        }

        public static void main(String[] args) {
            System.out.println(Enumeration.RIGHT.strVal() == "No");
        }
    }
}
