import java.util.Random;
// import java.util.*;

public class PackageDeclarationsImports {
    public static void main(String[] args)
    {
        // without import java.util.Random this code will not work
        Random r = new Random();
        System.out.println(r.nextInt(10));

    }
}
