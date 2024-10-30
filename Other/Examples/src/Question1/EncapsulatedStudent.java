package Question1;

public class EncapsulatedStudent {
    private  int midtermExam;
    private  int finalExam;

    EncapsulatedStudent(int midtermExam,int finalExam ){
        setMidterm(midtermExam);
        setFinal(finalExam);
    }

    void  setMidterm(int midtermExam){
        if (midtermExam >100 || midtermExam<0){
            throw new IllegalArgumentException("Wrong number");
        }
        this.midtermExam=midtermExam;

    }
    void setFinal(int finalExam){
        if (finalExam >100 || finalExam<0){
            throw new IllegalArgumentException("Wrong number");
        }
        this.finalExam=finalExam;
    }

    int getMidterm(){
        return this.midtermExam;
    }
    int getFinal(){
        return this.finalExam;
    }
    public double getAverage(){
        return this.midtermExam*0.4d + this.finalExam*0.6d;

    }
}
