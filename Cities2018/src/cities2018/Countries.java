
package cities2018;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;


public class Countries {
    private Map<String,String> countries = new HashMap();
    
    public Countries(){
        countries.put("Poland", "Warsaw");
         countries.put("Germany", "Berlin");
          countries.put("Russia", "Moscow");
           countries.put("Great Britan", "London");
            countries.put("France", "Paris");
             countries.put("Spain", "Madrid");
            
    }
    @Override
    public String toString(){
        return countries.toString();
    }
    public static void main(String[] args){
        Countries c = new Countries();
        System.out.println(c);
        System.out.println(c.capitals());
        System.out.println(c.countries());
        System.out.println(c.sortedCapitals());
        System.out.println(c.sortedCountries());
    }

public Collection<String> capitals ()
{
return countries.values();
}
public Collection<String> countries()
{
return countries.keySet();
}
public Collection<String> sortedCapitals()
{
    TreeSet set = new TreeSet();
    set.addAll(countries.values());
    return set;
}
public Collection<String> sortedCountries()
{
    TreeSet set = new TreeSet();
    set.addAll(countries.keySet());
    return set;
}
}
