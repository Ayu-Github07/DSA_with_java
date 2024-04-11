public class ArmstrongRange {

    /**
     * from number 100 to 999, Print all the armstrong numbers
     */

    public static boolean isArmStrong(int num) {

        int temp = num, sum = 0, size = (int) Math.log10(num) + 1;
        while (temp > 0) {
            int x = temp % 10;
            sum += Math.pow(x, size);
            temp /= 10;
        }

        // if(num == sum) {
        // return true;
        // }
        // return false;

        return num == sum ? true : false;
    }

    public static void main(String[] args) {

        for (int i = 100; i <= 999; i++) {
            if (isArmStrong(i)) {
                System.out.print(i + " ");
            }
        }

    }
}
