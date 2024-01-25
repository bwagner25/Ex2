//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] weekDays = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        int[] temperatures = {45,29,10,22,41,28,33};
        int[] precipitationChance = {95,60,25,5,0,75,90};

        for(int i = 0; i< weekDays.length; i++){
            if (temperatures[i]<=32){
                if (precipitationChance[i]>50){
                    System.out.println("It will snow on " + weekDays[i]);
                }
            }
        }
    }
}