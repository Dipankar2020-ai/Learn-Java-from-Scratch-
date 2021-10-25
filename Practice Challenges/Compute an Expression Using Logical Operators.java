class exercise {
    public static boolean exercise_two(boolean x, boolean y) {
        boolean answer = false;

        boolean a=!x;
        boolean b=a^x;
        boolean c=y && b;
        answer=!c ;
        return answer;
    }
}
