package String;

public class StringDemo{

    public static void main(String[] args){
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder stringBuilder = new StringBuilder();

        // Creating multiple threads to manipulate StringBuffer and StringBuilder objects
        Thread stringBufferThread = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                stringBuffer.append("A");
            }
        });

        Thread stringBuilderThread = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                stringBuilder.append("B");
            }
        });

        stringBufferThread.start();
        stringBuilderThread.start();

        try {
            stringBufferThread.join();
            stringBuilderThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Printing the lengths of StringBuffer and StringBuilder objects
        System.out.println("StringBuffer length: " + stringBuffer.length());
        System.out.println("StringBuilder length: " + stringBuilder.length());
    }
}
