public class ShiftKey {

    private int shift;

    public int getShift() { //get method for the shift value
        return shift;
    }

    public void setShift(int shift) { // setting the value which will entered as shift
        if(shift>26){
            shift = shift%26;
        }else if(shift<0){
            shift =(shift%26)+26;
        }
        this.shift = shift;
    }

    public ShiftKey( int shift) {  //constructor
        this.shift = shift;

    }
}
