/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Gabriel Martin
 */
package baseline;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class WebsiteCreatorTest {
    @Test
    void createWebsiteFolderTest() {
        WebsiteCreator wc = new WebsiteCreator();
        File file = wc.createWebsiteFolder("test");
        assertTrue(file.exists());
    }

    @Test
    void createHTMLFileTest() {
        WebsiteCreator wc = new WebsiteCreator();
        File file = wc.createHTMLFile("me", "test");
        assertTrue(file.exists());
    }

    @Test
    void createJavaFolderTest() {
        WebsiteCreator wc = new WebsiteCreator();
        File file = wc.createJavaFolder("test");
        assertTrue(file.exists());
    }

    @Test
    void createCSSFolderTest() {
        WebsiteCreator wc = new WebsiteCreator();
        File file = wc.createCSSFolder("test");
        assertTrue(file.exists());
    }
}