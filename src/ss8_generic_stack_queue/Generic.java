package ss8_generic_stack_queue;

import java.util.ArrayList;
import java.util.List;

public class Generic {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();

        list.add(10);
        list.add(10);
//        list.add("10");

        int sum = 0;
        for(int i = 0; i < list.size(); i++) {
            sum += list.get(i);
//            if(list.get(i) instanceof Integer) {
//                sum += (Integer)list.get(i);
//            } else if(list.get(i) instanceof String) {
//                sum += Integer.parseInt((String) list.get(i));
//            }
        }

        System.out.println("Tổng: " + sum);
    }
}
