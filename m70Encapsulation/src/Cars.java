import java.util.ArrayList;
import java.util.List;

public class Cars {
    private List<String> cars;

    //BAD PRACTICE: returning the private reference! as List is mutable
    //    public List<String> getCars() {
    //        return cars;
    //    }
    //GOOD PRACTICE: does not return actual data, but a copy instead:
    public List<String> getCars() {
        return new ArrayList<>(this.cars);
    }

    public void setCars(List<String> cars) {
        this.cars = cars;
    }
}
