
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan( Apartment compared) {
        return (this.squares > compared.squares) ? true : false;
    }

    public int priceDifference(Apartment compared) {
        return Math.abs((compared.squares * compared.princePerSquare) - (this.squares * this.princePerSquare));
    }

    public boolean moreExpensiveThan(Apartment compared) {
        int result = (this.squares * this.princePerSquare) - (compared.squares * compared.princePerSquare);
        return (result > 0) ? true : false;
    }

}
