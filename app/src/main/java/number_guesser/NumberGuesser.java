package number_guesser;

public class NumberGuesser {

    Integer number;
    public NumberGuesser(Integer number) {
        this.number = number;
    }

    public String guess(int i) {
        if(i < this.number) {
            return "Higher";
        } else if(i > this.number) {
            return "Lower";
        } else {
            return "Correct!";
        }

    }

    public static void main(String[] args) {
        NumberGuesser game = new NumberGuesser(10);
    }


}
