package com.example.demo.pdfbox;

import be.quodlibet.boxable.*;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class VN_FRS {

    public void generate() throws IOException {

        PDDocument doc = new PDDocument();
        pageOne(doc);
        pageTwo(doc);
        pageThree(doc);
        pageFour(doc);
        pageFive(doc);
        pageSix(doc);
        pageSeven(doc);
        pageEight(doc);
        doc.save("src/main/resources/frs.pdf");
        doc.close();
    }

    private void pageOne(PDDocument doc) throws IOException {
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
        logoCreation(doc, cont, startX, startY);
        yOffset -= 40;
        createHeading(cont, fontBold, startX, yOffset, leading,doc,myPage);
        createContent(cont, width, font);
        drawPageFirstTable(doc, myPage);
        cont.close();
    }

    private void pageTwo(PDDocument doc) throws IOException {
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
        logoCreation(doc, cont, startX, startY);
        yOffset -= 40;
        createHeading1(cont, fontBold, startX, yOffset, leading);
        drawPage_TwoTable(doc, myPage);
        cont.close();
    }



    private void pageThree(PDDocument doc) throws IOException {
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
        PDType1Font fontBold = PDType1Font.TIMES_BOLD;
        PDPageContentStream cont = new PDPageContentStream(doc, myPage);
        float scale = 1f;
        logoCreation(doc, cont, startX, startY);
        yOffset -= 40;
        createHeading1(cont, fontBold, startX, yOffset, leading);
        drawPage_ThirdTable(doc, myPage);
        createThirdPageContent(cont, width, font,doc,myPage);
        cont.close();
    }


    private void pageFour(PDDocument doc) throws IOException {
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
        PDType1Font fontBold = PDType1Font.TIMES_BOLD;
        PDPageContentStream cont = new PDPageContentStream(doc, myPage);
        float scale = 1f;
        logoCreation(doc, cont, startX, startY);
        yOffset -= 40;
        createHeading1(cont, fontBold, startX, yOffset, leading);
        createFourthContent(cont, width, font);
        cont.close();
    }


    private void pageFive(PDDocument doc) throws IOException {
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
        logoCreation(doc, cont, startX, startY);
        yOffset -= 40;
        createHeading1(cont, fontBold, startX, yOffset, leading);
        createfifthContent(cont, width, font,doc, myPage);
        cont.close();
    }


    private void pageSix(PDDocument doc) throws IOException {
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
        logoCreation(doc, cont, startX, startY);
        yOffset -= 40;
        createHeading1(cont, fontBold, startX, yOffset, leading);
        PageSixtTableAndContent(cont, width, font,doc, myPage);
        cont.close();
    }

    private void pageSeven(PDDocument doc) throws IOException {
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
        logoCreation(doc, cont, startX, startY);
        yOffset -= 40;
        createHeading1(cont, fontBold, startX, yOffset, leading);
        createSevehthContent(cont, width, font,doc, myPage);
        cont.close();
    }

    private void pageEight(PDDocument doc) throws IOException {
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
        PDType1Font fontBold = PDType1Font.TIMES_BOLD;
        PDPageContentStream cont = new PDPageContentStream(doc, myPage);
        float scale = 1f;
        logoCreation(doc, cont, startX, startY);
        yOffset -= 40;
        createEightHeading(cont, fontBold, startX, yOffset, leading,doc,myPage);
        createEightPageContent(cont, width, font,doc,myPage);
        drawPage_EightTable(doc, myPage);
        createEightContent1(cont, width, font,doc, myPage);
        cont.close();
    }

    private void createEightContent1(PDPageContentStream cont, float width, PDType1Font font, PDDocument doc, PDPage myPage) throws IOException {

        float margin = 75;
        float yStartNewPage = myPage.getMediaBox().getHeight() - (2 * margin);
        float tableWidth = myPage.getMediaBox().getWidth() - (2 * margin);
        boolean drawContent = true;
        float bottomMargin = 20;
        float yPosition = 380;
        BaseTable table =
                new BaseTable(yPosition, yStartNewPage, bottomMargin, tableWidth,
                        margin, doc, myPage, true, drawContent);
        float defaultRowHeight = 24f;
        Row<PDPage> headerRow = table.createRow(30f);
        Cell<PDPage> cell = headerRow.createCell(100,
                "Estimated funding date is based on the date of Facility Request generated. Actual funding date is the date<br>" +
                        "<br>that the funds, under this Facility, is sent to your Designated Account");
        cell.setTopBorderStyle(null);
        cell.setBottomBorderStyle(null);
        cell.setLeftBorderStyle(null);
        cell.setRightBorderStyle(null);
        table.addHeaderRow(headerRow);
        Row<PDPage> headerRow1 = table.createRow(defaultRowHeight);
        cell = headerRow1.createCell(100,
                " Estimated repayment date is based on the estimated funding date. Repayment is expected on the actual<br>" +
                        "<br>repayment date which is based off the actual funding date.");
        cell.setTopBorderStyle(null);
        cell.setBottomBorderStyle(null);
        cell.setLeftBorderStyle(null);
        cell.setRightBorderStyle(null);
        table.addHeaderRow(headerRow1);
        table.draw();
    }

    private void createEightPageContent(PDPageContentStream cont, float width, PDType1Font font, PDDocument doc, PDPage myPage) throws IOException {
        Paragraph paragraph = new Paragraph();


        String text = "(Estimated Funding Date): <date of FRS generated>*";
        paragraph.addParagraph(cont, width, 0, -12, text, true, font);
    }

    private void createEightHeading(PDPageContentStream cont, PDType1Font fontBold, float startX, float yOffset, float leading, PDDocument doc, PDPage myPage) throws IOException {
        cont.beginText();
        cont.setFont(PDType1Font.TIMES_ITALIC, 10.0f);
        cont.newLineAtOffset(startX, yOffset);

        float margin = 75;
        float yStartNewPage = myPage.getMediaBox().getHeight() - (2 * margin);
        float tableWidth = myPage.getMediaBox().getWidth() - (2 * margin);
        boolean drawContent = true;
        float bottomMargin = 20;
        float yPosition = 710;
        BaseTable table =
                new BaseTable(yPosition, yStartNewPage, bottomMargin, tableWidth,
                        margin, doc, myPage, true, drawContent);

        Row<PDPage> headerRow = table.createRow(30f);
        Cell<PDPage> cell = headerRow.createCell(100,
                "<b>REPAYMENT SCHEDULE ANNEX</b>");
        cell.setTopBorderStyle(null);
        cell.setFontSize(13);
        cell.setAlign(HorizontalAlignment.CENTER);
        cell.setBottomBorderStyle(null);
        cell.setLeftBorderStyle(null);
        cell.setRightBorderStyle(null);
        table.addHeaderRow(headerRow);
        table.draw();
    }

    private void drawPage_EightTable(PDDocument doc, PDPage myPage) throws IOException {
        float margin = 75;
        float yStartNewPage = myPage.getMediaBox().getHeight() - (2 * margin);
        // we want table across whole page width (subtracted by left and right margin ofcourse)
        float tableWidth = myPage.getMediaBox().getWidth() - (2 * margin);

        boolean drawContent = true;
        float yStart = yStartNewPage;
        float bottomMargin = 70;
        // y position is your coordinate of top left corner of the table
        float yPosition = 650;

        BaseTable table =
                new BaseTable(yPosition, yStartNewPage, bottomMargin, tableWidth,
                        margin, doc, myPage, true, drawContent);

        float defaultRowHeight = 24f;

        Row<PDPage> headerRow = table.createRow(defaultRowHeight);
        Cell<PDPage> cell = headerRow.createCell(50, "(Estimated repayment date(s))");
        //        cell.setBorderStyle(null);
        cell.setValign(VerticalAlignment.MIDDLE);
        cell = headerRow.createCell(50, "(Amount payable on corresponding repayment date)");
        cell.setValign(VerticalAlignment.MIDDLE);
        table.addHeaderRow(headerRow);
        Row<PDPage> headerRow1 = table.createRow(defaultRowHeight);
        cell = headerRow1.createCell(50, "<next repayment date dd/mm/yyyy>");
        //        cell.setBorderStyle(null);
        cell.setValign(VerticalAlignment.MIDDLE);
        cell = headerRow1.createCell(50, "VND <xxxxx>");
        cell.setValign(VerticalAlignment.MIDDLE);
        table.addHeaderRow(headerRow1);
        Row<PDPage> headerRow2 = table.createRow(defaultRowHeight);
        cell = headerRow2.createCell(50, "");
        cell.setValign(VerticalAlignment.MIDDLE);
        cell = headerRow2.createCell(50, "");
        cell.setValign(VerticalAlignment.MIDDLE);
        table.addHeaderRow(headerRow2);
        Row<PDPage> headerRow3 = table.createRow(defaultRowHeight);
        cell = headerRow3.createCell(50, "");
        cell.setValign(VerticalAlignment.MIDDLE);
        cell = headerRow3.createCell(50, "");
        cell.setValign(VerticalAlignment.MIDDLE);
        table.addHeaderRow(headerRow3);
        Row<PDPage> headerRow4 = table.createRow(defaultRowHeight);
        cell = headerRow4.createCell(50, "");
        cell.setValign(VerticalAlignment.MIDDLE);
        cell = headerRow4.createCell(50, "");
        cell.setValign(VerticalAlignment.MIDDLE);
        table.addHeaderRow(headerRow4);
        Row<PDPage> headerRow5 = table.createRow(defaultRowHeight);
        cell = headerRow5.createCell(50, "");
        cell.setValign(VerticalAlignment.MIDDLE);
        cell = headerRow5.createCell(50, "");
        cell.setValign(VerticalAlignment.MIDDLE);
        table.addHeaderRow(headerRow5);
        Row<PDPage> headerRow6 = table.createRow(defaultRowHeight);
        cell = headerRow6.createCell(50, "");
        cell.setValign(VerticalAlignment.MIDDLE);
        cell = headerRow6.createCell(50, "");
        cell.setValign(VerticalAlignment.MIDDLE);
        table.addHeaderRow(headerRow6);
        Row<PDPage> headerRow7= table.createRow(defaultRowHeight);
        cell = headerRow7.createCell(50, "");
        cell.setValign(VerticalAlignment.MIDDLE);
        cell = headerRow7.createCell(50, "");
        cell.setValign(VerticalAlignment.MIDDLE);
        table.addHeaderRow(headerRow7);
        Row<PDPage> headerRow8 = table.createRow(defaultRowHeight);
        cell = headerRow8.createCell(50, "");
        cell.setValign(VerticalAlignment.MIDDLE);
        cell = headerRow8.createCell(50, "");
        cell.setValign(VerticalAlignment.MIDDLE);
        table.addHeaderRow(headerRow8);
        Row<PDPage> headerRow9 = table.createRow(defaultRowHeight);
        cell = headerRow9.createCell(50, "");
        cell.setValign(VerticalAlignment.MIDDLE);
        cell = headerRow9.createCell(50, "");
        cell.setValign(VerticalAlignment.MIDDLE);
        table.addHeaderRow(headerRow9);
        Row<PDPage> headerRow0 = table.createRow(defaultRowHeight);
        cell = headerRow0.createCell(50, "");
        cell.setValign(VerticalAlignment.MIDDLE);
        cell = headerRow0.createCell(50, "");
        cell.setValign(VerticalAlignment.MIDDLE);
        table.addHeaderRow(headerRow0);
        table.draw();
    }


    private void createSevehthContent(PDPageContentStream cont, float width, PDType1Font font, PDDocument doc, PDPage myPage) throws IOException {
        Paragraph paragraph = new Paragraph();


        String text = "(Please make these disbursements to the following accounts)";
        paragraph.addParagraph(cont, width, 0, -12, text, true, font);
        text =
                "<VND85,800,000>  (to Validus’ account):";
        paragraph.addParagraph(cont, width, 0, -12, text, true, font);
        text =
                "(Account Name): VGrowth Development Co., Ltd";
        paragraph.addParagraph(cont, width, 0, -12, text, true, font);
        text =
                "(Bank Name): Sacombank";
        paragraph.addParagraph(cont, width, 0, -12, text, true, font);
        text =
                " (Bank Branch):  Transaction Office";
        paragraph.addParagraph(cont, width, 0, -12, text, true, font);
        text =
                " (Bank Account No.): 0602.1735.6061 (VND)";
        paragraph.addParagraph(cont, width, 0, -12, text, true, font);
        text =
                "(Swift code): SGTTVNVX";
        paragraph.addParagraph(cont, width, 0, -12, text, true, font);


         text = "<VND2,914,200,000> to SME’s account:";
        paragraph.addParagraph(cont, width, 0, -12, text, true, font);
        text =
                "(Account Name): <CONG TY CP ABC>";
        paragraph.addParagraph(cont, width, 0, -12, text, true, font);
        text =
                "(Bank Name): <xxxxxxxxxxxx>";
        paragraph.addParagraph(cont, width, 0, -12, text, true, font);
        text =
                "(Bank Branch): <xxxxxxxx>";
        paragraph.addParagraph(cont, width, 0, -12, text, true, font);
        text =
                "(Bank Account No.): <xxxxxxxxxx>";
        paragraph.addParagraph(cont, width, 0, -12, text, true, font);

        text =
                "";
        paragraph.addParagraph(cont, width, 0, -12, text, true, font);
        text =
                "";
        paragraph.addParagraph(cont, width, 0, -12, text, true, font);
        text =
                "";
        paragraph.addParagraph(cont, width, 0, -12, text, true, font);
        text =
                "";
        paragraph.addParagraph(cont, width, 0, -12, text, true, font);
        text =
                "";
        paragraph.addParagraph(cont, width, 0, -12, text, true, font);
        text =
                "";
        paragraph.addParagraph(cont, width, 0, -12, text, true, font);

        text =
                " ________________________________";
        paragraph.addParagraph(cont, width, 0, -12, text, true, font);
        text =
                " (Name):";
        paragraph.addParagraph(cont, width, 0, -12, text, true, font);

        text =
                "(Designation):";
        paragraph.addParagraph(cont, width, 0, -12, text, true, font);
        text =
                " SME: <CONG TY CP ABC>";
        paragraph.addParagraph(cont, width, 0, -12, text, true, font);
        text =
                "(Date):";
        paragraph.addParagraph(cont, width, 0, -12, text, true, font);
        text =
                "";
        paragraph.addParagraph(cont, width, 0, -12, text, true, font);
        text =
                "";
        paragraph.addParagraph(cont, width, 0, -12, text, true, font);
        text =
                "";
        paragraph.addParagraph(cont, width, 0, -12, text, true, font);
        text =
                " (In the presence of):";
        paragraph.addParagraph(cont, width, 0, -12, text, true, font);
        text =
                "";
        paragraph.addParagraph(cont, width, 0, -12, text, true, font);
        text =
                "";
        paragraph.addParagraph(cont, width, 0, -12, text, true, font);
        text =
                "";
        paragraph.addParagraph(cont, width, 0, -12, text, true, font);
        text =
                "______________________________";
        paragraph.addParagraph(cont, width, 0, -12, text, true, font);
        text =
                "(Name):";
        paragraph.addParagraph(cont, width, 0, -12, text, true, font);
        text =
                "(Identification number):";
        paragraph.addParagraph(cont, width, 0, -12, text, true, font);

    }

    private void createfifthContent(PDPageContentStream cont, float width, PDType1Font font, PDDocument doc, PDPage myPage) throws IOException {
        Paragraph paragraph = new Paragraph();


        String text = "(that the information set out in our Account profile and our previously submitted business profile and" +
                "constitutional documents remain true, accurate and correct;)";
        paragraph.addParagraph(cont, width, 0, -12, text, true, font);
        text =
                "(the accuracy, authenticity and completeness of all the documents and information submitted with our" +
                        "corresponding Facility Application and such document and information is most current and up-to-date;)";
        paragraph.addParagraph(cont, width, 0, -12, text, true, font);
        text =
                "(that the borrowing the Funded Amount would not breach or exceed any limit binding on us;)";
        paragraph.addParagraph(cont, width, 0, -12, text, true, font);
        text =
                "(that no liquidation or dissolution proceedings with respect to us have been commenced by any person" +
                        "or are intended or anticipated by us and no order or resolution for the winding up of the SME has, to the" +
                        "best of our knowledge and belief having made all reasonable enquiries, been made, proposed or" +
                        "threatened;)";
        paragraph.addParagraph(cont, width, 0, -12, text, true, font);
        text =
                "(that no appointment or notice of appointment of a receiver or judicial manager of the SME or any of its" +
                        "assets or property has been made or given or, to the best of our knowledge and belief having made" +
                        "reasonable enquiries, been proposed or threatened;)";
        paragraph.addParagraph(cont, width, 0, -12, text, true, font);
        text =
                "(no Default is outstanding or would result from the SME receiving any Funded Amount;)";
        paragraph.addParagraph(cont, width, 0, -12, text, true, font);
        text =
                "(that there has been no material adverse change or prospective material adverse change in the status," +
                        "business, assets, conditions (financial or otherwise), operations, prospects or operating results of the" +
                        "SME.)";
        paragraph.addParagraph(cont, width, 0, -12, text, true, font);
        text =
                "(We further undertake to Validus):";
        paragraph.addParagraph(cont, width, 0, -12, text, true, font);
    }




    private void drawPage_TwoTable(PDDocument doc, PDPage myPage)
            throws IOException {
        float margin = 75;
        float yStartNewPage = myPage.getMediaBox().getHeight() - (2 * margin);
        float tableWidth = myPage.getMediaBox().getWidth() - (2 * margin);
        boolean drawContent = true;
        float yStart = yStartNewPage;
        float bottomMargin = 70;
        float yPosition = 700;
        BaseTable table =
                new BaseTable(yPosition, yStartNewPage, bottomMargin, tableWidth,
                        margin, doc, myPage, true, drawContent);
        float defaultRowHeight = 44f;

        LinkedHashMap<Integer, String> productMap = new LinkedHashMap<>();
        productMap.put(1, "(Invoice Financing)");
        productMap.put(2, "(Purchase Order Financing)");
        productMap.put(3, "(Distributor Financing)");
        productMap.put(4, "(Working Capital Financing)");

        Row<PDPage> productTypeRow = table.createRow(50);
        StringBuilder str = new StringBuilder();
        for (Map.Entry<Integer, String> entry : productMap.entrySet()) {
            str.append(entry.getValue());
            str.append("<br><br>");
        }
        Cell<PDPage>   cell = productTypeRow.createCell(100, str.toString());

        LinkedHashMap<String, String> tableRawData = new LinkedHashMap<>();
        tableRawData.put("(Funded" +
                "Amount):", "VND <1,000,000>");
        tableRawData.put("(Tenure of" +
                "Facility):", "<04> (Months)");
        tableRawData.put("(Repayment" +
                        "Frequency):",
                "<MONTHLY/QUARTERLY> Instalment (Principal + Interest)<br><br><br><br>"+"Monthly Interest Servicing, Principal at maturity<br><br><br><br>"
                        +"Bullet Repayment (Principal + Interest at maturity)<br><br><br><br>"+"(The Facility shall be repaid by us in accordance with the Repayment" +
                        "Schedule annexed)");
        tableRawData.put("(Interest Rate (per" +
                        "month)):",
                "(<1.10%> accrued daily, starting from Funding Date)");
        tableRawData.put("(Interest Rate per month):", "1.2% tháng");
        tableRawData.put("(Interest Structure) :",
                "(Declining Balance - interest accrual on the" +
                        "outstanding principal)");
        tableRawData.put("(Late Payment" +
                        "Fee):",
                "<1.10%> of Funded Amount (inclusive of 10% VAT)");
        tableRawData.put("(Funding Fee):",
                "<2.34%> of the Funded Amount (inclusive of 10% VAT)");

        for (Map.Entry<String, String> entry : tableRawData.entrySet()) {
            Row<PDPage> rowEntry = table.createRow(defaultRowHeight);
            cell = rowEntry.createCell(50, entry.getKey());
            cell = rowEntry.createCell(50, entry.getValue());

        }
     Row<PDPage> headerRow = table.createRow(defaultRowHeight);
        cell = headerRow.createCell(100,
                "(Security / Guarantee (if applicable))");
        cell.setValign(VerticalAlignment.MIDDLE);
        table.addHeaderRow(headerRow);
        table.draw();
    }

    private void drawPage_ThirdTable(PDDocument doc, PDPage myPage)
            throws IOException {
        float margin = 75;
        float yStartNewPage = myPage.getMediaBox().getHeight() - (2 * margin);
        float tableWidth = myPage.getMediaBox().getWidth() - (2 * margin);
        boolean drawContent = true;
        float yStart = yStartNewPage;
        float bottomMargin = 70;
        float yPosition = 640;
        BaseTable table =
                new BaseTable(yPosition, yStartNewPage, bottomMargin, tableWidth,
                        margin, doc, myPage, true, drawContent);
        float defaultRowHeight = 44f;
        Row<PDPage> headerRow = table.createRow(defaultRowHeight);
        Cell<PDPage> cell = headerRow.createCell(100,
                "(A Deed of Guarantee executed or to be executed by the key persons of the SME and/or a Corporate<br>" +
                        "<br>Guarantee executed or to be executed by the related group entities of the SME. (as may be required by<br>" +
                        "<br>Validus))");
        table.addHeaderRow(headerRow);
        table.draw();

    }

    private void PageSixtTableAndContent(PDPageContentStream cont, float width, PDType1Font font, PDDocument doc, PDPage myPage)
            throws IOException {
        Paragraph paragraph = new Paragraph();

        String text = "(to provide Validus a full set of our management accounts within six (6) weeks of the end of each calendar" +
                "quarter unless otherwise notified by Validus;)";
        paragraph.addParagraph(cont, width, 0, -12, text, true, font);
        text =
                "(not to transact, assign or create any Security over any documents of the SME without Validus’ prior" +
                        "written consent in our Facility Application;";
        paragraph.addParagraph(cont, width, 0, -12, text, true, font);
        text =
                "(to, upon request by Validus, provide Validus with our monthly reconciliation of our accounts.)";
        paragraph.addParagraph(cont, width, 0, -12, text, true, font);
    }

    private void createContent(PDPageContentStream cont, float width,
                               PDType1Font font)
            throws IOException {

        Paragraph paragraph = new Paragraph();
  /*  String text =
            "Các thuật ngữ được định nghĩa và các nguyên tắc được diễn giải tại Các Điều Khoản Và Điều Kiện Của Các\n" +
                    "SME sẽ có cùng ý nghĩa và hiệu lực khi được sử dụng trong Đơn Đăng Ký Vay này, trừ khi được định\n" +
                    "nghĩa khác đi theo Đơn Đăng Ký Vay này.";

    paragraph.addParagraph(cont, width, 0, -12, text, true, font);*/
        String text = "(Terms defined and the rules of interpretation in the SMEs’ Terms and Conditions have the same meaning and" +
                "effect in this Facility Request unless a different meaning is ascribed to it here.)";
        paragraph.addParagraph(cont, width, 0, -12, text, true, font);
        text =
                "(The terms in this Facility Request shall be read together with the terms of the SMEs’ Terms and Conditions" +
                        "in relation to this Facility. The terms of the SMEs’ Terms and Conditions shall apply to this Facility Request" +
                        "as if set out herein, mutatis mutandis.)";
        paragraph.addParagraph(cont, width, 0, -12, text, true, font);
        text =
                "(For the avoidance of doubt, the terms of the SMEs’ Terms and Conditions shall continue to apply to us in our" +
                        "dealings through the Platform and our Account.)";
        paragraph.addParagraph(cont, width, 0, -12, text, true, font);
    }

    private void createHeading(PDPageContentStream cont, PDType1Font fontBold,
                               float startX, float yOffset, float leading, PDDocument doc, PDPage myPage)
            throws IOException {

        cont.beginText();
        cont.setFont(PDType1Font.TIMES_ITALIC, 10.0f);
        cont.newLineAtOffset(startX, yOffset);

        float margin = 75;
        float yStartNewPage = myPage.getMediaBox().getHeight() - (2 * margin);
        float tableWidth = myPage.getMediaBox().getWidth() - (2 * margin);
        boolean drawContent = true;
        float bottomMargin = 20;
        float yPosition = 710;
        BaseTable table =
                new BaseTable(yPosition, yStartNewPage, bottomMargin, tableWidth,
                        margin, doc, myPage, true, drawContent);

        Row<PDPage> headerRow = table.createRow(30f);
        Cell<PDPage> cell = headerRow.createCell(100,
                "(FACILITY REQUEST)");
        cell.setTopBorderStyle(null);
        cell.setFontSize(13);
        cell.setAlign(HorizontalAlignment.CENTER);
        cell.setBottomBorderStyle(null);
        cell.setLeftBorderStyle(null);
        cell.setRightBorderStyle(null);
        table.addHeaderRow(headerRow);
        table.draw();
    }

    private void createHeading1(PDPageContentStream cont, PDType1Font fontBold,
                                float startX, float yOffset, float leading)
            throws IOException {

        cont.beginText();
        cont.setFont(fontBold, 10.0f);
        cont.newLineAtOffset(startX, yOffset);
        yOffset -= leading;
        cont.showText("");
        cont.newLineAtOffset(0, -leading);
    }

    private PDPageContentStream logoCreation(PDDocument doc,
                                             PDPageContentStream cont, float startX, float startY)
            throws IOException {
        float yOffset = startY;
        yOffset = startY;
        yOffset -= 2;
        PDImageXObject pdImage = PDImageXObject.createFromFile(
                "src/main/resources/static/validus-new.png", doc);
        cont.drawImage(pdImage, startX, startY, 200, 40);
        return cont;
    }
    private void createThirdPageContent(PDPageContentStream cont, float width, PDType1Font font, PDDocument doc, PDPage myPage) throws IOException {
        float margin = 75;
        float yStartNewPage = myPage.getMediaBox().getHeight() - (2 * margin);
        float tableWidth = myPage.getMediaBox().getWidth() - (2 * margin);
        boolean drawContent = true;
        float bottomMargin = 20;
        float yPosition = 500;
        BaseTable table =
                new BaseTable(yPosition, yStartNewPage, bottomMargin, tableWidth,
                        margin, doc, myPage, true, drawContent);
        float defaultRowHeight = 24f;
        Row<PDPage> headerRow = table.createRow(30f);
        Cell<PDPage> cell = headerRow.createCell(100,
                "(to be irrevocably bound by the SMEs’ Terms and Conditions, the relevant Transaction Documents and<br>" +
                        "<br>Security Documents (including, without limitation, the Deed of Guarantee, Deed of Corporate Guarantee<br>" +
                        "<br>and Security Deed, where applicable, attached herein and understand that these will apply to this Facility;" +
                        ")<br>");
        cell.setTopBorderStyle(null);
        cell.setBottomBorderStyle(null);
        cell.setLeftBorderStyle(null);
        cell.setRightBorderStyle(null);
        table.addHeaderRow(headerRow);
        Row<PDPage> headerRow1 = table.createRow(defaultRowHeight);
        cell = headerRow1.createCell(100,
                " (that the Funded Amount will not be disbursed to us until and unless we duly execute, or arrange to be<br>" +
                        "<br>duly executed, and deliver to Validus the relevant security documents or guarantees (including, without<br>" +
                        "<br>limitation, those set out above) which Validus requires us to execute (or arrange to be executed) and<br>" +
                        "<br>deliver;)<br>");
        cell.setTopBorderStyle(null);
        cell.setBottomBorderStyle(null);
        cell.setLeftBorderStyle(null);
        cell.setRightBorderStyle(null);
        table.addHeaderRow(headerRow1);
        Row<PDPage> headerRow2 = table.createRow(defaultRowHeight);
        cell = headerRow2.createCell(100,
                " (that the Funded Amount once disbursed to us by Validus as agent for certain Investors shall constitute a<br>" +
                        "<br>debt owing by us to Validus as agent for such Investors, with such debt being due in accordance with the<br>" +
                        "<br>above, the SMEs’ Terms and Conditions;)<br>");
        cell.setTopBorderStyle(null);
        cell.setBottomBorderStyle(null);
        cell.setLeftBorderStyle(null);
        cell.setRightBorderStyle(null);
        table.addHeaderRow(headerRow2);
        Row<PDPage> headerRow3 = table.createRow(defaultRowHeight);
        cell = headerRow3.createCell(100,
                "(that this is not a committed facility;)<br>");
        cell.setTopBorderStyle(null);
        cell.setBottomBorderStyle(null);
        cell.setLeftBorderStyle(null);
        cell.setRightBorderStyle(null);
        table.addHeaderRow(headerRow3);

        Row<PDPage> headerRow4 = table.createRow(defaultRowHeight);
        cell = headerRow4.createCell(100,
                "(that Validus may apply the Funded Amount in satisfaction of any other Facility the SME has with Validus<br>" +
                        "<br>as agent for Investors such that the actual amount received by us is less than the Funded Amount and<br>");
        cell.setTopBorderStyle(null);
        cell.setBottomBorderStyle(null);
        cell.setLeftBorderStyle(null);
        cell.setRightBorderStyle(null);
        table.addHeaderRow(headerRow4);
        table.draw();
    }

    private void createFourthContent(PDPageContentStream cont, float width, PDType1Font font) throws IOException {

        Paragraph paragraph = new Paragraph();
  /*  String text =
            "Các thuật ngữ được định nghĩa và các nguyên tắc được diễn giải tại Các Điều Khoản Và Điều Kiện Của Các\n" +
                    "SME sẽ có cùng ý nghĩa và hiệu lực khi được sử dụng trong Đơn Đăng Ký Vay này, trừ khi được định\n" +
                    "nghĩa khác đi theo Đơn Đăng Ký Vay này.";

    paragraph.addParagraph(cont, width, 0, -12, text, true, font);*/
        String text = "notwithstanding this deduction, we remain liable to repay the full Funded Amount (including applicable" +
                "interests);)";
        paragraph.addParagraph(cont, width, 0, -12, text, true, font);
        text =
                "(That this Facility Request is deemed to be a legal binding offer made by us, to certain (unidentified)" +
                        "Investors for either subsequent entire or partial funding for our offered Funded Amount, by way of" +
                        "submission of their Investment Commitments;)";
        paragraph.addParagraph(cont, width, 0, -12, text, true, font);
        text =
                "(That any Investment Commitment submitted by any Investor for its partial or entire funding, shall be" +
                        "treated as an acceptance made by such Investor and that a lending transaction between us and such" +
                        "Investor is executed. We however acknowledge and agree that such lending transaction may only take" +
                        "effect, together with the other lending transactions between the other Investors and us (if any), when the" +
                        "total amount of all Investment Commitments is equal to the Funded Amount requested;)";
        paragraph.addParagraph(cont, width, 0, -12, text, true, font);
        text =
                "(That the effective date of the lending transaction between us and the relevant Investors is the date of a" +
                        "notice of validation delivered to us by Validus as agent for such Investors, provided that the condition for" +
                        "effectiveness as mentioned at Item 7 above is satisfied; and)";
        paragraph.addParagraph(cont, width, 0, -12, text, true, font);
        text =
                "(to make payment of such debt in accordance to this Facility Request and upon receipt of a written" +
                        "demand by Validus acting as agent for such Investors, at any time in accordance with the terms above," +
                        "the SMEs’ Terms and Conditions.)";
        paragraph.addParagraph(cont, width, 0, -12, text, true, font);
        text =
                "(that if the maturity date of the aforesaid facility falls on a non-banking day, we will commit to make full" +
                        "repayment by the following banking day including additional accrued interest till the following banking" +
                        "day.)";
        paragraph.addParagraph(cont, width, 0, -12, text, true, font);
        text =
                "(We confirm):";
        paragraph.addParagraph(cont, width, 0, -12, text, true, font);
    }

    private void drawPageFirstTable(PDDocument doc, PDPage myPage) throws IOException {

        float margin = 75;
        float yStartNewPage = myPage.getMediaBox().getHeight() - (2 * margin);
        // we want table across whole page width (subtracted by left and right margin ofcourse)
        float tableWidth = myPage.getMediaBox().getWidth() - (2 * margin);

        boolean drawContent = true;
        float yStart = yStartNewPage;
        float bottomMargin = 70;
        // y position is your coordinate of top left corner of the table
        float yPosition = 300;

        BaseTable table =
                new BaseTable(yPosition, yStartNewPage, bottomMargin, tableWidth,
                        margin, doc, myPage, true, drawContent);

        float defaultRowHeight = 28f;

        Row<PDPage> headerRow = table.createRow(defaultRowHeight);
        Cell<PDPage> cell = headerRow.createCell(50, "(Facility ID):");
        //        cell.setBorderStyle(null);
        cell.setValign(VerticalAlignment.MIDDLE);
        cell = headerRow.createCell(50, "<b><123></b>");
        cell.setValign(VerticalAlignment.MIDDLE);
        table.addHeaderRow(headerRow);
        Row<PDPage> headerRow1 = table.createRow(defaultRowHeight);
        cell = headerRow1.createCell(50, "(Name of SME):");
        //        cell.setBorderStyle(null);
        cell.setValign(VerticalAlignment.MIDDLE);
        cell = headerRow1.createCell(50, "<CONG TY CP ABC>");
        cell.setValign(VerticalAlignment.MIDDLE);
        table.addHeaderRow(headerRow1);
        Row<PDPage> headerRow2 = table.createRow(defaultRowHeight);
        cell = headerRow2.createCell(50, "(Business" +
                "Registration Number):");
        cell.setValign(VerticalAlignment.MIDDLE);
        cell = headerRow2.createCell(50, "<1231231231>");
        cell.setValign(VerticalAlignment.MIDDLE);
        table.addHeaderRow(headerRow2);
        Row<PDPage> headerRow3 = table.createRow(defaultRowHeight);
        cell = headerRow3.createCell(100, "(Type of Facility Application):");
        table.addHeaderRow(headerRow3);
        table.draw();
    }

}
