public class Runner {

    public static void main(String[] args){
        System.out.println(icyHot(-2, 120));
        System.out.println(arrayCount9(new int[]{1, 8, 9}));
        System.out.println(makeAbba("hi", "bye"));
        System.out.println(bobThere("baab"));
        System.out.println(sumDigits("he11o"));
        System.out.println(sum2(new int[]{1,2,3,4}));
        System.out.println(countEvens(new int[]{1,2,3,4}));
        System.out.println(countClumps(new int[]{1,2,2,3,4}));
        System.out.println(love6(3, 5));
        System.out.println(luckySum(2, 4, 8));
    }

    public static boolean icyHot(int temp1, int temp2) {
        if((temp1 < 0 && temp2 > 100) || (temp2 < 0 && temp1 > 100)){
            return true;
        }else{
            return false;
        }
    }

    public static int arrayCount9(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 9){
                count++;
            }
        }
        return count;
    }

    public static String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    public static boolean bobThere(String str) {
        for(int i = 0; i < str.length() - 2; i++){
            if((str.substring(i, i+1).equals("b")) && (str.substring(i+2, i+3).equals("b"))){
                return true;
            }
        }
        return false;
    }

    public static int sumDigits(String str) {
        int sum = 0;
        int num = 0;
        for(int i = 0; i < str.length(); i++){
            char convert = str.charAt(i);
            if(Character.isDigit(convert)){
                num = Integer.parseInt(str.substring(i, i+1));
                sum += num;
            }
        }
        return sum;
    }

    public static int sum2(int[] nums) {
        int num = 0;
        int sum = 0;
        if(nums.length == 1){
            return nums[0];
        }
        if(nums.length == 0){
            return 0;
        }
        for(int i = 0; i < 2; i++){
            num = nums[i];
            sum += num;
        }
        return sum;
    }

    public static int countEvens(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                count++;
            }
        }
        return count;
    }

    public static int countClumps(int[] nums) {
        int count = 0;
        if(nums.length == 0){
            count = 0;
        }else{
            for(int i = 0; i<nums.length-2; i++){
                if(nums[i] == nums[i+1]){
                    if(nums[i] != nums[i+2]){
                        count++;
                    }
                }
            }

            if(nums[nums.length-2]==nums[nums.length-1]){
                count++;
            }
        }

        return count;
    }

    public static boolean love6(int a, int b) {
        if(a == 6 || b == 6){
            return true;
        }else{
            if(a + b == 6){
                return true;
            }else{
                if(a - b == 6 || b - a == 6){
                    return true;
                }else{
                    return false;
                }
            }
        }
    }

    public static int luckySum(int a, int b, int c) {
        int sum = 0;
        if(a == 13){
            return sum;
        }else{
            if(b == 13){
                sum += a;
            }else{
                if(c == 13){
                    sum += a + b;
                }else{
                    sum += a + b + c;
                }
            }
        }
        return sum;
    }


}
