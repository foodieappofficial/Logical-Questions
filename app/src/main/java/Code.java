public class Code {
    public static void main(String[] args) {
        String name = "Zoroy";
        String forward = "";
        String reverse = "";
        int half = (int) name.length()/2;
        if (name.length()%2==0){
            for(int i = half;i<name.length();i++){
                reverse = reverse + name.charAt(i);

            }
        }
        else{
            for(int i = half+1;i<name.length();i++){
                reverse = reverse + name.charAt(i);

            }
        }

        for(int i = 0;i<=half-1;i++){
            forward = forward + name.charAt(i);

        }
        System.out.println(reverse+forward);
    }
}
