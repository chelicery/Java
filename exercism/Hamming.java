public class Hamming {
    private char[] left;
    private char[] right;
    Hamming(String leftStrand, String rightStrand) throws IllegalArgumentException {
        if(leftStrand.length() != rightStrand.length()){
            throw new IllegalArgumentException();
        } else {
            this.left = leftStrand.toCharArray();
            this.right = rightStrand.toCharArray();
        }
    }

    int getHammingDistance() {
        int distant = 0;
        for(int i = 0; i < left.length; i++ ){
            if(left[i] != right[i]){
                distant++;
            }
        }

        return distant;
    }

}
