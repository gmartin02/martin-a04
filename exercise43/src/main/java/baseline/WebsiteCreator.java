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


    public File createWebsiteFolder(String siteName) {
        File file = new File(website + siteName);
        boolean bool = file.mkdir();
        if(bool) {
            System.out.println(output + siteName);
        }
        return file;
    }
    public File createHTMLFile(String author, String siteName) {
        //takes siteName and Author from the main Solution class

        //creates a html file with the title and author associated with the appropriate tags
        File file = new File("website/" + siteName + "/index.html");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            bw.write("<!DOCTYPE html><html><head><title>" + siteName + "</title><meta name = \"author\" content = \"" + author + "\"></head></html>");
            //writes the html file and places it in the website directory
            System.out.println(output + siteName + "/index.html");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return file;
    }

    public File createJavaFolder(String siteName) {
        //creates an empty java folder
        File file = new File(website + siteName + "/js");
        boolean bool = file.mkdirs();
        if(bool) {
            System.out.println(output + siteName + "/js");
        }
        return file;
    }

    public File createCSSFolder(String siteName) {
        //creates an empty CSS folder
        File file = new File(website + siteName + "/css");
        boolean bool = file.mkdirs();
        if(bool) {
            System.out.println(output + siteName + "/css");
        }
        return file;
    }
}
