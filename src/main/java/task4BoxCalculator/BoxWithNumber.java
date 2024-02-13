package task4BoxCalculator;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BoxWithNumber <T extends Number>{
    private T[] array;

    public BoxWithNumber(T[] element) {

        this.array = element;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public Double average(){
        Double res = 0.0;
        for (int i = 0; i < array.length; i++) {
            res += array[i].doubleValue();
        }
        res = res / array.length;
        return res;
    }

    public boolean compareAverage(BoxWithNumber<? extends Number> box2){
        return average() > box2.average();

    }
    public boolean compareAverage(Double average1, Double average2){
        return average1>average2;
    }
}