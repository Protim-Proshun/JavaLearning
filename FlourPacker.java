public class FlourPacker {

    public static void main(String[] args) {

//        System.out.println(canPack (1, 0, 5));
//        System.out.println(canPack (1, 0, 5));
//        System.out.println(canPack (0, 5, 4));
//        System.out.println(canPack (2, 2, 11));
//        System.out.println(canPack (-3, 2, 12));
//        System.out.println(canPack(4, 18, 19));
//        System.out.println(canPack(6, 2, 17));
//        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 12));
        System.out.println(canPack(2, 10, 18));


    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if(bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        int bigCountInKg = bigCount * 5;
        int pickKg = 0;
        if(goal == bigCountInKg) {
            return true;
        }
        else if(goal > bigCountInKg) {
            pickKg = bigCountInKg;
            if (smallCount != 0) {
                for (int i = 1; i <= smallCount; i++) {
//                    System.out.println(pickKg);
                    pickKg = pickKg + 1;
                    if (pickKg == goal) {
                        return true;
                    }
                }
            }
            return false;
        }
        else {
            for(int i = 1; i <= bigCount; i++) {
                pickKg = i * 5;
                if(goal == pickKg) {
                    return true;
                }
                else if(pickKg > goal) {
                    pickKg = (i - 1) * 5;
                    if(smallCount > 0) {
                        for (int j = 1; j <= smallCount; j++) {
                            pickKg = pickKg + 1;
                            if (pickKg == goal) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
                else {
                    //System.out.println("BigCount is bigger than goal");
                    if(smallCount > 0) {
                        //System.out.println("There are some smallCount" + smallCount);
                        for (int j = 1; j <= smallCount; j++) {
                            //System.out.println("Counting smallCount"  + j + " and the pickKg is : " + pickKg);
                            pickKg = pickKg + 1;
                            if (pickKg == goal) {
                                return true;
                            }
                        }
                    }
                }
            }

        }

        return false;

    }

}
