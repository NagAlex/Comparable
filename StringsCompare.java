/**
 * Created by NAG on 10.11.14.
 */
public class StringsCompare {
    public static void main(String args[]){
        String str;
        StringBuffer strbuf;
        StringBuilder strbuld;
        long end, start;

        start = System.currentTimeMillis();
        str = "This is a simple String object";
        for(int i=0; i<30000; i++){
            str += i + " ";
        }
        end = System.currentTimeMillis() - start;
        System.out.println("Execution time of: " + str + "\n : " + end);

        start = System.currentTimeMillis();
        strbuf = new StringBuffer("This is a simple StringBuffer object");
        for(int i=0; i<30000; i++){
            strbuf = strbuf.append(i);
            strbuf = strbuf.append(" ");
        }
        end = System.currentTimeMillis() - start;
        System.out.println("Execution time of: " + strbuf + "\n : " + end);

        start = System.currentTimeMillis();
        strbuld = new StringBuilder("This is a simple StringBuilder object");
        for(int i=0; i<30000; i++){
            strbuld = strbuld.append(i);
            strbuld = strbuld.append(" ");
        }
        end = System.currentTimeMillis() - start;
        System.out.println("Execution time of: " + strbuld + "\n : " + end);
    }
}
