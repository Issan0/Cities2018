/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cities2018;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Student
 */
public class Cities {
    private Map<String,List<String>> provinces = new HashMap();

    public Cities() {
    List<String> list1 = new ArrayList();
    list1.add("Elbląg");
    list1.add("Olsztyn");
    list1.add("Pasłęk");
    provinces.put("Warmińsko-Mazurskie", list1);
    List<String> list2 = new ArrayList();
    list2.add("Gdańsk");
    list2.add("Gdynia");
    list2.add("Sopot");
    provinces.put("Pomorskie", list2);
    }
    public static void main(String[] args){
        Cities c = new Cities();
        System.out.println(c.provinces);
    }
}
