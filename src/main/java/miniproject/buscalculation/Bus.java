package miniproject.buscalculation;

import java.util.ArrayList;
import java.util.List;

public class Bus {

    // bus number , seats ,

    public String busNum; // 501A brodview bundan dolayi bus number string yaptik

    public List<String> seats = new ArrayList<>(); // string kullanmamizin sebebi eger integer kullansaydik listlerde her defasinda remove kullanmamiz gerektigi icin


    public Bus(String busNum) { // constructor
        this.busNum = busNum;

        for(int i =1 ; i<33 ; i++){
            seats.add(String.valueOf(i)); // or seats.add(i + "")

        }










    }
}
