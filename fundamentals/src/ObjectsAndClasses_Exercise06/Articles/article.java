package ObjectsAndClasses_Exercise06.Articles;

public class article {
    private String title;
    private String content;
    private String author;
    public article (String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }
    //•	"Edit: {new content}"
    //•	"ChangeAuthor: {new author}"
    //•	"Rename: {new title}".
    public void edit(String newContent){
        this.content = newContent;
    }
    public void ChangeAuthor(String newAuthor){
        this.author = newAuthor;
    }
    public void Rename(String newTitle){
        this.title = newTitle;
    }
    @Override
    public String toString() {
        return title + " - " + content + ": " + author;
    }
}
