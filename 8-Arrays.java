class Arrays {
    public static void main(String args[]) {
            String numbers[] = new String[5];

            for (int i = 0; i < numbers.length; i++) {
                    numbers[i] = String.valueOf(i);
            }

            int i = 0;
            for (String n : numbers) {
                    System.out.println("Value at index : " + i++ + " is : " + n);

            }
    }
}
