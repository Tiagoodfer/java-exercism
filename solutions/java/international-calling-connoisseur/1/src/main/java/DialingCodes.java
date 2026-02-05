import java.util.HashMap;
import java.util.Map;

public class DialingCodes {

    private final Map<Integer, String> dialingCodes = new HashMap<>();

    public Map<Integer, String> getCodes() {
        return dialingCodes;
    }

    public void setDialingCode(Integer code, String country) {
        dialingCodes.put(code, country);
    }

    public String getCountry(Integer code) {
        return dialingCodes.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        if (dialingCodes.containsKey(code)) {
            return;
        }
    
        if (dialingCodes.containsValue(country)) {
            return;
        }
    
        dialingCodes.put(code, country);
    }

    public Integer findDialingCode(String country) {
        return dialingCodes.entrySet().stream()
                .filter(e -> e.getValue() != null && e.getValue().equals(country))
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
    }

    public void updateCountryDialingCode(Integer code, String country) {
        Integer oldCode = findDialingCode(country);
    
        if (oldCode != null && !oldCode.equals(code)) {
            dialingCodes.remove(oldCode);
        }
    
        dialingCodes.put(code, country);
    }
}
