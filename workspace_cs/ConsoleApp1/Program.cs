
class program
{
    static void Main(String[]args)
    {
        Console.Write("Hello, World!");
        Console.WriteLine("Hello, c#");

        int[] products = new int[3];

        int[] p = new int[3];
        p[0] = 10;
        p[1] = 20;

        test();

        int[] arr = { 1, 2, 3, 4, 5 };
        foreach (int i in arr)
        {
            Console.Write(i + ", ");
        }

    }
static void test()
{
    Console.WriteLine("test");
}


}



