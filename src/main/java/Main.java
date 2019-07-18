import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static boolean hasTwoCubeSums(int n) {

        int counter =0
        int border = (int) Math.pow(n, 1.0 / 3);

        List<Integer> numbers = new ArrayList<>();
        for(int i =1; i <= border; i++){
            numbers.add(i);
        }


        for( int a = 0; a<numbers.size(); a++ ){
            for( int b = a+1; b<numbers.size(); b++ ){
                Double tempSum = Math.pow(numbers.get(a),3) + Math.pow(numbers.get(b),3);
                if(tempSum==n){
                    counter++;
                }
            }
        }

        if( counter>1 ){
            return  true;
        }
        return  false;
    }


}
