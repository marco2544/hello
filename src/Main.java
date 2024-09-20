import forme.Quadrato;
import forme.Rettangolo;
import forme.Shape2d;
import forme.Cerchio;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<String,Integer> map=new HashMap<String,Integer>();
        ArrayList<Shape2d> list = new ArrayList<Shape2d>();

        list.add(new Rettangolo(17,14));
        list.add(new Rettangolo(12,14));
        list.add(new Quadrato(10.5));
        list.add(new Rettangolo(12,10));
        list.add(new Quadrato(17.14));
        list.add(new Cerchio(11));
        for(Shape2d shape : list) {
            System.out.println(shape.toString());
            if(map.containsKey(shape.getClass().getSimpleName())){
                int n=map.get(shape.getClass().getSimpleName());
                map.put(shape.getClass().getSimpleName(),n+1);
            }
            else {
                map.put(shape.getClass().getSimpleName(),1);
            }
        }
        System.out.println(map.toString());


    }
}