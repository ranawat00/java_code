import java.util.TreeMap;
import java.util.Map.Entry;

public class WVF {
    public static void main(String[] args) {
        String str="Learn With Sandeep";
        WVF w=new WVF();
        w.getWordVowelCount(str);
        w.frequency(str);
    }

    private void frequency(String str) {
        TreeMap<Character,Integer>map=new TreeMap<>();
        for(int i=0;i<str.length();i++){
            Integer c=map.get(str.charAt(i));
            if(map.get(str.charAt(i))==null){
                map.put(str.charAt(i),1);

            }else{
                map.put(str.charAt(i),c++);
            }
        }
        for(Entry<Character, Integer> entry : map.entrySet()){
            System.out.println("Charcter: "+entry.getKey()+" Frequency:"+entry.getValue());
        }
    }

    private void getWordVowelCount(String str) {
        int WordCount=0;
        int VowelCount=0;
        int upperCaseCount=0;
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            switch(c){
                case' ':
                case'.':
                WordCount++;
                break;
            }
            switch(c){
                case 'a':
                case 'e':
                  
                case 'i':
                    
                case 'o':
                  
                case 'u':
                    
                case 'A':
                   
                case 'E':
                    
                case 'I':
                    
                case 'O':
                    
                case 'U':
                    VowelCount++;
            }
            if(c>=65 && c<=90){
                upperCaseCount++;
            }
        }
        System.out.println("Wordcount="+WordCount);
       System.out.println("VowelCount="+VowelCount);
        System.out.println("upperCaseCount="+upperCaseCount);
    }
    
}
