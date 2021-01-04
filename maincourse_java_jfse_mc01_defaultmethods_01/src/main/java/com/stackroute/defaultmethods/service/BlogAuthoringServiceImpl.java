package com.stackroute.defaultmethods.service;

import com.stackroute.defaultmethods.domain.Blog;

public class BlogAuthoringServiceImpl implements BlogAuthoringService {

    /* Override this method to return a string message */
    @Override
    public String publishBlog(Blog blog) {

        return "Blog published successfully";
    }

    /* Write the logic for processing the blog */
    public String processBlog(Blog blog) {
        BlogAuthoringServiceImpl bsi= new  BlogAuthoringServiceImpl();
     boolean flag =   bsi.rejectBlogForInformalWords(blog);
     System.out.println(flag);
     if(flag==false)
     {
         return "Blog published successfully";
     }
     else
     {
        return "Blog is rejected!";
     }
        
      
    }

}
