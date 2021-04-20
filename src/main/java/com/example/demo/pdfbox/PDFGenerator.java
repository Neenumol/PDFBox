package com.example.demo.pdfbox;

import be.quodlibet.boxable.BaseTable;
import be.quodlibet.boxable.Cell;
import be.quodlibet.boxable.Row;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PDFGenerator {

    public void generate(){
        try (PDDocument doc = new PDDocument()) {

            PDPage myPage = new PDPage();
            doc.addPage(myPage);
            PDRectangle mediabox = myPage.getMediaBox();

            float fontSize = 12;
            float leading = 1.5f*fontSize;
            float margin = 75;
            float width = mediabox.getWidth() - 2 * margin;
            float startX = mediabox.getLowerLeftX() + margin;
            float startY = mediabox.getUpperRightY() - margin;
            float yOffset = startY;
            PDType1Font font = PDType1Font.TIMES_ROMAN;
            PDType1Font fontBold = PDType1Font.TIMES_BOLD;







            try (PDPageContentStream cont = new PDPageContentStream(doc, myPage)) {

                float scale = 1f;
                PDImageXObject pdImage = PDImageXObject.createFromFile("src/main/resources/static/Validus.png", doc);
                scale = width/pdImage.getWidth();
//              yOffset-=(pdImage.getHeight()*scale);
                yOffset -= 40;
                cont.drawImage(pdImage, startX, startY, 200, 40);
//                cont.drawImage(pdImage, 35, 700, width, pdImage.getHeight()*scale);

//                String heading = "PDFBox Example";
//                StringBuffer pageText = new StringBuffer();
//                pageText.append("Terms defined and the rules of interpretation in the SMEs’ Terms and Conditions and ");
//                pageText.append("the Working Capital Financing Facility Terms and Conditions ");
//                pageText.append("have the same meaning and effect in this Facility Request unless a different meaning is ascribed to it here.");
////                pageText.append("There should be a header above this text and some images below it.");
////                pageText.append("The font should be what was specified or Helvetica");
//                pageText.append(System.getProperty("line.separator"));
////                pageText.append(System.getProperty("line.separator"));
//                pageText.append("The terms in this Facility Request shall be read together with the terms of the SMEs’ Terms and Conditions. The terms of the SMEs’ Terms and Conditions shall apply to this Facility Request as if set out herein mutatis mutandis .");

                String text = "Terms defined and the rules of interpretation in the SMEs’ Terms and Conditions and the Working Capital Financing Facility Terms and Conditions " +
                        "have the same meaning and effect in this Facility Request unless a different meaning is ascribed to it here.";

                List<String> lines = new ArrayList<>();

//                parseIndividualLines(pageText, lines, fontSize, PDType1Font.TIMES_ROMAN, width);

                cont.beginText();
                cont.setFont(fontBold, 15.0f);
                cont.newLineAtOffset(startX, yOffset);
                yOffset-=leading;
                cont.showText("FACILITY REQUEST");
                cont.newLineAtOffset(0, -leading);
                yOffset-=leading;

                Paragraph paragraph = new Paragraph();
                paragraph.addParagraph(cont, width, 0, -12, text, true, font);

                 text = "The terms in this Facility Request shall be read together with the terms of the SMEs’ Terms and Conditions. The terms of the SMEs’ Terms and " +
                         "Conditions shall apply to this Facility Request as if set out herein mutatis mutandis .";
                paragraph.addParagraph(cont, width, 0, -12, text, true, font);

                text = "For the avoidance of doubt, the terms of the SMEs’ Terms and Conditions shall continue to apply to us in our dealings through the Platform and " +
                        "our Account.";

                paragraph.addParagraph(cont, width, 0, -12, text, true, font);

                drawTable(doc, myPage);

//                cont.setTextTranslation(startX * 72, mediabox.getHeight() - (startY*72) );



//                for (String line:lines) {
//                    cont.showText(line);
////                    cont.drawString(line);
//                    cont.newLineAtOffset(0, -leading);
//                    yOffset-=leading;
//                }




//                cont.newLineAtOffset(35, 450);

                cont.setFont(PDType1Font.TIMES_ROMAN, fontSize);
                cont.newLineAtOffset(startX, startY);
                yOffset -= leading;
                cont.setLeading(14.5f);

//                cont.newLineAtOffset(25, 700);
//                String line1 = "World War II (often abbreviated to WWII or WW2), "
//                        + "also known as the Second World War,";
//                cont.showText(line1);
//
//                cont.newLine();
//
//                String line2 = "was a global war that lasted from 1939 to 1945, "
//                        + "although related conflicts began earlier.";
//                cont.showText(line2);
//                cont.newLine();
//
//                String line3 = "It involved the vast majority of the world's "
//                        + "countries—including all of the great powers—";
//                cont.showText(line3);
//                cont.newLine();
//
//                String line4 = "eventually forming two opposing military "
//                        + "alliances: the Allies and the Axis.";
//                cont.showText(line4);
                cont.newLine();

                    cont.endText();
            } catch (IOException e) {
                e.printStackTrace();
            }

            doc.save("src/main/resources/wwii.pdf");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void drawTable(PDDocument doc, PDPage myPage) throws IOException {

        float margin = 75;

        //Dummy Table
        // starting y position is whole page height subtracted by top and bottom margin
        float yStartNewPage = myPage.getMediaBox().getHeight() - (2 * margin);
        // we want table across whole page width (subtracted by left and right margin ofcourse)
        float tableWidth = myPage.getMediaBox().getWidth() - (2 * margin);

        boolean drawContent = true;
        float yStart = yStartNewPage;
        float bottomMargin = 70;
        // y position is your coordinate of top left corner of the table
        float yPosition = 550;

        BaseTable table = new BaseTable(yPosition, yStartNewPage, bottomMargin, tableWidth, margin, doc, myPage, true, drawContent);

        float defaultRowHeight = 28f;


        Row<PDPage> headerRow = table.createRow(defaultRowHeight);
        Cell<PDPage> cell = headerRow.createCell(50, "<b>Facility ID :</b>");
        cell =  headerRow.createCell(50, "20932");
        table.addHeaderRow(headerRow);


        Row<PDPage> row = table.createRow(defaultRowHeight);
        cell = row.createCell(50, "<b>Name of SME :</b> IMPEX MARINE (S) PTE LTD");
        cell = row.createCell(50, "<b>UEN</b>: 1900089G ");

        HashMap<Integer, String> productMap = new HashMap<>();
        productMap.put(1, "Invoice Finacing AR(Disclosed)");
        productMap.put(2, "Invoice Finacing AR(No Disclosed)");
        productMap.put(3, "Purchase Order Financing");
        productMap.put(4, "Working Capital Financing");

        Row<PDPage> productTypeRow = table.createRow(50);
        StringBuilder str = new StringBuilder();
        str.append("<b>Type of Facility Application:</b><br>");
        for (Map.Entry<Integer, String > entry : productMap.entrySet()){
            str.append(entry.getValue());
            str.append("<br><br>");
        }
        cell =  productTypeRow.createCell(100, str.toString());

        HashMap<String, String> tableRawData = new HashMap<>();
        tableRawData.put("<b>Funded Amount:</b>", "S$ 80,000.00");
        tableRawData.put("<b>Tenure Offered:</b>", "3 (Months)");
        tableRawData.put("<b>Tenure of Facility:</b>", "The Facility shall be repaid by us in accordance with the Schedule annexed.");
        tableRawData.put("<b>Interest Rate (per month):</b>", "2.50%, calculated per day basis");
        tableRawData.put("<b>Interest Structure*: </b>", "Declining Balance");
        tableRawData.put("<b>Late Payment Fee: </b>", "1.00% of outstanding installment due");
        tableRawData.put("<b>Funding Fee:: </b>", "3.2100% of the Funded Amount (Inclusive of GST)");
        for (Map.Entry<String, String > entry : tableRawData.entrySet()){
            Row<PDPage> rowEntry = table.createRow(defaultRowHeight);
            cell = rowEntry.createCell(50, entry.getKey());
            cell = rowEntry.createCell(50, entry.getValue());
        }


        table.draw();
    }

    private void parseIndividualLines(StringBuffer wholeLetter, List<String> lines, float fontSize, PDFont pdfFont, float width) throws IOException {
        String[] paragraphs = wholeLetter.toString().split(System.getProperty("line.separator"));
        for (int i = 0; i < paragraphs.length; i++) {
            int lastSpace = -1;
            lines.add(" ");
            while (paragraphs[i].length() > 0) {
                int spaceIndex = paragraphs[i].indexOf(' ', lastSpace + 1);
                if (spaceIndex < 0) {
                    spaceIndex = paragraphs[i].length();
                }
                String subString = paragraphs[i].substring(0, spaceIndex);
                float size = fontSize * pdfFont.getStringWidth(subString) / 1000;
                //System.out.printf("'%s' - %f of %f\n", subString, size, width);
                if (size > width) {
                    if (lastSpace < 0) {
                        lastSpace = spaceIndex;
                    }
                    subString = paragraphs[i].substring(0, lastSpace);
                    lines.add(subString);
                    paragraphs[i] = paragraphs[i].substring(lastSpace).trim();
                    //System.out.printf("'%s' is line\n", subString);
                    lastSpace = -1;
                } else if (spaceIndex == paragraphs[i].length()) {
                    lines.add(paragraphs[i]);
                    //System.out.printf("'%s' is line\n", paragraphs[i]);
                    paragraphs[i] = "";
                } else {
                    lastSpace = spaceIndex;
                }
            }
        }
    }


}
