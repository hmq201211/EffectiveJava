package requirement14;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Comparator;

@Data
@AllArgsConstructor
public class PhoneNumber implements Comparable<PhoneNumber> {
    private Integer areaCode;
    private Integer prefix;
    private Integer lineNum;
    private static final Comparator<PhoneNumber> COMPARATOR = Comparator.comparing(PhoneNumber::getAreaCode).thenComparing(PhoneNumber::getPrefix).thenComparing(PhoneNumber::getLineNum);

    @Override
    public int compareTo(PhoneNumber o) {
        return COMPARATOR.compare(this, o);
    }
}
