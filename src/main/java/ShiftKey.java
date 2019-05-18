public class ShiftKey {

    private int shift;

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        if(shift>26){
            shift = shift%26;
        }else if(shift<0){
            shift =(shift%26)+26;
        }
        this.shift = shift;
    }

    public ShiftKey( int shift) {
        this.shift = shift;

    }
}
