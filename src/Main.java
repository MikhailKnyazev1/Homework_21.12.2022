import java.util.*;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

//        Напишите метод, который на вход принимает диапазон лет,
//        возвращает список високосных годов в этом диапазоне.
//        Примечание: год високосный если он делится на 400 или делится на
//        4 при этом не делясь на 100.

        int startYear = 0;
        int lastYear = 2022;
        num(startYear,lastYear);
salaries(3);



    }
    public static int[] num (int startYear, int lastYear){

        int[] arr =  IntStream.rangeClosed(startYear,lastYear)
                .filter(x->x%400==0 || x%4==0 && x%100 !=0)
                .toArray();
        System.out.println(Arrays.toString(arr));
    return arr;
    }

    public static List<Double> salaries (int salaryNumbers){
        Random randomNumber = new Random();
        List<Double> mySalaries = DoubleStream.generate(() -> randomNumber.nextGaussian(11190, 29267))
                .filter(n -> n>=0)
                .limit(salaryNumbers)
                .boxed()
                .toList();
        System.out.println(mySalaries);
        return mySalaries;
    }

}