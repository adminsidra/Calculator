class Addition {
    int add(int a, int b) {
        return a + b;
    }
    double add(double a, double b) {
        return a + b;
    }
    public static void main(String[] args) {
        Addition obj = new Addition();
        System.out.println("Sum of integers: " + obj.add(2, 3));
        System.out.println("Sum of doubles: " + obj.add(2.5, 2.5));
    }
}
