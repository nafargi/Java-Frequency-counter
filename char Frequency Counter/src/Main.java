//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String text="mississippi";
        char[] textCharArray= text.toCharArray();
        int lenChar= textCharArray.length;


        for (int i = 0; i < lenChar; i++) {
            int counter=0;
            for (int j = 0; j < lenChar; j++) {
                if(textCharArray[i]==textCharArray[j]){
                    counter++;
                }
            }

            System.out.println("Frequency of " +textCharArray[i]+" is "+counter+" times") ;
        }
    }
}