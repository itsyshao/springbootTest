package indi.itsyshao.SpringBootTest;

/**
 * Created by ibm on 2017/5/26.
 */
public class Greeting {
    private String id = "";
    private String content = "";

    public Greeting(String id, String content) {
        this.id = id;
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
