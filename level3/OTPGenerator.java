public class OTPGenerator {
    static int generateOtp(){
        return (int)(Math.random()*9000000)+1000000;
    }
    static boolean validateOtp(int[] otpArray){
        for(int i=0;i<otpArray.length;i++){
            for(int j=i+1;j<otpArray.length;j++){
                if(otpArray[i]==otpArray[j]){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] otps = new int[10];

         for (int i = 0; i < 10; i++) {
            otps[i] = generateOtp();
        }

        System.out.println("Generated OTPs:");
        for (int otp : otps) {
            System.out.print(otp + " ");
        }
        System.out.println();

        if (validateOtp(otps)) {
            System.out.println("All OTPs are unique.");
        } else {
            System.out.println("Duplicate OTPs found.");
        }
    }
}