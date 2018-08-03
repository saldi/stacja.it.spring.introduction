package it.stacja.app.web.wykop.domain;

public class Wykop {

    private Long id;
    private String name;
    private String description;
    private String pageUrl;
    private String pageImageUrl;

    public Wykop() {
    }

    public Wykop(String name, String description, String pageUrl, String pageImageUrl) {
        this.name = name;
        this.description = description;
        this.pageUrl = pageUrl;
        this.pageImageUrl = pageImageUrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPageUrl() {
        return pageUrl;
    }

    public void setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
    }

    public String getPageImageUrl() {
        return pageImageUrl;
    }

    public void setPageImageUrl(String pageImageUrl) {
        this.pageImageUrl = pageImageUrl;
    }



}
