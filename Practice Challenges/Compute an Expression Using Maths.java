class exercise {
    public static double exercise_one(double x, double y, double z) {
        double answer = 0;
         double var1=Math.pow(x,2)+Math.pow(y,2);
         double var2=var1-Math.abs(z);
         answer=Math.cbrt(var2);
        return answer;   
    }
}
