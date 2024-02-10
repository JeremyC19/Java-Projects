public static void SimpleResult(int value)
        {
        if (value > 0)
        {
        System.out.print(value % 2 + “ “);
        SimpleResult(value / 2);
        }
        }
public static void main(String[] args)
        {
        SimpleResult(4);
        }