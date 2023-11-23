package school.studeent.lecture;

import java.util.Scanner;

public class LectureParserAppConsoleUtil {
    public static void printLectureInfo(LectureInfo lectureInfo)
    {
        int grade =lectureInfo.getGrade();

        System.out.printf("Ad Soyad:%s%n", lectureInfo.studentName);
        System.out.printf("Ders Adı:%s%n", lectureInfo.name);
        System.out.printf("Arasınav Tarihi:%s%n", lectureInfo.midtermDate);
        System.out.printf("Final Tarihi:%s%n", lectureInfo.finalDate);
        System.out.printf("Arasınav Notu:%s%n", lectureInfo.midtermGrade);
        System.out.printf("Final Notu:%s%n", lectureInfo.finalGrade);
        System.out.printf("Geçme Notu:%s%n", grade);
        System.out.printf("Sonuç:%s%n", grade >= 50 ? "Geçti" : "Kaldı");

    }
}
