package designPatterns.creationalDesignPatterns.simpleFactory;

import java.time.LocalDate;

public class NewsPost extends Post{

    private String headLine;
    private LocalDate newsTime;

    public String getHeadLine() {
        return headLine;
    }

    public void setHeadLine(String headLine) {
        this.headLine = headLine;
    }

    public LocalDate getNewsTime() {
        return newsTime;
    }

    public void setNewsTime(LocalDate newsTime) {
        this.newsTime = newsTime;
    }
}
