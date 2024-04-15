package OOPs_Concepts.Polymorphism;

public class OverloadCompileTime {

    public void averageMarks(int maths, int physics, int chemistry) {
        System.out.println("Average marks for PCM Student = "+ (maths+physics+chemistry)/3);
    }
    public void averageMarks(int maths, int physics, int chemistry, int biology) {
        System.out.println("Average marks for PCMB Student = "+ (maths+physics+chemistry+biology)/4);
    }
    public void averageMarks(int maths, int physics, int chemistry, int comScience, int infoTech) {
        System.out.println("Average marks for Bifocal Student = "+ (maths+physics+chemistry+comScience+infoTech)/5);
    }

}
