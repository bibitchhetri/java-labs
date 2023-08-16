import java.io.*;

class BufferIo {
    public static void main(String[] args) {
        String rawData = null;
        int intVal = 0;
        System.out.println("Please input an integer");
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            rawData = br.readLine();
            intVal = Integer.parseInt(rawData);
        } catch (NumberFormatException ex) {
            System.err.println("Not a valid number " + rawData);
        } catch (IOException e) {
            System.err.println("Unexpected IO Error " + e);
        }
        System.out.println("Evaluated Integer value: " + intVal);
    }
}