public class Ex804 extends Math {
    public static void main(String[] args) {
        int a = 10, b = 5;
        double c = 2.5, d = 4.5;
    
        Ex804 calc = new Ex804();
        
        System.out.println(a + "+" + b + "=" + calc.add(a,b));
        System.out.println(a + "+" + c + "=" + calc.add(a,c));
        System.out.println(c + "+" + d + "=" + calc.add(c,d));

        // Divide 나누기
        System.out.println(a + "/" + b + "=" + calc.add(a,b));
        System.out.println(a + "/" + c + "=" + calc.add(a,c));
        System.out.println(c + "/" + d + "=" + calc.add(c,d));
        // Square 제곱하기
        System.out.println(a + "^2" + b + "=" + calc.add(a,b));
        System.out.println(a + "^2" + c + "=" + calc.add(a,c));
        System.out.println(c + "^2" + d + "=" + calc.add(c,d));
}
}