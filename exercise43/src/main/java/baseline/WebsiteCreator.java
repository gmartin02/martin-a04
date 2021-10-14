/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Gabriel Martin
 */
package baseline;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class WebsiteCreator {
    String output = "Created ./website/";
    String website = "website/";
    Solution43 solution = new Solution43();
    String siteName = solution.getSiteName();
    String author = solution.getSiteAuthor();
    boolean js = solution.javaFolderAnswer();
    boolean css = solution.cssFolderAnswer();

    public void createHTMLFile() {
        //takes siteName and Author from the main Solution class
        File file = new File(website + siteName);
        boolean bool = file.mkdir();
        if(bool) {
            System.out.println(output + siteName);
        }
        //creates a html file with the title and author associated with the appropriate tags
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("website/" + siteName + "/index.html"))) {
            bw.write("<!DOCTYPE html><html><head><title>" + siteName + "</title><meta name = \"author\" content = \"" + author + "\"></head></html>");
            //writes the html file and places it in the website directory
            System.out.println(output + siteName + "/index.html");
        } catch (Exception e) {
            e.printStackTrace();
        }

        if(js) {
            createJavaFolder();
        }

        if(css) {
            createCSSFolder();
        }
    }

    public void createJavaFolder() {
        //creates an empty java folder
        File file = new File(website + siteName + "/js");
        boolean bool = file.mkdirs();
        if(bool) {
            System.out.println(output + siteName + "/js");
        }
    }

    public void createCSSFolder() {
        //creates an empty CSS folder
        File file = new File(website + siteName + "/css");
        boolean bool = file.mkdirs();
        if(bool) {
            System.out.println(output + siteName + "/css");
        }
    }
}
