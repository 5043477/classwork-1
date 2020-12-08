class Main {
  public static void main(String[] args) {
    Sum s = new Sum(12,13);

    System.out.println(s.sumOF());
    //now i want you to create 3 other classes;
    //subtract,multiply, and divide
    //reference the assignment posted
    Subtract s = new Subtract(20,17);

    System.out.println(s.subtract());

    Multiply s = new Multiply(15,17);

    System.out.println(s.multiplyOF());
  }
}