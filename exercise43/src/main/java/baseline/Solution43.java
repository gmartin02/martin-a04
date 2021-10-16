/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Gabriel Martin
 */
package baseline;

import java.util.Scanner;

public class Solution43 {

    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        WebsiteCreator wc = new WebsiteCreator();
        Solution43 solution = new Solution43();

        String siteName = solution.getSiteName();
        String author = solution.getSiteAuthor();

        boolean js = solution.javaFolderAnswer();
        boolean css = solution.cssFolderAnswer();

        //calls all the Website Creator methods
        wc.createWebsiteFolder(siteName);
        wc.createHTMLFile(author, siteName);

        if(js) {
            wc.createJavaFolder(siteName);
        }

        if(css) {
            wc.createCSSFolder(siteName);
        }
    }

    public String getSiteName() {
        //prompts for site name
        System.out.print("Site name: ");
        //returns site name
        return input.nextLine();
    }

    public String getSiteAuthor() {
        //prompts for site author
        System.out.print("Author: ");
        //returns site author
        return input.nextLine();
    }

    public boolean javaFolderAnswer() {
        //prompts if user wants a java folder
        System.out.print("Do you want a folder for JavaScript(Y/N)? ");
        //returns true for yes, false for no
        String answer = input.nextLine();
        if(answer.equals("Y")) {
            return true;
        } else if (answer.equals("N")) {
            return false;
        }
        return false;
    }

    public boolean cssFolderAnswer() {
        //prompts if user wants a CSS folder
        System.out.print("Do you want a folder for CSS(Y/N)? ");
        //returns true for yes, false for no
        String answer = input.nextLine();
        if(answer.equals("Y")) {
            return true;
        } else if (answer.equals("N")) {
            return false;
        }
        return false;
    }
}
