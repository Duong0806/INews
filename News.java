package ss5;



import java.util.ArrayList;
import java.util.Scanner;

public class News implements INews {
    public int ID;
    public String Title;
    public String PublishDate;
    public String Author;
    public String Content;
    public float AverageRate;


    public News() {
    }

    public News(int ID, String title, String publishDate, String author, String content, float averageRate) {
        this.ID = ID;
        Title = title;
        PublishDate = publishDate;
        Author = author;
        Content = content;
        AverageRate = averageRate;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public float getAverageRate() {
        return AverageRate;
    }

    public void setAverageRate(float averageRate) {
        AverageRate = averageRate;
    }



    int[] RateList = new int[3];
    public void inPut() {
        Scanner tn = new Scanner(System.in);
        System.out.print("Nhap Title: " );
        Title = tn.nextLine();
        System.out.print("Nhap PublishDate: " );
        PublishDate = tn.nextLine();
        System.out.print("Nhap Author: " );
        Author = tn.nextLine();
        System.out.print("Nhap Content : " );
        Content = tn.nextLine();
        System.out.println("Nhap AverageRate : " );
//        for (int i = 0; i < RateList.length;i++){
//            do{
//                System.out.printf("AverageRate %d : ",i+1);
//                AverageRate = tn.nextInt();
//            }while (RateList[i]<i && RateList[i]>5);
//
//            RateList[i] = (int) AverageRate;
//        }
    }

    @Override
    public void Display() {

        System.out.println(getTitle());
        System.out.println(getPublishDate());
        System.out.println(getAuthor());
        System.out.println(getContent());
        System.out.println(getAverageRate());
    }


    void Calculate() {
        AverageRate = (float) (RateList[0] + RateList[1] + RateList[2])/RateList.length;

    }


}
