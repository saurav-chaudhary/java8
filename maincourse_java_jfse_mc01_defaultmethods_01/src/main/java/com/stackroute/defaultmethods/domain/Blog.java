package com.stackroute.defaultmethods.domain;

public class Blog {

    private int blogId;
    private String blogTitle;
    private String blogContent;
    private String blogAuthor;

    /* Define default constructor */
    public Blog()
    {

    }

    public Blog(int blogId, String blogTitle, String blogContent, String blogAuthor) {
        this.blogId = blogId;
        this.blogTitle = blogTitle;
        this.blogContent = blogContent;
        this.blogAuthor = blogAuthor;
    }

    public int getBlogId() {
        return blogId;
    }

    public void setBlogId(int blogId) {
        this.blogId = blogId;
    }

    public String getBlogTitle() {
        return blogTitle;
    }

    public void setBlogTitle(String blogTitle) {
        this.blogTitle = blogTitle;
    }

    public String getBlogContent() {
        return blogContent;
    }

    public void setBlogContent(String blogContent) {
        this.blogContent = blogContent;
    }

    public String getBlogAuthor() {
        return blogAuthor;
    }

    public void setBlogAuthor(String blogAuthor) {
        this.blogAuthor = blogAuthor;
    }
    

    /* Define parameterized constructor to initialize all the properties */


    /* Define Getters and Setters for all the properties */

}

