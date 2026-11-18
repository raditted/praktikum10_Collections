import java.util.HashSet;
import java.util.Set;

public class CountrySetDemo {
    static void main(String[] args) {
        HashSet<String> countries = new HashSet<>();

        countries.add("Indonesia");
        countries.add("Japan");
        countries.add("Malaysia");
        countries.add("Singapore");
        countries.add("Thailand");
        countries.add("Indonesia");

        System.out.println("Countries: " + countries);
        System.out.println("Total elements: " + countries.size());
    }
}

//karena line 13 terjadi duplikat maka tidak akan ditambahkkan dan total elementnya tetap 5
