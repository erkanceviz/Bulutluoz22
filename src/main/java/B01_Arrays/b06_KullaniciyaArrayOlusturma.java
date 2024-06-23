package B01_Arrays;

public class b06_KullaniciyaArrayOlusturma {
    public static void main(String[] args) {
        String[] arr = new String[]{"Apex", "is", "an", "object", "oriented", "programming", "language"};
        String s = "object";
        int counter = 0;
        for(String w : arr){
            if(w.equalsIgnoreCase(s)){
                counter++;
            }
        }
        if(counter>0){
            System.out.println(s + " arrayde vardir");
        }else{
            System.out.println(s + " arrayde yoktur");
        }
    }
}
