import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        System.out.println( customSort("super","tower") );

    }

//    def mergeStrings(s1, s2):
//    s,o1,o2='',s1,s2
//    while len(s1)*len(s2)!=0:
//            if o1.count(s1[0])>o2.count(s2[0]) or (o1.count(s1[0])==o2.count(s2[0]) and s1[0]>s2[0]):
//    s+=s2[0]
//    s2=s2[1:]
//            else:
//    s+=s1[0]
//    s1=s1[1:]
//    return s+s1+s2

    public static String customSort (String s1, String s2) {

        StringBuilder sb = new StringBuilder();

        Map<Character,Integer> map1 = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();

        for(char c : s1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c,0)+1);
        }

        for(char c : s2.toCharArray()) {
            map2.put(c, map2.getOrDefault(c,0)+1);
        }

        while( s1.length()*s2.length()!=0 ) {

            if( map1.get(s1.charAt(0)) >  map2.get(s2.charAt(0)) || (map1.get(s1.charAt(0)) == map2.get(s2.charAt(0)) && s1.charAt(0) > s2.charAt(0)) ) {

                sb.append(s2.charAt(0));
                s2 = s2.substring(1);

            }else {

                sb.append(s1.charAt(0));
                s1 = s1.substring(1);

            }

        }

        return sb.toString()+s1+s2;

    }

}
