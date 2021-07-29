package com.example.demo.pdfbox;

import be.quodlibet.boxable.BaseTable;
import be.quodlibet.boxable.Cell;
import be.quodlibet.boxable.Row;
import be.quodlibet.boxable.VerticalAlignment;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

import java.io.IOException;

public class POA {

    public void generate() throws IOException {
        PDDocument doc = new PDDocument();
        PDPage myPage = new PDPage();
        doc.addPage(myPage);
        //drawPageFirstTable(doc, myPage);
        doc.save("src/main/resources/poa.pdf");
        doc.close();
    }

    private void drawPageFirstTable(PDDocument doc, PDPage myPage) throws IOException {

    }/*{
        PDPage myPage = new PDPage();
        doc.addPage(myPage);
        PDRectangle mediabox = myPage.getMediaBox();
        float fontSize = 12;
        float leading = 1.5f * fontSize;
        float margin = 75;
        float width = mediabox.getWidth() - 2 * margin;
        float startX = mediabox.getLowerLeftX() + margin;
        float startY = mediabox.getUpperRightY() - margin;
        float yOffset = startY;
        PDType1Font font = PDType1Font.TIMES_ROMAN;
        PDType1Font fontBold = PDType1Font.TIMES_BOLD_ITALIC;
        PDPageContentStream cont = new PDPageContentStream(doc, myPage);
        // PDFont font1 = PDTrueTypeFont.loadTTF(doc, "fonts/arialuni.ttf");
        float scale = 1f;
        yOffset -= 40;
        createHeading(cont, fontBold, startX, yOffset, leading,doc,myPage);
        float margin = 75;
        float yStartNewPage = myPage.getMediaBox().getHeight() - (2 * margin);
        float tableWidth = myPage.getMediaBox().getWidth() - (2 * margin);

        boolean drawContent = true;
        float yStart = yStartNewPage;
        float bottomMargin = 70;
        float yPosition = 300;

        BaseTable table =
                new BaseTable(yPosition, yStartNewPage, bottomMargin, tableWidth,
                        margin, doc, myPage, true, drawContent);

        float defaultRowHeight = 28f;

        Row<PDPage> headerRow = table.createRow(defaultRowHeight);
        Cell<PDPage> cell = headerRow.createCell(100, "BY THIS POWER OF ATTORNEY made on ________ , ____________________ (");
        //        cell.setBorderStyle(null);
        //cell.setValign(VerticalAlignment.MIDDLE);
       // cell = headerRow.createCell(90, "<b><123></b>");
        //cell.setValign(VerticalAlignment.MIDDLE);
        table.addHeaderRow(headerRow);
        table.draw();
      //  cont.close();
    }*/
}
