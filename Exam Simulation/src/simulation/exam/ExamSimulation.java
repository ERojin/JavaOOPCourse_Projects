/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Bir okulda Fizik sınavı ortak olarak yapılıyor olsun. Kaç şube olduğu ve her bir şubede kaç öğrenci
	olduğu bilgileri klavyeden alınsın. Öğrencilerin notları rasgele olarak belirlensin. Tüm bu işlemlerden sonra Fizik
	sınavı için her bir şubenin ayrı ayrı not ortalamaları ile okulun not ortalamasını bulan simülasyonu yazınız.
	Açıklamalar:
		- Notlar int türü ile tutulacaktır
		- Programı mümkün olduğuca nesne yönelimkli ve genel düşünerek yazınız
	Not: İleride daha iyisi yazılacaktır
-----------------------------------------------------------------------------------------------------------------------*/
package simulation.exam;
import java.util.Random;
import java.util.Scanner;

import static org.csystem.util.array.ArrayUtil.*;


public class ExamSimulation {
  public String lectureName;
  public int [][] grades;
  public double [] averages;
  public double average;
  public void fillGrades()
  {
     Random r = new Random();
     Scanner kb = new Scanner(System.in);

      System.out.printf("%s sınavına giren şube sayısını giriniz:", lectureName);
      grades = new int[Integer.parseInt(kb.nextLine())][];
      averages = new double[grades.length];

      for (int i = 0; i < grades.length; ++i) {
          System.out.printf("%d. şubenin öğrenci sayısını giriniz:", i+1);
          grades[i] = getRandomArray(r, Integer.parseInt(kb.nextLine()), 0, 101);
      }

  }
  public void calculateResults()
  {
      int totalGrades = 0;
      int totalNumberOfStudents = 0;

      for (int i = 0; i < grades.length; ++i) {
          int total = sum(grades[i]);

          averages[i] = (double)total / grades[i].length;
          totalGrades += total;
          totalNumberOfStudents += grades[i].length;
      }

      average = (double)totalGrades / totalNumberOfStudents;
  }
    public ExamSimulation(String name)
    {
        lectureName = name;
    }
  public void run()
  {
      fillGrades();
      calculateResults();
  }

  public void printAverages()
  {
      System.out.printf("%s dersi için not ortalamaları:%n ", lectureName);
      for (int i = 0; i < averages.length; ++i)
          System.out.printf("%d.şubenin not ortalaması:%f%n", i + 1, averages[i]);

      System.out.printf("Okul not ortalaması:%f%n", average);

  }
  public void printGrades()
  {
      System.out.println("-------------------------------------");
      System.out.printf("%s dersinin sınav notları:%n", lectureName);
      for (int i = 0; i < grades.length; ++i) {
          System.out.printf("%d.şubenin sınav notları:%n", i + 1);
          print(2, grades[i]);
      }
      System.out.println("-------------------------------------");
  }

  public void printReport()
  {
      printGrades();
      printAverages();
  }
}
