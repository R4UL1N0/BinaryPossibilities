import java.util.HashSet;
import java.util.Random;
import java.util.Set;

class BinaryPossibilities {
    public static void main(String[] args) {

        int lengthLoop = 15;
        for (int i = 0; i < lengthLoop; i++) {
            possibilities(i);
        }

        
        
        // System.exit(0);
    }

    public static void possibilities(int nLength) {

        Set<String> binariesArray = new HashSet<String>();
        int arrayLength = (int) Math.pow(2, nLength);
        
        if (nLength == 3) {
            arrayLength--;
        }
        int loops = 0;

        while (binariesArray.size() != arrayLength) {
            // System.out.println("LOOP NUMBER " + loops);
            loops++;

            String binary = "";

            for (int i = 0; i < nLength; i++) {
                Random random = new Random();
                
                int randomBinary = random.nextInt(0, 2);

                binary += String.valueOf(randomBinary);

            }

            binariesArray.add(binary);
        }

        System.out.println("LENGTH DE CADA BINÁRIO: " + nLength);
        System.out.println("LENGTH DA ARRAY: " + binariesArray.size());
        System.out.println("NUMERO TOTAL DE LOOPS: " + loops);
        System.out.println();
        // System.out.println(binariesArray);
    }
}