package BullsAndCows;

public class Answer {
    private String value;
    private int bulls;
    private int cows;

    public Answer(String value, int bulls, int cows) {
        this.value = value;
        this.bulls = bulls;
        this.cows = cows;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "value='" + value + '\'' +
                ", bulls=" + bulls +
                ", cows=" + cows +
                '}';
    }
}